package ru.javabegin.training.l9_mp3player_oop.interfaces;

public interface PlayControlListener {
    
    void playStarted(String name);
    
    void processScroll(int position);
    
    void playFinished();
    
}
