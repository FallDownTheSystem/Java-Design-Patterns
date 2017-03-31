package adaptercats;

public class BengalAdapter implements Cat {
    
    private final Tiger tig;
    
    public BengalAdapter(Tiger t) {
        tig = t;
    }
    
    @Override
    public void meow() {
        tig.roar(); // Calling the adaptees method
    }
    
}
