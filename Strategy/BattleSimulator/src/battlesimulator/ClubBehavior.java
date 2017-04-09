package battlesimulator;

import java.util.Random;

public class ClubBehavior implements WeaponBehaviour {

    Random randomGenerator = new Random();
    
    @Override
    public void useWeapon() {
        
        int randomInt = randomGenerator.nextInt(4);
        
        switch(randomInt){
            case 0:
                System.out.println("The best cure for a headache is getting a light tap on your head, with this club... I promise you will not feel a thing soon!\n");
                break;
            case 1:
                System.out.println("CLONK CLONK CLONK! Goes the club clock!\n");
                break;
            case 2:
                System.out.println("*SMASH* Hmm... I have to say I enjoy helping people. Your face is much more delightful than it was before I smashed your face in with my club.\n");
                break;
            case 3:
                System.out.println("I will tell you what. I will hit your head with my club and we will see how far it will fly! Hmm... I wonder if this could become a past-time activity.\n");
                break;
        }
    }
}
