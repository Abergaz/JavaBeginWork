package ru.javabegin.training.l10_mp3player_dragdrop.interfaces;

public interface PlayControlListener {
    
    void playStarted(String name);
    
    void processScroll(int position);
    
    void playFinished();
    
}
