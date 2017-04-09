public class EndState implements State {

    public void doAction(Context context) {
        System.out.println("==========");
        System.out.println("The system has jammed, please call for service.");
        System.out.println("==========");
        System.out.println("\nThis is probably your only chance...");
        System.out.println("Leave. Leave now!");
        context.setState(this);	
    }
    
    @Override
    public String toString(){
        return "(End State)";
    }
}
