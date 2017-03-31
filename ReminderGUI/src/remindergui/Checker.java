package remindergui;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import javax.swing.DefaultListModel;

public class Checker implements Runnable {
    private Thread t;
    private final String threadName;
    
    public Checker(String tName) {
        threadName = tName;
    }
    
    @Override
    public void run() {
        // Create a new scheduled executor service, which executes at a fixed rate of every 10 milliseconds.
        ScheduledExecutorService ses = Executors.newSingleThreadScheduledExecutor(); 
        ses.scheduleAtFixedRate(() -> {
            compareReminders(ReminderJFrame.remindArray);         
        }, 0, 100, TimeUnit.MILLISECONDS);
    }
    
    public void start() {
      if (t == null) {
         //System.out.println("Starting: " + threadName);
         t = new Thread (this, threadName);
         t.start();
      }
    }
    
    // Loops over the array of reminders, and checks their set datetime against current local datetime
    public void compareReminders(ArrayList<Reminder> reminders){  
        ArrayList<Integer> foundIndices = new ArrayList<>();
        for (int i = 0; i < reminders.size(); i++) {
            LocalDateTime timePoint = LocalDateTime.now().truncatedTo(ChronoUnit.MINUTES);
            if (timePoint.toString().equals(reminders.get(i).getDateTime().toString())) {
                // Call matchFound on GUI if the dates and time match
                ReminderJFrame.matchFound(reminders.get(i).getMessage(), i);
                foundIndices.add(i);
            }
        }
        // remove the elements from the reminder arraylist after iterating through all of them, not during.
        foundIndices.forEach((i) -> {
            ((DefaultListModel)ReminderJFrame.jListReminders.getModel()).removeElementAt(i);
            reminders.remove((int)i);
        });
    }

}
