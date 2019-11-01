package com.javabegin.training.game.goldman_14h.sound.interfaces;

import com.javabegin.training.game.goldman_14h.enums.ActionResult;

import javax.sound.sampled.Clip;


public interface SoundObject {

    Clip getSoundClip(ActionResult actionResult);
    
}
