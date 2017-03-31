package remotecommand;

public class GarageDoor {
    
    private boolean open;
    
    public GarageDoor() {
        open = false;
    }
    
    public void open() {
        if (!open) {
            Remote.setTextAreaOutput("Opening garage door.");
        } else {
            Remote.setTextAreaOutput("Closing garage door.");
        }
        open = !open;
    }  
}
