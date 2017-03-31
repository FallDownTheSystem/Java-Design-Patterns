package templategames;

import java.util.concurrent.ThreadLocalRandom;

public class RudeAI extends GameAI {
    
    public RudeAI(int s, Game g) {
        super(s, g);
    }

    @Override
    void prePrintHook() {
        int randomNum = ThreadLocalRandom.current().nextInt(1, 4 + 1);
        System.out.print(sName + ": ");
        switch (randomNum) {
            case 1:
                System.out.println("Get wrecked!");
                break;
            case 2:
                System.out.println("You're cheating!");
                break;
            case 3:
                System.out.println("Lucky much?");
                break;
            case 4:
                System.out.println("ez game ez lyfe");
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
                System.out.println("Yeah buddy, thanks for money!");
                break;
            case 2:
                System.out.println("Never lucky! *BabyRage*");
                break;
            case 3:
                System.out.println("*Attempting to cheat*");
                break;
            case 4:
                System.out.println("This game is stupid!");
                break;
            default: System.err.println("How did we get here?");
                     break;
        }
    }
    
}
