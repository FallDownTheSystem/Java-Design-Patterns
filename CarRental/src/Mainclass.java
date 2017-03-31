/**
 *
 * @author Jere Kaplas, 0403105, LUT
 */
package carrental;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Mainclass {
    
    // Create an ArrayList of rented cars that we can iterate over (for printing)
    static ArrayList<Rental> rentedCars = new ArrayList<>();
    
    // Initialize mockup (database) IDs
    static int userId = 0;
    static int carId = 0;
    
    // rent method asks for user input to fill the Rental object with data
    private static void rent() {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Please fill out customer information:");
        System.out.print("Full name: ");
        String tempName = reader.nextLine();
        System.out.print("Address: ");
        String tempAddress = reader.nextLine();
        System.out.print("Phone number: ");
        String tempNumber = reader.nextLine();
        
        // Creates a new Customer object (also increases mock account id).
        Customer tempCustomer = new Customer(++userId, tempName, tempAddress, tempNumber);
        
        System.out.println("\nPlease fill out car details:");
        System.out.print("Marque (Brand): ");
        String tempMarque = reader.nextLine();
        System.out.print("Specific model: ");
        String tempModel = reader.nextLine();
        System.out.print("Manifacturing year: ");
        String tempMfYear = reader.nextLine();
        
        // Creates a new Car object.
        Car tempCar = new Car(++carId, tempMarque, tempModel, tempMfYear);
        
        System.out.println("\nStart date of the lease: (dd/M/yyyy)");
        Date tempStartDate;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/M/yyyy");
        String stringStartDate = reader.nextLine();
        try {
            tempStartDate = sdf.parse(stringStartDate); // Parses user input (String) to a Date object.
        } catch (ParseException ex) {
            System.out.println("Failed to parse date, try again.");
            return;
            //Logger.getLogger(Mainclass.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("\nEnd date of the lease: (dd/M/yyyy)");
        Date tempEndDate;
        String stringEndDate = reader.nextLine();
        try {
            tempEndDate = sdf.parse(stringEndDate);
        } catch (ParseException ex) {
            System.out.println("Failed to parse date, try again.");
            return;
            //Logger.getLogger(Mainclass.class.getName()).log(Level.SEVERE, null, ex);
        }
        rentedCars.add(new Rental(tempCustomer, tempCar, tempStartDate, tempEndDate)); 
    }
    
    // list method iterates over the rented cars array list and prints out all the information (relies on toString method)
    private static void list() {
        System.out.println("All the currently rented cars:");
        for (Rental rentedCar : rentedCars) {
            System.out.println(rentedCar);
            System.out.println("--------------------------------------------------------------------");
        }

    }
    // Main runs a simple menu in a loop, with basic exception handling.
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        do {
            System.out.println("===== Car Rental =====");
            System.out.println("1. Rent a car.");
            System.out.println("2. List rented cars.");
            System.out.println("0. Exit.");
            System.out.print("Select an option: ");
            int intInput; 
            try {
                intInput = Integer.parseInt(reader.nextLine());
            }
            catch (NumberFormatException e) {
                System.out.println("Integers only.");
                continue;
            }
            switch (intInput) {
                case 1:
                    rent();
                    break;
                case 2:
                    list();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Choose something from the menu.");
                    break;
            }
        }
        while(true);
    } 
}
