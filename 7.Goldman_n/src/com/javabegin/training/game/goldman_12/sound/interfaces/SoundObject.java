package com.javabegin.training.game.goldman_12.sound.interfaces;


import com.javabegin.training.game.goldman_12.enums.ActionResult;

import javax.sound.sampled.Clip;

public interface SoundObject {

    Clip getSoundClip(ActionResult actionResult);
    
}
