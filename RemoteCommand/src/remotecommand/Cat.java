package remotecommand;

public class Cat {
    
    private boolean active;
    
    public Cat() {
        active = false;
    }
    
    public void activate() {
        if (!active) {
            Remote.setTextAreaOutput("Activating the cat.");
        } else {
            Remote.setTextAreaOutput("Deactivating the cat.");
        }
        active = !active;
    }  
}
