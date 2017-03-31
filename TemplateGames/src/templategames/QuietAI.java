package templategames;

public class QuietAI extends GameAI {
    
    public QuietAI(int s, Game g) {
        super(s, g);
    }

    @Override
    void prePrintHook() {
        System.out.print(sName + ": ");
        System.out.println("...");
    }

    @Override
    void postPrintHook() {
        // Do nothing...
    }
    
}
