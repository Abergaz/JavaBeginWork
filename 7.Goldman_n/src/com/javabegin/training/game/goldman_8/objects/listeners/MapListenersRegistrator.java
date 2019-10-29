package com.javabegin.training.game.goldman_8.objects.listeners;


import com.javabegin.training.game.goldman_8.interfaces.gamemap.collections.GameCollection;

import java.util.ArrayList;
import java.util.List;

public abstract class MapListenersRegistrator implements GameCollection {

    private ArrayList<MoveResultListener> listeners = new ArrayList<>();

    @Override
    public List<MoveResultListener> getMoveListeners() {
        return listeners;
    }

    @Override
    public void addMoveListener(MoveResultListener listener) {
        listeners.add(listener);
    }

    @Override
    public void removeMoveListener(MoveResultListener listener) {
        listeners.remove(listener);
    }

    @Override
    public void removeAllLMoveisteners() {
        listeners.clear();
    }

 
    
}
