package ru.javabegin.training.l10_mp3player_dragdrop.utils;

import java.io.File;
import javax.swing.filechooser.FileFilter;

/**
 *  фильтр для возможности выбора файлов только с раширением mp3 для компонента FileChooser
 */
public class PlaylistFileFilter extends FileFilter {
    
    private final String fileExtension;//расширение файла
    private final String fileDescription;//описание файла

    public PlaylistFileFilter(String fileExtension, String fileDescription) {
        this.fileExtension = fileExtension;
        this.fileDescription = fileDescription;
    }
  
    @Override
    public boolean accept(File file) {// Разрешить только папки, а также файлы с расширением mp3 или pst
        return file.isDirectory() || file.getAbsolutePath().endsWith(fileExtension);
    }   

    @Override
    public String getDescription() {// описание для формата mp3 или зые при выборе в диалоговом окне
        return fileDescription+" (*."+fileExtension+")";
    }
}
