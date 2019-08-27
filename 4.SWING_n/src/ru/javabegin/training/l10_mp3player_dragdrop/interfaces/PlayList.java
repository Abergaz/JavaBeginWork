package ru.javabegin.training.l10_mp3player_dragdrop.interfaces;

import java.io.File;

public interface PlayList {

    void next();

    void prev();
    
    void delete();
    
    void clear();

    boolean search(String name);

    boolean savePlaylist(File file);

    boolean openFiles(File[] files);
    
    boolean openPlayList(File file);
    
    void playFile();    

}
