package com.javabegin.training.game.goldman_12.sound.interfaces;

import javax.sound.sampled.Clip;


public interface SoundPlayer {

    void startBackgroundMusic(String soundName);

    void stopBackgoundMusic();

    void playSound(Clip clip, boolean loop);
   
    
}
