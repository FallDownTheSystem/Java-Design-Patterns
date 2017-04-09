public class BreakEvenState implements State {

    public void doAction(Context context) {
        System.out.println("You won back what you put in.");
        context.setState(this);	
    }
    
    @Override
    public String toString(){
        return "(BreakEven State)";
    }
}
