package iteratormenu;

import java.util.Scanner;

/**
 *
 * @author Jere Kaplas, 0403105, LUT
 */

public class MainClass {

    public static void main(String args[]) {
        BurgerKingMenu bkMenu = new BurgerKingMenu();
        McDonaldsMenu mcdMenu = new McDonaldsMenu();
		
		Scanner reader = new Scanner(System.in);
        String input;
		String name;
		String description;
		String price;
		String index;
        do {
            System.out.println("===== MenuIterator Operations =====");    
            System.out.println("1. Add menu item");
            System.out.println("2. Remove menu item");
			System.out.println("3. Print menus");
            System.out.println("0. Exit");
            System.out.print("Select an option: ");
            input = reader.nextLine();
            
            switch (Integer.parseInt(input)) {
                case 1:
                    System.out.println("Which menu to add item to: ");
                    System.out.println("1. McDonalds Menu");
                    System.out.println("2. Burger King Menu");
                    
                    System.out.print("Selection: ");
                    input = reader.nextLine();
					
					System.out.print("Item name: ");
					name = reader.nextLine();

					System.out.print("Item description: ");
					description = reader.nextLine();

					System.out.print("Item price: ");
					price = reader.nextLine();
					
                    switch (Integer.parseInt(input)) {
                        case 1:
							mcdMenu.addItem(name, description, Float.parseFloat(price));
                            break;
                        case 2:
							bkMenu.addItem(name, description, Float.parseFloat(price));
                            break;
                        default:
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Which menu to remove item from: ");
                    System.out.println("1. McDonalds Menu");
                    System.out.println("2. Burger King Menu");
                    
                    System.out.print("Selection: ");
                    input = reader.nextLine();
					
					System.out.print("Item number: ");
                    index = reader.nextLine();
					
                    switch (Integer.parseInt(input)) {
                        case 1:
							mcdMenu.removeItem(Integer.parseInt(index));
                            break;
                        case 2:
							bkMenu.removeItem(Integer.parseInt(index));
                            break;
                        default:
                            break;
                    }
                    break;
				case 3:
                    printMenus(mcdMenu, bkMenu);
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
	
	private static void printMenus(Menu mcdMenu, Menu bkMenu) {
		
		Iterator mcdIterator = mcdMenu.createIterator();
        Iterator bkIterator = bkMenu.createIterator();
		
		int index = 1;
        System.out.println("======= McDonald's Menu =======");
        while (mcdIterator.hasNext()) {
            MenuItem menuItem = (MenuItem)mcdIterator.next();
            System.out.println(index + ". " + menuItem.toString() + "\n");
            index++;
        }

        System.out.println("======= Burger King Menu =======");
		index = 1;
        while (bkIterator.hasNext()) {
            MenuItem menuItem = (MenuItem)bkIterator.next();
            System.out.println(index + ". " + menuItem.toString() + "\n");
			index++;
        }
	}
}
