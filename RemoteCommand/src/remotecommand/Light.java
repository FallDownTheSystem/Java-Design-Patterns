package remotecommand;

public class Light {
    
    private boolean on;
    
    public Light() {
        on = false;
    }
    
    public void on() {
        if (!on) {
            Remote.setTextAreaOutput("Switching on the light.");
        } else {
            Remote.setTextAreaOutput("Switching off the light.");
        }
        on = !on;
    }  
}
