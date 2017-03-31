package remotecommand;

public class CatCommand implements Command {
    
    private final Cat cat;
    
    public CatCommand(Cat c) {
        cat = c;
    }
    
    @Override
    public void execute() {
        cat.activate();
    }
}
