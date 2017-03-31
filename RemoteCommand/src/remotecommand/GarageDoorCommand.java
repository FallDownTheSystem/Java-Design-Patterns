package remotecommand;

public class GarageDoorCommand implements Command {
    
    private final GarageDoor door;
    
    public GarageDoorCommand(GarageDoor d) {
        door = d;
    }
    
    @Override
    public void execute() {
        door.open();
    }
}
