package patternsdemo.l3_abstractfactory.transport.impl.aircraft;


import patternsdemo.l3_abstractfactory.transport.interfaces.Aircraft;

public class Boeing747 implements Aircraft {

    @Override
    public void flight() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
