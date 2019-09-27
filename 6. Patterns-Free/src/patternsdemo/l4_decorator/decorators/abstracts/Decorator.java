package patternsdemo.l4_decorator.decorators.abstracts;


import patternsdemo.l4_decorator.interfaces.Component;

public abstract class Decorator implements Component {
    
    protected Component component;
    
    public Decorator (Component component) {
        this.component = component;
    }
    
    public abstract void afterDraw();

    @Override
    public void draw() {
        component.draw();
        afterDraw();
    }
    
}
