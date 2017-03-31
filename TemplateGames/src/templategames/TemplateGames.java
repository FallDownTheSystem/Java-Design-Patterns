package templategames;

/**
 *
 * @author Jere Kaplas, 0403105, LUT
 */
public class TemplateGames {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Game monopoly = new Monopoly("Top hat", "Boot");
        
        GameAI chivalriousBot = new ChivalriousAI(1, monopoly);
        GameAI rudeBot = new RudeAI(2, monopoly);
        
        new Thread(chivalriousBot).start();
        new Thread(rudeBot).start();

    }
    
}
