public class Context {

    private State current;

    public Context() {
        current = null;
    }
    
    public void setState(State state) {
        this.current = state;
    }

    public State getState() {
        return current;
    }
}
