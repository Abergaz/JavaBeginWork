package com.javabegin.training.game.goldman_14h.listeners.interfaces;

import com.javabegin.training.game.goldman_14h.enums.ActionResult;
import com.javabegin.training.game.goldman_14h.gameobjects.abstracts.AbstractGameObject;

import java.util.List;


public interface MoveResultNotifier {
    
    List<MoveResultListener> getMoveListeners();

    void addMoveListener(MoveResultListener listener);

    public void removeMoveListener(MoveResultListener listener);

    public void removeAllMoveListeners();

    public void notifyMoveListeners(ActionResult actionResult, AbstractGameObject movingObject, AbstractGameObject targetObject);

}
