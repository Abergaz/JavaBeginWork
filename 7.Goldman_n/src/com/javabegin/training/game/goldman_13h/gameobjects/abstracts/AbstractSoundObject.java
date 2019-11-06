package com.javabegin.training.game.goldman_13h.gameobjects.abstracts;

import com.javabegin.training.game.goldman_13h.sound.impl.WavPlayer;
import com.javabegin.training.game.goldman_13h.sound.interfaces.SoundObject;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;


public abstract class AbstractSoundObject extends AbstractMovingObject implements SoundObject {

    private transient Clip dieClip;    

    public Clip getDieClip() {
        if (dieClip==null){
            setDieClip();
        }
        return dieClip;
    }
    
    
    protected Clip openClip(String soundName) {
        try {
            Clip clip = AudioSystem.getClip();
            AudioInputStream ais = AudioSystem.getAudioInputStream(this.getClass().getResource(WavPlayer.SOUND_PATH + soundName));
            clip.open(ais);
            return clip;
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(AbstractSoundObject.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AbstractSoundObject.class.getName()).log(Level.SEVERE, null, ex);
        } catch (LineUnavailableException ex) {
            Logger.getLogger(AbstractSoundObject.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
        return null;
    }

    private void setDieClip() {
        dieClip = openClip(WavPlayer.SOUND_DIE);
    }
   
    
}
