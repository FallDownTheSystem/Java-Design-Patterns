package templategames;

public class Checkers extends Game {

    public Checkers(String player1, String player2) {
        super(player1, player2);
    }
   
    @Override
    void gameLogic() {
        if (iMovesMade % 5 == 0) {
            System.out.println("Player: " + sCurPlayer + " eats a piece!");
        }
        System.out.println("Player: " + sCurPlayer + " makes a move.");
    }

}
