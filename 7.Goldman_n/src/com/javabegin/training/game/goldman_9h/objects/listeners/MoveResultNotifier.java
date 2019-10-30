package com.javabegin.training.game.goldman_9h.objects.listeners;


import com.javabegin.training.game.goldman_9h.abstracts.AbstractMovingObject;
import com.javabegin.training.game.goldman_9h.enums.ActionResult;

import java.util.List;

public interface MoveResultNotifier {
    
    List<MoveResultListener> getMoveListeners();

    void addMoveListener(MoveResultListener listener);

    public void removeMoveListener(MoveResultListener listener);

    public void removeAllLMoveisteners();

    public void notifyMoveListeners(ActionResult actionResult, AbstractMovingObject abstractMovingObject);

}
