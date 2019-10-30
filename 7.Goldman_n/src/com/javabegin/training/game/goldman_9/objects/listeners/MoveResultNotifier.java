package com.javabegin.training.game.goldman_9.objects.listeners;


import com.javabegin.training.game.goldman_9.abstracts.AbstractMovingObject;
import com.javabegin.training.game.goldman_9.enums.ActionResult;

import java.util.List;

public interface MoveResultNotifier {
    
    List<MoveResultListener> getMoveListeners();

    void addMoveListener(MoveResultListener listener);

    public void removeMoveListener(MoveResultListener listener);

    public void removeAllLMoveisteners();

    public void notifyMoveListeners(ActionResult actionResult, AbstractMovingObject abstractMovingObject);

}
