package patternsdemo.l3_abstractfactory.factory.interfaces;


import patternsdemo.l3_abstractfactory.transport.interfaces.Aircraft;
import patternsdemo.l3_abstractfactory.transport.interfaces.Car;

// фабрика по созданию транспортных средств
public interface TransportFactory {
    
    // что фабрика будет производить
    
    Car createCar();// автомобили
    
    Aircraft createAircraft(); // самолеты

}
