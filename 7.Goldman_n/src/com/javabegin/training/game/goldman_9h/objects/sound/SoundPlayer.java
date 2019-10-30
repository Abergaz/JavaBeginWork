package com.javabegin.training.game.goldman_9h.objects.sound;


public interface SoundPlayer {

    void startBackgroundMusic(String soundName);

    void stopBackgoundMusic();

    void playSound(String name, final boolean loop);
   
    
}
