package com.javabegin.training.game.goldman_11.listeners.interfaces;


import com.javabegin.training.game.goldman_11.enums.ActionResult;
import com.javabegin.training.game.goldman_11.gameobjects.abstracts.AbstractMovingObject;

import java.util.List;

public interface MoveResultNotifier {
    
    List<MoveResultListener> getMoveListeners();

    void addMoveListener(MoveResultListener listener);

    public void removeMoveListener(MoveResultListener listener);

    public void removeAllLMoveisteners();

    public void notifyMoveListeners(ActionResult actionResult, AbstractMovingObject abstractMovingObject);

}
