package proxypattern;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author LUT, OOPT
 * Jere Kaplas, 0403105
 * Oskari Jahkola, 0403082
 * Eetu Heimala, 0388819
 * Sakari Laine, 0418598
 */
public class ProxyPattern {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		
		ArrayList<String> studentList = new ArrayList<>();
		studentList.add("John");
		studentList.add("Jane");
		
		ProxyIntranetAccess testProxy = new ProxyIntranetAccess("John", studentList);
		testProxy.grantIntranetAccess();
		
		testProxy = new ProxyIntranetAccess("Mary", studentList);
		testProxy.grantIntranetAccess();
		
		ProxyIntranetAccess tempProxy = null;
		
		Scanner reader = new Scanner(System.in);
        String input;
		
		do {
            System.out.println("===== Access Intranet =====");    
            System.out.println("1. Add student");
            System.out.println("2. Login");
			System.out.println("3. Get Student ID");
            System.out.println("0. Exit");
            System.out.print("Select an option: ");
            input = reader.nextLine();
            
            switch (Integer.parseInt(input)) {
                case 1:
                    System.out.print("Student's name: ");
					studentList.add(reader.nextLine());
                    break;
                case 2:
					System.out.print("Login name: ");
					tempProxy = new ProxyIntranetAccess(reader.nextLine(), studentList);
					tempProxy.grantIntranetAccess();
                    break;
				case 3:
					if (tempProxy != null) {
						tempProxy.printStudentID();
					} else {
						System.out.println("You must login first.");
					}
                    break;
                case 0:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Choose something from the menu.");
                    break;           
            }
        } while (true);
	}
}
