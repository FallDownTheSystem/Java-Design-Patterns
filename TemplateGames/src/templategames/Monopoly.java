package templategames;

import java.util.concurrent.ThreadLocalRandom;

public class Monopoly extends Game {

    public Monopoly(String player1, String player2) {
        super(player1, player2);
    }
   
    @Override
    void gameLogic() {

        int randomNum = ThreadLocalRandom.current().nextInt(2, 12 + 1);
        System.out.println(sCurPlayer + " rolled a " + randomNum);
        randomNum = ThreadLocalRandom.current().nextInt(1, 5 + 1);
        switch (randomNum) {
            case 1:
                int randInt = ThreadLocalRandom.current().nextInt(1, 5 + 1);
                System.out.println("Landed on empty property, it costs " + randInt * 100 + "$, buy it?");
                randInt = ThreadLocalRandom.current().nextInt(0, 1 + 1);
                if (randInt == 1) {
                    System.out.println(sCurPlayer + " buys the property!");
                } else {
                    System.out.println(sCurPlayer + " doesn't buy the property.");
                }
                break;
            case 2:
                System.out.println("Landed on someone elses property...");
                randInt = ThreadLocalRandom.current().nextInt(1, 4 + 1);
                System.out.println("Paying fee: " + randInt * 100);
                break;
            case 3:
                System.out.println(sCurPlayer + " landed on draw action card!");
                System.out.println("*Pretend something wacky happened.*");
                break;
            case 4:
                System.out.println(sCurPlayer + " go to jail!");
                break;
            case 5:
                System.out.println("Reward!");
                randInt = ThreadLocalRandom.current().nextInt(1, 3 + 1);
                System.out.println(sCurPlayer + " won: " + randInt * 100);
                break;
            default: System.err.println("How did we get here?");
                     break;
        }
    }
    
    @Override
    protected void endGame() {
        System.out.print("Player: ");
        int randomNum = ThreadLocalRandom.current().nextInt(0, 1 + 1);
        if (randomNum == 1) {
            System.out.print(player1);
        } else {
            System.out.print(player2);
        }     
         System.out.println(" went bankrupt.");
        eState = eGameState.FINISHED;
    }

}
