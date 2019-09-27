package patternsdemo.l3_abstractfactory.factory.impl;


import patternsdemo.l3_abstractfactory.factory.interfaces.TransportFactory;
import patternsdemo.l3_abstractfactory.transport.impl.aircraft.TU134;
import patternsdemo.l3_abstractfactory.transport.impl.car.Niva;
import patternsdemo.l3_abstractfactory.transport.interfaces.Aircraft;
import patternsdemo.l3_abstractfactory.transport.interfaces.Car;

// российские транспортные средства
public class RussianFactory implements TransportFactory {

    @Override
    public Car createCar() {
        return new Niva();
    }

    @Override
    public Aircraft createAircraft() {
        return new TU134();
    }

}
