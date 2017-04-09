public class LoseState implements State {

    public void doAction(Context context) {
        System.out.println("Dun, dun, duuuun. You lost!");
        context.setState(this);	
    }
    
    @Override
    public String toString(){
        return "(Lose State)";
    }
}
