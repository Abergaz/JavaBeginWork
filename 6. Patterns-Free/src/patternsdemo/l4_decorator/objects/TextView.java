package patternsdemo.l4_decorator.objects;


import patternsdemo.l4_decorator.interfaces.Component;

public class TextView implements Component {

    @Override
    public void draw() {
        System.out.println("draw textview");
    }
    
    

}