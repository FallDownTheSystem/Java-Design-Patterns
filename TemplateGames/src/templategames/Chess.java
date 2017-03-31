package templategames;

import java.util.concurrent.ThreadLocalRandom;

public class Chess extends Game {

    public Chess(String player1, String player2) {
        super(player1, player2);
    }
   
    @Override
    void gameLogic() {

        int randomNum = ThreadLocalRandom.current().nextInt(1, 12 + 1);
        switch (randomNum) {
            case 1: 
            case 2: 
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:  System.out.println(sCurPlayer + ": moves a piece.");
                     break;
            case 8:  System.out.println(sCurPlayer + ": eats a pawn.");
                     break;
            case 9:  System.out.println(sCurPlayer + ": eats a knight.");
                     break;
            case 10: System.out.println(sCurPlayer + ": eats the queen.");
                     break;
            case 11: System.out.println(sCurPlayer + ": eat a bishop." );
                     break;
            case 12: System.out.println(sCurPlayer + ": eat a rook." );
                     break;
            default: System.err.println("How did we get here?");
                     break;
        }
    }
    
    @Override
    protected void endGame() {
        System.out.println("The king is down.");
        System.out.print("Winner is: ");
        int randomNum = ThreadLocalRandom.current().nextInt(0, 1 + 1);
        if (randomNum == 1) {
            System.out.println(player1);
        } else {
            System.out.println(player2);
        }     
        eState = eGameState.FINISHED;
    }

}
