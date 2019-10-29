package com.javabegin.training.game.goldman_8.objects.listeners;


import com.javabegin.training.game.goldman_8.enums.ActionResult;
import com.javabegin.training.game.goldman_8.objects.GoldMan;

import java.util.List;

public interface MoveResultNotifier {
    
    List<MoveResultListener> getMoveListeners();

    void addMoveListener(MoveResultListener listener);

    public void removeMoveListener(MoveResultListener listener);

    public void removeAllLMoveisteners();

    public void notifyMoveListeners(ActionResult actionResult, GoldMan goldMan);

}
