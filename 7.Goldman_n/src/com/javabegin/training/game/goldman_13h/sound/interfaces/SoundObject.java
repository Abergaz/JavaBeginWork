package com.javabegin.training.game.goldman_13h.sound.interfaces;

import com.javabegin.training.game.goldman_13h.enums.ActionResult;

import javax.sound.sampled.Clip;

public interface SoundObject {

    Clip getSoundClip(ActionResult actionResult);
    
}
