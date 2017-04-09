package battlesimulator;

import java.util.Random;

public class KnifeBehavior implements WeaponBehaviour {
    
    Random randomGenerator = new Random();
    
    @Override
    public void useWeapon() {
        int randomInt = randomGenerator.nextInt(4);
        
        switch(randomInt){
            case 0:
                System.out.println("'Tis but a flesh wound, with a poisoned knife!\n");
                break;
            case 1:
                System.out.println("I enjoy poking people, with this knife, into your internal organs. You know just childish play.\n");
                break;
            case 2:
                System.out.println("Would you mind inserting this knfie into your lungs? I assure you, the feeling is breathtaking.\n");
                break;
            case 3:
                System.out.println("Knife to meet you!\n");
                break;
        }
    }
}
