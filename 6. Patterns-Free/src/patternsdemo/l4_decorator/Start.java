package patternsdemo.l4_decorator;


import patternsdemo.l4_decorator.decorators.impl.BorderDecorator;
import patternsdemo.l4_decorator.interfaces.Component;
import patternsdemo.l4_decorator.objects.Button;
import patternsdemo.l4_decorator.objects.TextView;
import patternsdemo.l4_decorator.objects.Window;

public class Start {
    
    private static Component window;
    private static Component textView;
    private static Component button;
    
    public static void main(String[] args) {
        
        
        boolean showBorder = true;
        
        if (!showBorder){
            window = new Window();
            textView = new TextView();
            button = new Button();
        }else{
            window = new BorderDecorator(new Window());
            textView = new BorderDecorator(new TextView());
            button = new BorderDecorator(new Button());
        }
        
        
        window.draw();
        textView.draw();
        button.draw();
        
        
    }

}
