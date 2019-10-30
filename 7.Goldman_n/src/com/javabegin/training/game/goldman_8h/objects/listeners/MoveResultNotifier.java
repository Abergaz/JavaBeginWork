package com.javabegin.training.game.goldman_8h.objects.listeners;


import com.javabegin.training.game.goldman_8h.enums.ActionResult;
import com.javabegin.training.game.goldman_8h.objects.GoldMan;

import java.util.List;

public interface MoveResultNotifier {
    
    List<MoveResultListener> getMoveListeners();

    void addMoveListener(MoveResultListener listener);

    public void removeMoveListener(MoveResultListener listener);

    public void removeAllLMoveisteners();

    public void notifyMoveListeners(ActionResult actionResult, GoldMan goldMan);

}
