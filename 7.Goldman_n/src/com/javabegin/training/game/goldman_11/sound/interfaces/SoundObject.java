package com.javabegin.training.game.goldman_11.sound.interfaces;


import com.javabegin.training.game.goldman_11.enums.ActionResult;

import javax.sound.sampled.Clip;

public interface SoundObject {

    Clip getSoundClip(ActionResult actionResult);
    
}
