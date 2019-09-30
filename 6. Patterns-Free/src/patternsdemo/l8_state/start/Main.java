package patternsdemo.l8_state.start;


import patternsdemo.l8_state.context.TransformerContext;
import patternsdemo.l8_state.state.FireState;
import patternsdemo.l8_state.state.MoveState;
import patternsdemo.l8_state.state.TransformerState;

public class Main {

    public static void main(String[] args) {

        TransformerContext context = new TransformerContext();
        
        TransformerState stateMove = new MoveState();
        TransformerState stateFire = new FireState();

        context.setState(stateFire);
        context.action();

        context.setState(stateMove);
        context.action();
        
    }
}
