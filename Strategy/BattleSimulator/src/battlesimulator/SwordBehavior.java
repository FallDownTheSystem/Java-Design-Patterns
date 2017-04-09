package battlesimulator;

import java.util.Random;

public class SwordBehavior implements WeaponBehaviour {
    
    Random randomGenerator = new Random();
    
    @Override
    public void useWeapon() {
        int randomInt = randomGenerator.nextInt(4);
        
        switch(randomInt){
            case 0:
                System.out.println("Chopping up limbs with a sword!\n");
                break;
            case 1:
                System.out.println("That sword slice is causing massive blood lose! Call the medival paramedics! The para-medival-ics!\n");
                break;
            case 2:
                System.out.println("Excuse me. Its seems as if your head was sliced off by that sword swing.\n");
                break;
            case 3:
                System.out.println("Aah, I see that the colour red suits you well, from all the blood... from that sword hit...\n");
                break;
        }
    }
}
