package ru.javabegin.training.l10_mp3player_dragdrop.interfaces;

public interface Player {

    void play(String fileName);

    void stop();

    void pause();

    void setVolume(double value);

    void jump(double controlPosition);
    
}
