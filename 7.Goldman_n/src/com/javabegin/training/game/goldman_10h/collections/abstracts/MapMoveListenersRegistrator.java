package com.javabegin.training.game.goldman_10h.collections.abstracts;


import com.javabegin.training.game.goldman_10h.collections.interfaces.GameCollection;
import com.javabegin.training.game.goldman_10h.listeners.interfaces.MoveResultListener;
import com.javabegin.training.game.goldman_10h.listeners.interfaces.MoveResultNotifier;

import java.util.ArrayList;
import java.util.List;

public abstract class MapMoveListenersRegistrator implements GameCollection, MoveResultNotifier {

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
