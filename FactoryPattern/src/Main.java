package factorypattern;
/**
 *
 * @author Jere Kaplas, 0403105, LUT
 * Credit to Eetu Heimala for helping with the command line menu code.
 */
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        
        // Initalize all the factories and lists to store created animals
        AnimalFactory df = new DogFactory();
        AnimalFactory cf = new CatFactory();
        AnimalFactory bf = new BirdFactory();
        
        ArrayList<Dog> dogs = new ArrayList<>();
        ArrayList<Cat> cats = new ArrayList<>();
        ArrayList<Bird> birds = new ArrayList<>();
             
        Scanner reader = new Scanner(System.in);
        String input;
        do {
            System.out.println("===== Animal Kennel =====");    
            System.out.println("1. Add animal.");
            System.out.println("2. Talk to animals.");
            System.out.println("0. Exit.");
            System.out.print("Select an option: ");
            input = reader.nextLine();
            
            switch (Integer.parseInt(input)) {
                case 1:
                    System.out.println("Types of animals to add: ");
                    System.out.println("1 Dogs");
                    System.out.println("2 Cats");
                    System.out.println("3 Birds");
                    
                    System.out.print("Selection: ");
                    input = reader.nextLine();
                    switch (Integer.parseInt(input)) {
                        case 1:
                            System.out.println("You can add: ");
                            System.out.println("Labrador\tPomeranian\tShepherd");
                            System.out.print("Select an option: ");
                            input = reader.nextLine();
                            Dog dog = df.createDog(input);
                            if (dog != null) dogs.add(dog);
                            break;
                        case 2:
                            System.out.println("You can add: ");
                            System.out.println("Burmese\tPersian\tSiamese");
                            System.out.print("Select an option: ");
                            input = reader.nextLine();
                            Cat cat = cf.createCat(input);
                            if (cat != null) cats.add(cat);
                            break;
                        case 3:
                            System.out.println("You can add: ");
                            System.out.println("Owl\tParrot\tStork");
                            System.out.print("Select an option: ");
                            input = reader.nextLine();
                            Bird bird = bf.createBird(input);
                            if (bird != null) birds.add(bird);
                            break;
                        default:
                            break;
                    }
                    break;
                case 2:
                    System.out.println("And then each of the animals spoke: ");
                    dogs.forEach((dog) -> {
                        dog.speak();
                    });
                    cats.forEach((cat) -> {
                        cat.speak();
                    });
                    birds.forEach((bird) -> {
                        bird.speak();
                    });
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
