/*
 * Authors: Oskari Jahkola 0403082, Jere Kaplas 0403105, Eetu Heimala, Sakari Laine
 * LUT OOPT
 * 
 */
package battlesimulator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class BattleSimulator {

    public static void main(String[] args) throws IOException, InterruptedException {
        
        Random randomGenerator = new Random();
        Character character1 = null;
        Character character2 = null;
        WeaponBehaviour wb;
        boolean loop = true;
    	BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        
    	while(loop) {
        	System.out.println("\n*** BATTLE SIMULATOR ***");
        	System.out.println("1) Choose character 1");
                System.out.println("2) Choose character 2");
                System.out.println("3) FIGHT!");
                System.out.println("0) End simulation");
        	System.out.print("Your choice: ");
        	int choice = Integer.parseInt(input.readLine());
                
                switch (choice){
                    
                    case 1:
                        System.out.println("\n1st Character: ");
                	System.out.println("1) King");
                        System.out.println("2) Knight");
                        System.out.println("3) Queen");
                        System.out.println("4) Troll");
                	System.out.print("Your choice: ");
                        int select = Integer.parseInt(input.readLine());
                        
                        if (select == 1){
                            character1 = new King();
                            wb = chooseWeapon();
                            character1.setWeapon(wb);
                            characterEnter(character1, 1);
                        }
                        else if (select == 2){
                            character1 = new Knight();
                            wb = chooseWeapon();
                            character1.setWeapon(wb);
                            characterEnter(character1, 1);
                        }
                        else if (select == 3){
                            character1 = new Queen();
                            wb = chooseWeapon();
                            character1.setWeapon(wb);
                            characterEnter(character1, 1);
                        }
                        else if (select == 4){
                            character1 = new Troll();
                            wb = chooseWeapon();
                            character1.setWeapon(wb);
                            characterEnter(character1, 1);
                        }
                        break;
                        
                    case 2:
                        System.out.println("\n2nd Character: ");
                	System.out.println("1) King");
                        System.out.println("2) Knight");
                        System.out.println("3) Queen");
                        System.out.println("4) Troll");
                	System.out.print("Your choice: ");
                        choice = Integer.parseInt(input.readLine());
                        
                        switch (choice){
                            case 1:
                                character2 = new King();
                                wb = chooseWeapon();
                                character2.setWeapon(wb);
                                characterEnter(character2, 2);
                                break;
                            case 2:
                                character2 = new Knight();
                                wb = chooseWeapon();
                                character2.setWeapon(wb);
                                characterEnter(character2, 2);
                                break;
                            case 3:
                                character2 = new Queen();
                                wb = chooseWeapon();
                                character2.setWeapon(wb);
                                characterEnter(character2, 2);
                                break;
                            case 4:
                                character2 = new Troll();
                                wb = chooseWeapon();
                                character2.setWeapon(wb);
                                characterEnter(character2, 2);
                                break;
                        }
                        break;
                    case 3:
                        int randomInt = randomGenerator.nextInt(4);
                        if (character1 != null && character2 != null){
                            
                            for (int i = 0; i <= randomInt; i++){
                                character1.fight();
                                character2.fight();        
                            }
                            int whoWon = randomGenerator.nextInt(1);
                            if (whoWon == 0){
                                System.out.println(character1.getClass().getSimpleName() + " has defeated the " + character2.getClass().getSimpleName());
                            }
                            else if (whoWon == 1){
                                System.out.println(character2.getClass().getSimpleName() + " has defeated the " + character1.getClass().getSimpleName());
                            }
                            break;
                        }
                        else {
                            System.out.println("Choose your characters first!");
                            break;
                        } 
                    
                    case 0:
                        loop = false;
                        break;
                }        
        }
        
    }
    
    public static WeaponBehaviour chooseWeapon() throws IOException{
        WeaponBehaviour wb;
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("\nChoose your weapon: ");
                	System.out.println("1) Knife");
                        System.out.println("2) Axe");
                        System.out.println("3) Sword");
                        System.out.println("4) Club");
                	System.out.print("Your choice: ");
                        int choice = Integer.parseInt(input.readLine());
                        switch (choice){
                            case 1:
                                wb = new KnifeBehavior();
                                return wb;
                            case 2:
                                wb = new AxeBehavior();
                                return wb;
                            case 3:
                                wb = new SwordBehavior();
                                return wb;
                            case 4:
                                wb = new ClubBehavior();
                                return wb;
        
    }
                        return wb = new KnifeBehavior(); // Just a default
    }
    public static void characterEnter(Character c, int i){
        if (i == 1){
            System.out.println("The " + c.getClass().getSimpleName() + " enters the arena with confidence!\n");
        }
        else {
        System.out.println("The " + c.getClass().getSimpleName() + " enters with determination!\n");
        }
    }
}