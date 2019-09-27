package patternsdemo.l4_decorator.decorators.impl;


import patternsdemo.l4_decorator.decorators.abstracts.Decorator;
import patternsdemo.l4_decorator.interfaces.Component;

public class BorderDecorator extends Decorator {

    public BorderDecorator(Component component) {
        super(component);
    }

    @Override
    public void afterDraw() {
        System.out.println(" ... add border");
    }

   
}
