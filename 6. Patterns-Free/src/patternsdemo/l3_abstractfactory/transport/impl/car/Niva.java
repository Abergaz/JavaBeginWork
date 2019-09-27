package patternsdemo.l3_abstractfactory.transport.impl.car;


import patternsdemo.l3_abstractfactory.transport.interfaces.Car;

public class Niva implements Car {

    @Override
    public void drive() {
        System.out.println("Niva drive");
    }

    @Override
    public void stop() {
        System.out.println("Niva stopped");
    }
    
}
