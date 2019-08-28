package ru.javabegin.training.l10_mp3player_dragdrop.interfaces;

/**
 * Интерфейс для работы плеера и управления проигрыванием песни
 */
public interface Player {

    void play(String fileName);

    void stop();

    void pause();

    void setVolume(double value);

    void jump(double controlPosition);
    
}
