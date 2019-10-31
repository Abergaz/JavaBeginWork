package com.javabegin.training.game.goldman_11h.sound.interfaces;


import com.javabegin.training.game.goldman_11h.enums.ActionResult;

import javax.sound.sampled.Clip;

public interface SoundObject {

    Clip getSoundClip(ActionResult actionResult);
    
}
