package com.javabegin.training.game.goldman_12h.collections.abstracts;

import java.util.ArrayList;
import java.util.List;
import com.javabegin.training.game.goldman_12h.collections.interfaces.GameCollection;
import com.javabegin.training.game.goldman_12h.listeners.interfaces.MoveResultListener;
import com.javabegin.training.game.goldman_12h.listeners.interfaces.MoveResultNotifier;


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
