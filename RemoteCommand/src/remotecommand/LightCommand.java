package remotecommand;

public class LightCommand implements Command {
    
    private final Light lit;
    
    public LightCommand(Light l) {
        lit = l;
    }
    
    @Override
    public void execute() {
        lit.on();
    }
}
