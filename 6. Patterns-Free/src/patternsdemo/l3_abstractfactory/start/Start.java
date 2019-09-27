package patternsdemo.l3_abstractfactory.start;


import patternsdemo.l3_abstractfactory.factory.impl.RussianFactory;
import patternsdemo.l3_abstractfactory.factory.impl.USAFactory;
import patternsdemo.l3_abstractfactory.factory.interfaces.TransportFactory;

public class Start {
    
    private static TransportFactory factory;
    
    public static void main(String[] args) {
      
        if (true){
            factory = new RussianFactory();
        }else{
            factory = new USAFactory();
        }
        
        
        factory.createAircraft();
        factory.createCar();
        
        
    }

}
