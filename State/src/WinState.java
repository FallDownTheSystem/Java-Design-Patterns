public class WinState implements State {

    public void doAction(Context context) {
        System.out.println("Winner winner, chicken dinner!");
        context.setState(this);	
    }
    
    @Override
    public String toString(){
        return "(Win State)";
    }
}
