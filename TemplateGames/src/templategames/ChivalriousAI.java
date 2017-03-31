package templategames;

import java.util.concurrent.ThreadLocalRandom;

public class ChivalriousAI extends GameAI {
    
    public ChivalriousAI(int s, Game g) {
        super(s, g);
    }

    @Override
    void prePrintHook() {
        int randomNum = ThreadLocalRandom.current().nextInt(1, 4 + 1);
        System.out.print(sName + ": ");
        switch (randomNum) {
            case 1:
                System.out.println("Good move!");
                break;
            case 2:
                System.out.println("Oh my!");
                break;
            case 3:
                System.out.println("Hmmm... what to do next...");
                break;
            case 4:
                System.out.println("Well played sir.");
                break;
            default: System.err.println("How did we get here?");
                     break;
        }
    }

    @Override
    void postPrintHook() {
        int randomNum = ThreadLocalRandom.current().nextInt(1, 4 + 1);
        System.out.print(sName + ": ");
        switch (randomNum) {
            case 1:
                System.out.println("That should do the trick!");
                break;
            case 2:
                System.out.println("Let's see you top that.");
                break;
            case 3:
                System.out.println("You've got me in a pinch...");
                break;
            case 4:
                System.out.println("That was unexpected!");
                break;
            default: System.err.println("How did we get here?");
                     break;
        }
    }
    
}
