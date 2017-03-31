package templategames;

import templategames.Game.eGameState;

public abstract class GameAI implements Runnable {
    
    protected final String sName;
    protected final int iPlayerStatus;
    protected final Game game;
    
    public GameAI(int s, Game g) {
        
        iPlayerStatus = s;
        game = g;
        
        switch (iPlayerStatus) {
            case 1:
                sName = game.getPlayer1();
                break;
            case 2:
                sName = game.getPlayer2();
                break;
            default:
                System.err.println("Player status not set properly");
                sName = "";
                System.exit(1);
        }
    }
    
    // Template method for the AI, running the sequence for playing the game.
    final void runAI() {
        prePrintHook();
        playGame();
        postPrintHook();
        System.out.println("==================================================");
    }
    
    @Override
    public void run() {

        while (game.getState() != eGameState.FINISHED) {
            
            if (iPlayerStatus == 1 && game.getState() == eGameState.PLAYER1) {
                runAI();
            } else if (iPlayerStatus == 2 && game.getState() == eGameState.PLAYER2) {
                runAI();   
            }
            // Sleep for a while
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                System.err.println(e);
            }     
        }
        gameOver();
    }
    
    abstract void prePrintHook();
    abstract void postPrintHook();
    
    final void gameOver() {
        if (game.getState() == eGameState.FINISHED) {
            System.out.println(sName + ": Good game!");
        }
    }
    
    protected void playGame() {
        game.makeMove();  
    }
    
}
