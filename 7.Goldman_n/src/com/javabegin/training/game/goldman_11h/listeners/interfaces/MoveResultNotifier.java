package com.javabegin.training.game.goldman_11h.listeners.interfaces;


import com.javabegin.training.game.goldman_11h.enums.ActionResult;
import com.javabegin.training.game.goldman_11h.gameobjects.abstracts.AbstractMovingObject;

import java.util.List;

public interface MoveResultNotifier {
    
    List<MoveResultListener> getMoveListeners();

    void addMoveListener(MoveResultListener listener);

    public void removeMoveListener(MoveResultListener listener);

    public void removeAllLMoveisteners();

    public void notifyMoveListeners(ActionResult actionResult, AbstractMovingObject abstractMovingObject);

}
