package adaptercats;

/**
 *
 * @author Jere Kaplas, 0403105, LUT
 */
public class MainClass {
    
    public static void main(String[] args) {
        
        // Creating our three objects
        Persian cat = new Persian();
        Bengal tiger = new Bengal();
        BengalAdapter imposter = new BengalAdapter(new Bengal());

        // Calling their methods, if the adapter works imposter calls meow but should return a roar.
        cat.meow();
        tiger.roar();
        imposter.meow();
    }

}
