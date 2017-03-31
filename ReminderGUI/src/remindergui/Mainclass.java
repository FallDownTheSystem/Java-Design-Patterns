package remindergui;

import java.awt.Component;
import static remindergui.ReminderJFrame.getInstance;

/**
 *
 * @author Jere Kaplas, 0403105, LUT
 */
public class Mainclass {

    static Component frame;
    
    public static void main(String args[]) {

        try {
             // Setting the GUI to use default look and feel of the system.
             //javax.swing.UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
             javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());

        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReminderJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {    
                ReminderJFrame frame = getInstance(); // Creating a new singleton instance of the container frame for the GUI
                frame.setVisible(true);
            }
        });
        // Creating a new thread which checks the list of reminders against current time
        Checker ReminderChecker = new Checker("CheckerThread");
        ReminderChecker.start();
    }
}
