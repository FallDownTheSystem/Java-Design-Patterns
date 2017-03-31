package observers;

import java.util.HashSet;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Application implements Subject, Runnable {

    private Thread t;
    private final String threadName;
    private final HashSet<Observer> observers;
    private String sUpdate;
    private String sPrevUpdate;
    
    public Application(String n) {
        observers = new HashSet(); // HashSet to avoid duplicates
        threadName = n;
    }
    
    @Override
    public void run() {
        // Create a new scheduled executor service, which executes at a fixed rate of every 2 seconds.
        ScheduledExecutorService ses = Executors.newSingleThreadScheduledExecutor(); 
        ses.scheduleAtFixedRate(() -> {
            // Only notify observers if the sUpdate String has changed
            if (updateChanged(sPrevUpdate)) {
                sPrevUpdate = sUpdate;
                notifyObservers();
            }
        }, 0, 2, TimeUnit.SECONDS);
    }
    
    public void start() {
      if (t == null) {
         //System.out.println("Starting: " + threadName);
         t = new Thread (this, threadName);
         t.start();
      }
   }

    @Override
    public void registerObserver(Observer o) {
        Mobile phone = (Mobile) o;
        observers.add(o);
        System.out.println(threadName + " registered " + phone.getName());
    }

    @Override
    public void removeObserver(Observer o) {
        Mobile phone = (Mobile) o;
        observers.remove(o);
        System.out.println(threadName + " removed " + phone.getName());
    }

    @Override
    public void notifyObservers() {
        observers.forEach((o) -> {
            o.update(this);
        });
    }

    public void setUpdate(String s) {
        sUpdate = s;
    }

    public String getUpdate() {
        return sUpdate;
    }
    
    /**
     * Returns boolean value indicating whether the passed parameter String s has does not equal the String sUpdate.
     * Checks both strings for null.
     * @param s String which sUpdate is compared against.
     */
    private boolean updateChanged(String s) {
        return (s == null ? sUpdate != null : !s.equals(sUpdate)); 
    }
    
    public String getName() {
        return threadName;
    }
}
