package observers;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Jere Kaplas, 0403105, LUT
 */
public class Mainclass {
    
    public static void main(String[] args) {
                
        // Initialize our apps with names
        ArrayList<Application> apps = new ArrayList<>();
        apps.add(new Application("App 1"));
        apps.add(new Application("App 2"));
        apps.add(new Application("App 3"));
        
        // Initialize our mobiles with names
        ArrayList<Mobile> phones = new ArrayList<>();
        phones.add(new Mobile("Phone 1"));
        phones.add(new Mobile("Phone 2"));
        phones.add(new Mobile("Phone 3"));
        
        // Register every observer (phone) to each observable/subject (app)
        apps.forEach((app) -> {
            phones.forEach((phone) -> {
                app.registerObserver(phone);
            });
            app.start(); // Start the thread for each app.
        }); 
        
        // Initalize a scanner for reading user input
        Scanner reader = new Scanner(System.in);
        
        do {
            System.out.println("===== App Update Service =====\n"
                                + "1. Send update from App 1.\n"
                                + "2. Send update from App 2.\n"
                                + "3. Send update from App 3.\n"
                                + "0. Exit.");
            int iInput; 
            try {
                iInput = Integer.parseInt(reader.nextLine());
            }
            catch (NumberFormatException e) {
                System.out.println("Integers only.");
                continue;
            }
            switch (iInput) {
                case 1:
                case 2:
                case 3:
                    System.out.print("Update: ");
                    apps.get(iInput - 1).setUpdate(reader.nextLine());
                    break;
                case 0:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Choose something from the menu.");
                    break;
            }
        } while(true);
    }
}
