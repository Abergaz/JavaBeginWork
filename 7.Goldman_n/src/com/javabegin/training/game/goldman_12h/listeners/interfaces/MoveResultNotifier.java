package com.javabegin.training.game.goldman_12h.listeners.interfaces;

import com.javabegin.training.game.goldman_12h.enums.ActionResult;
import com.javabegin.training.game.goldman_12h.gameobjects.abstracts.AbstractMovingObject;

import java.util.List;


public interface MoveResultNotifier {
    
    List<MoveResultListener> getMoveListeners();

    void addMoveListener(MoveResultListener listener);

    public void removeMoveListener(MoveResultListener listener);

    public void removeAllMoveListeners();

    public void notifyMoveListeners(ActionResult actionResult, AbstractMovingObject abstractMovingObject);

}
