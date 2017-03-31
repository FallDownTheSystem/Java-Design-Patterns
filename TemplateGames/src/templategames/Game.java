package templategames;

import java.util.concurrent.ThreadLocalRandom;

public abstract class Game {
    
    public enum eGameState {
        UNINITIALIZED, PLAYER1, PLAYER2, FINISHED 
    }
    
    protected eGameState eState;
    protected String player1;
    protected String player2;
    protected String sCurPlayer;
    protected String sLastPlayer;
    protected int iMovesMade;

    
    public Game(String player1, String player2) {
        eState = eGameState.UNINITIALIZED;
        initializeGame(player1, player2);
    }

    // Our template method initializes the game, as every game has to start by initializing itself.
    final void initializeGame(String p1, String p2) { 
        player1 = p1;
        player2 = p2;
        sCurPlayer = player1;
        sLastPlayer = player2;
        iMovesMade = 0;
        eState = eGameState.PLAYER1;
        System.out.println("Game is initialized.");
    }
    
    // The game logic is abstract and has to be implemented by the concrete game itself.
    abstract void gameLogic();
    
    private boolean gameIsFinished() {
        return iMovesMade > 20; // end the mock game after 20 turns...
    }
    
    protected void endGame() {
        System.out.println("Game over.");
        System.out.print("Winner is: ");
        int randomNum = ThreadLocalRandom.current().nextInt(0, 1 + 1);
        if (randomNum == 1) {
            System.out.println(player1);
        } else {
            System.out.println(player2);
        }     
        eState = eGameState.FINISHED;
    }
    
    private void swapPlayers() {
        if (sCurPlayer.equals(player1)) {
            sCurPlayer = player2;
            eState = eGameState.PLAYER2;
        } else {
            sCurPlayer = player1;
            eState = eGameState.PLAYER1;
        }
    }
    
    private boolean turnCheck() {
        return !sCurPlayer.equals(sLastPlayer);
    }
    
    public void makeMove() {
        // Check if correct player is making the move and the game hasn't finished
        if (turnCheck() && (eState == eGameState.PLAYER1 || eState == eGameState.PLAYER2)) {
            // check if game is finished
            iMovesMade++;
            if (gameIsFinished()) {
                endGame(); // call endGame
            } else {
                gameLogic(); // Call game specific logic hook
                sLastPlayer = sCurPlayer;
                swapPlayers(); // Swap current player
            }
        } else {
            System.out.println("No cheating! Wait your turn...");
        }
    }
    
    public eGameState getState() {
        return eState;
    }
    
    public String getPlayer1() {
        return player1;
    }
    
    public String getPlayer2() {
        return player2;
    }
}
