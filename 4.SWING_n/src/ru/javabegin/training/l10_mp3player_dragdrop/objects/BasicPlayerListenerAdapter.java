package ru.javabegin.training.l10_mp3player_dragdrop.objects;

import java.util.Map;
import javazoom.jlgui.basicplayer.BasicController;
import javazoom.jlgui.basicplayer.BasicPlayerEvent;
import javazoom.jlgui.basicplayer.BasicPlayerListener;


/**
 *  класс-адаптер, чтобы в анонимных классах переопределять только нужные методы
 *  реализует интфейс слушателя плеера из jlGUI
 */

public class BasicPlayerListenerAdapter implements BasicPlayerListener{


    @Override
    public void opened(Object o, Map map) {
        
    }

    @Override
    public void progress(int i, long l, byte[] bytes, Map map) {
        
    }

    @Override
    public void stateUpdated(BasicPlayerEvent bpe) {
      
    }

    @Override
    public void setController(BasicController bc) {
        
    }

}