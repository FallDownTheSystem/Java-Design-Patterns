
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author LUT, OOPT
 * Jere Kaplas, 0403105
 * Oskari Jahkola, 0403082
 * Eetu Heimala, 0388819
 * Sakari Laine, 0418598
 */

public class Mainclass {

    public static void main(String[] args) throws IOException {
        double random;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        Context context = new Context();

        State winstate = new WinState();
        State losestate = new LoseState();
        State breakevenstate = new BreakEvenState();
        State endstate = new EndState();
        /*
        winstate.doAction(context);
        System.out.println(context.getState().toString());

        losestate.doAction(context);
        System.out.println(context.getState().toString());

        breakevenstate.doAction(context);
        System.out.println(context.getState().toString());

        endstate.doAction(context);
        System.out.println(context.getState().toString());
        */
        System.out.println("=== Game addict simulator 1.0 ===");
        System.out.println("You can't choose to quit the game. You can only keep playing.");
        
        // Hold enter to quickly end up in broken state (game end)
        
        while(true) {
            System.out.println("\nPress ENTER to play a round.");
            
            br.readLine();
            
            random = Math.random();
            if (random < 0.1) {
                endstate.doAction(context);
                System.out.println(context.getState().toString());
                break;
            } else if (random < 0.25) {
                winstate.doAction(context);
            } else if (random < 0.50) {
                breakevenstate.doAction(context);
            } else {
                losestate.doAction(context);
            } 
            System.out.println(context.getState().toString());
        }
    }
}
