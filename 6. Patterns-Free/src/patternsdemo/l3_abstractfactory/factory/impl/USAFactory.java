package patternsdemo.l3_abstractfactory.factory.impl;


import patternsdemo.l3_abstractfactory.factory.interfaces.TransportFactory;
import patternsdemo.l3_abstractfactory.transport.impl.aircraft.Boeing747;
import patternsdemo.l3_abstractfactory.transport.impl.car.Porsche;
import patternsdemo.l3_abstractfactory.transport.interfaces.Aircraft;
import patternsdemo.l3_abstractfactory.transport.interfaces.Car;

// американские транспортные средства
public class USAFactory implements TransportFactory {

    @Override
    public Car createCar() {
        return new Porsche();
    }

    @Override
    public Aircraft createAircraft() {
        return new Boeing747();
    }

}
