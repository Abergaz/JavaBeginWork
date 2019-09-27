package patternsdemo.l4_decorator.decorators.impl;


import patternsdemo.l4_decorator.decorators.abstracts.Decorator;
import patternsdemo.l4_decorator.interfaces.Component;

public class ColorDecorator extends Decorator {

    public ColorDecorator(Component component) {
        super(component);
    }

    @Override
    public void afterDraw() {
        System.out.println("... added color");
    }

}
