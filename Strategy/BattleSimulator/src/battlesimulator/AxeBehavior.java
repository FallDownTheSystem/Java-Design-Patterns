package battlesimulator;

import java.util.Random;

public class AxeBehavior implements WeaponBehaviour {

    Random randomGenerator = new Random();
    
    @Override
    public void useWeapon() {
        
        int randomInt = randomGenerator.nextInt(4);
        
        switch(randomInt){
            case 0:
                System.out.println("'Timbeeeeeeeer!' Hah! I feel like a lumberjack with this axe! Delightful! Pity about your leg, though...\n");
                break;
            case 1:
                System.out.println("Be realistic. Do you really need all your legs and arms? Huh, my axe says differently.\n");
                break;
            case 2:
                System.out.println("*WHACK* HAHAA! The old axe-inside-head spoof. Lighten up old chap. Its just a goof, brother.\n");
                break;
            case 3:
                System.out.println("I am going to have to axe you to leave. *giggle*\n");
                break;
        }
    }
    
}
