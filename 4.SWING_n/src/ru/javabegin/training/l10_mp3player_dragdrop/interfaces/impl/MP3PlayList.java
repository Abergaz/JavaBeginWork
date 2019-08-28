package ru.javabegin.training.l10_mp3player_dragdrop.interfaces.impl;

import ru.javabegin.training.l10_mp3player_dragdrop.gui.JListDropHandler;
import ru.javabegin.training.l10_mp3player_dragdrop.interfaces.PlayList;
import ru.javabegin.training.l10_mp3player_dragdrop.interfaces.Player;
import ru.javabegin.training.l10_mp3player_dragdrop.objects.MP3;
import ru.javabegin.training.l10_mp3player_dragdrop.utils.FileUtils;

import java.awt.dnd.DnDConstants;
import java.awt.dnd.DropTarget;
import java.awt.dnd.DropTargetListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.ArrayList;
import java.util.TooManyListenersException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JList;

/**
 * плейлист на основе компонента JList
 */
public class MP3PlayList implements PlayList {

    public static final String PLAYLIST_FILE_EXTENSION = "pls";//фильтр для расширения файлов отображаемых в диалоге выбора файлов
    public static final String PLAYLIST_FILE_DESCRIPTION = "Файлы плейлиста";//описание выбираемых файлов отображаемых в диалоге выбора файлов

    private static final String EMPTY_STRING = "";

    private Player player; //плееер

    private JList playlist; // плейлист типа JList из фрейма
    private DefaultListModel model = new DefaultListModel();//дефолтная модель данных для элемента JList

    public MP3PlayList(JList playlist, Player player) {
        this.playlist = playlist;
        this.player = player;
        initDragDrop();
        initPlayList();
    }

    /**
     * переход к следлующей песне плейлиста
     */
    @Override
    public void next() {
        int nextIndex = playlist.getSelectedIndex() + 1;
        if (nextIndex <= model.getSize() - 1) {// если не вышли за пределы плейлиста
            playlist.setSelectedIndex(nextIndex);
            playFile();
        }
    }

    /**
     * переход к предыдущей песне плейлиста
     */
    @Override
    public void prev() {
        int nextIndex = playlist.getSelectedIndex() - 1;
        if (nextIndex >= 0) {// если не вышли за пределы плейлиста
            playlist.setSelectedIndex(nextIndex);
            playFile();
        }
    }

    /**
     * поиск песни в плей листе
     */
    @Override
    public boolean search(String name) {

        // если в поиске ничего не ввели - выйти из метода и не производить поиск
        if (name == null || name.trim().equals(EMPTY_STRING)) {
            return false;
        }

        // все индексы объектов, найденных по поиску, будут храниться в коллекции
        ArrayList<Integer> mp3FindedIndexes = new ArrayList<Integer>();

        // проходим по коллекции и ищем соответствия имен песен со строкой поиска
        for (int i = 0; i < model.getSize(); i++) {
            MP3 mp3 = (MP3) model.getElementAt(i);
            // поиск вхождения строки в название песни без учета регистра букв
            if (mp3.getName().toUpperCase().contains(name.toUpperCase())) {
                mp3FindedIndexes.add(i);// найденный индексы добавляем в коллекцию
            }
        }

        // коллекцию индексов сохраняем в массив
        int[] selectIndexes = new int[mp3FindedIndexes.size()];

        if (selectIndexes.length == 0) {// если не найдено ни одной песни, удовлетворяющей условию поиска
            return false;
        }
        // преобразовать коллекцию в массив, т.к. метод для выделения строк в JList работает только с массивом
        for (int i = 0; i < selectIndexes.length; i++) {
            selectIndexes[i] = mp3FindedIndexes.get(i).intValue();
        }

        // выделить в плелисте найдные песни по массиву индексов, найденных ранее
        playlist.setSelectedIndices(selectIndexes);

        return true;
    }
    /**
     * сохранить плей лист в файл
     */
    @Override
    public boolean savePlaylist(File file) {
        try {
            String fileExtension = FileUtils.getFileExtension(file);

            // имя файла (нужно ли добавлять раширение к имени файлу при сохранении)
            String fileNameForSave = (fileExtension != null && fileExtension.equals(PLAYLIST_FILE_EXTENSION)) ? file.getPath() : file.getPath() + "." + PLAYLIST_FILE_EXTENSION;

            FileUtils.serialize(model, fileNameForSave);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    /**
     * дабавить файлы в плей лист
     */
    @Override
    public boolean openFiles(File[] files) {

        boolean status = false;

        for (File file : files) {
            MP3 mp3 = new MP3(file.getName(), file.getPath());

            // если эта песня уже есть в списке - не добавлять ее
            if (!model.contains(mp3)) {
                model.addElement(mp3);
                status = true;
            }
        }

        return status;
    }

    /**
     * проиграть текущую песню
     */
    @Override
    public void playFile() {
        int[] indexPlayList = playlist.getSelectedIndices();// получаем выбранные индексы(порядковый номер) песен из поля playlist
        if (indexPlayList.length > 0) {// если выбрали хотя бы одну песню
            Object selectedItem = model.getElementAt(indexPlayList[0]);
            if (!(selectedItem instanceof MP3)) {
                return;
            }
            MP3 mp3 = (MP3) selectedItem;// находим первую выбранную песню (т.к. несколько песен нельзя проиграть одновременно
            player.play(mp3.getPath());
        }

    }

    /**
     * открыть плейлист их файла
     */
    @Override
    public boolean openPlayList(File file) {
        try {
            DefaultListModel mp3ListModel = (DefaultListModel) FileUtils.deserialize(file.getPath());
            this.model = mp3ListModel;
            playlist.setModel(mp3ListModel);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    /**
     * удалить песни из плейлиста
     */
    @Override
    public void delete() {
        int[] indexPlayList = playlist.getSelectedIndices();// получаем выбранные индексы(порядковый номер) песен

        if (indexPlayList.length > 0) {// если выбрали хотя бы одну песню

            ArrayList<MP3> mp3ListForRemove = new ArrayList<MP3>();// сначала сохраняем все mp3 для удаления в отдельную коллекцию

            for (int i = 0; i < indexPlayList.length; i++) {// удаляем все выбранные песни из плейлиста
                MP3 mp3 = (MP3) model.getElementAt(indexPlayList[i]);
                mp3ListForRemove.add(mp3);
            }

            // удаляем mp3 в плейлисте
            for (MP3 mp3 : mp3ListForRemove) {
                model.removeElement(mp3);
            }

        }
    }

    /**
     * очистить плей лист
     */
    @Override
    public void clear() {
        model.clear();
    }

    /**
     * инициализировть плей лист
     */
    private void initPlayList() {

        playlist.setModel(model);// устанавливаем модель для полу playlist типа JList
        playlist.setToolTipText("Список песен"); //всплывающая подскаска при наведении на поле playlist

        //добавляем слушателя событий мыши для поля playlist типа JList
        playlist.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                // если нажали левую кнопку мыши 2 раза
                if (evt.getModifiers() == InputEvent.BUTTON1_MASK && evt.getClickCount() == 2) {
                    playFile();
                }
            }
        });

        //добавляем слушателя событий клавитуры для поля playlist типа JList
        playlist.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyPressed(java.awt.event.KeyEvent evt) {
                int key = evt.getKeyCode();
                if (key == KeyEvent.VK_ENTER) {
                    playFile();
                }
            }
        });
    }

    private DropTarget dropTarget; //элемент для перетаскивания из стандартной библиотки awt

    private void initDragDrop() {

        try {
            dropTarget = new DropTarget(playlist, DnDConstants.ACTION_COPY_OR_MOVE, null); //связыаем поле playlist типа JList с DropTarget
            dropTarget.addDropTargetListener(new JListDropHandler(playlist)); //устанавливанем слушателя событий для перетаскивания

        } catch (TooManyListenersException ex) {
            Logger.getLogger(MP3PlayList.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
