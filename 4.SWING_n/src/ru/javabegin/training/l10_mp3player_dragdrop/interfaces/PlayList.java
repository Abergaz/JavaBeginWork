package ru.javabegin.training.l10_mp3player_dragdrop.interfaces;

import java.io.File;

/**
 * Интерфейс для действий с плейлистом в плеере
 * lstPlayList типа JList
 */
public interface PlayList {

    void next();

    void prev();
    
    void delete();
    
    void clear();

    boolean search(String name);

    boolean savePlaylist(File file);

    boolean openFiles(File[] files);
    
    boolean openPlayList(File file);

    //проигрывание файла/песни из плейлиста
    void playFile();    

}
