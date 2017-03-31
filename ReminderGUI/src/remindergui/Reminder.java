package remindergui;

import java.time.LocalDateTime;

public class Reminder {
    
    private final LocalDateTime sDateTime;
    private final String sMsg;
    
    // Reminder class holds the date time and message for each reminder
    public Reminder(String dateTime, String msg) {
        sDateTime = LocalDateTime.parse(dateTime);
        sMsg = msg;
    }
    
    public LocalDateTime getDateTime() {
        return sDateTime;
    }
    
    public String getMessage() {
        return sMsg;
    }
    
    @Override
    public String toString() {
        return (sDateTime + ": " + sMsg);
    }
    
}
