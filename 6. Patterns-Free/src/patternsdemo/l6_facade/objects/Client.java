package patternsdemo.l6_facade.objects;


import patternsdemo.l6_facade.facade.CarFacade;
import patternsdemo.l6_facade.parts.Door;
import patternsdemo.l6_facade.parts.Wheel;
import patternsdemo.l6_facade.parts.Zazhiganie;

public class Client {

    public static void main(String[] args) {
        // вызов без фасада
        Door door = new Door();
        door.open();

        Zazhiganie zazhiganie = new Zazhiganie();
        zazhiganie.fire();
        
        Wheel wheel = new Wheel();
        wheel.turn();
        

        // вызов с фасадом
        CarFacade carFacade = new CarFacade();
        carFacade.go();



    }
}
