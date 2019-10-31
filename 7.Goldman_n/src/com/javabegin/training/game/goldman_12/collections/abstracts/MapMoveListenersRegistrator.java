package com.javabegin.training.game.goldman_12.collections.abstracts;


import com.javabegin.training.game.goldman_12.collections.interfaces.GameCollection;
import com.javabegin.training.game.goldman_12.listeners.interfaces.MoveResultListener;
import com.javabegin.training.game.goldman_12.listeners.interfaces.MoveResultNotifier;

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
    public void removeAllMoveListeners() {
        listeners.clear();
    }

}
