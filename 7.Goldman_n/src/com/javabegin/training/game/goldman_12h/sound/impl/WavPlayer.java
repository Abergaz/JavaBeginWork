package com.javabegin.training.game.goldman_12h.sound.impl;


import com.javabegin.training.game.goldman_12h.enums.ActionResult;
import com.javabegin.training.game.goldman_12h.gameobjects.abstracts.AbstractMovingObject;
import com.javabegin.training.game.goldman_12h.listeners.interfaces.MoveResultListener;
import com.javabegin.training.game.goldman_12h.sound.interfaces.SoundObject;
import com.javabegin.training.game.goldman_12h.sound.interfaces.SoundPlayer;

import javax.sound.sampled.*;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class WavPlayer implements MoveResultListener, SoundPlayer {

    public static final String SOUND_BACKGROUND = "background.wav";
    public static final String SOUND_DIE = "die.wav";
    public static final String SOUND_TREASURE = "treasure.wav";
    public static final String SOUND_WIN = "win.wav";
    public static final String SOUND_MOVE = "waka_waka.wav";
    public static final String SOUND_TREE = "tree.wav";
    
    public static final String SOUND_PATH = "/com/javabegin/training/game/goldman_12h/sound/files/";
    private Clip backGroundClip;
    
    public WavPlayer() {

        AudioInputStream ais = null;
        try {
            backGroundClip = AudioSystem.getClip();
            ais = AudioSystem.getAudioInputStream(this.getClass().getResource(WavPlayer.SOUND_PATH + SOUND_BACKGROUND));
            backGroundClip.open(ais);

        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(WavPlayer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(WavPlayer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (LineUnavailableException ex) {
            Logger.getLogger(WavPlayer.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public void startBackgroundMusic(String soundName) {
        playSound(backGroundClip, true);
    }

    @Override
    public void stopBackgoundMusic() {
        if (backGroundClip != null && backGroundClip.isRunning()) {
            backGroundClip.stop();
        }

    }

    @Override
    public void notifyActionResult(ActionResult actionResult, final AbstractMovingObject abstractMovingObject) {

        if (!(abstractMovingObject instanceof SoundObject)) {
            return;
        }


        SoundObject soundObject = (SoundObject) abstractMovingObject;

        Clip clip = soundObject.getSoundClip(actionResult);

        playSound(clip, false);

    }

    @Override
    public void playSound(final Clip clip, final boolean loop) {

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {

                if (clip == null) {
                    return;
                }

                clip.setFramePosition(0);
                
                if (loop) {
                    clip.loop(Clip.LOOP_CONTINUOUSLY);
                } else {
                    if (clip.isRunning()) {
                        clip.stop();
                    }
                    
                    clip.start();
                }


            }
        });
        
        thread.setDaemon(true);       
        thread.start();


    }
    
    
}
