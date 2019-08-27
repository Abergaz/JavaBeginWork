package ru.javabegin.training.l9_mp3player_oop.interfaces;

public interface Player {

    void play(String fileName);

    void stop();

    void pause();

    void setVolume(double value);

    void jump(double controlPosition);
    
}
