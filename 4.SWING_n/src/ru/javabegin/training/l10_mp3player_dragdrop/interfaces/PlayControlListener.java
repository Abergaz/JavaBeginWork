package ru.javabegin.training.l10_mp3player_dragdrop.interfaces;

/**
 * интерфейс слушателя для отслеживания прогирывания песни
 */
public interface PlayControlListener {

    /**
     *  началось проигрыание
     */
    void playStarted(String name);

    /**
     * изменилось позиция проигрывания
     */
    void processScroll(int position);

    /**
     *  кончилось проигрыание
     */
    void playFinished();
    
}
