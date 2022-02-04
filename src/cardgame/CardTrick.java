/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cardgame;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Trinh Tran
 */
public class CardTrick {
    public static void main(String[] args) {
        PickCard[] magicHand = new PickCard[6];
        Scanner input = new Scanner(System.in);
        Random generator = new Random();
        generator.setSeed(System.currentTimeMillis());
        System.out.println("The cards in the magic hand are: ");
        
        for(int i = 0; i < magicHand.length; i++) {
            PickCard a = new PickCard();
            a.setSuit(PickCard.SUITS[generator.nextInt(4)]);
            a.setValue(generator.nextInt(13) + 1);
            magicHand[i] = a;
            System.out.println(a);
        }
        

        // Task 3 and 4
//        System.out.print("Enter card value: ");
//        int val = input.nextInt();
//        System.out.print("Enter suit: ");
//        String suit = input.next();
//        PickCard key = new PickCard();
//        key.setValue(val);
//        key.setSuit(suit);
        
        PickCard key = new PickCard();
        key.setSuit("Clubs");
        key.setValue(8);
        boolean found = false;
        System.out.println("Searching for: " + key);
        for(int i = 0; i < magicHand.length; i++) {
            if((magicHand[i].getValue() == key.getValue()) && 
                    magicHand[i].getSuit().equalsIgnoreCase(key.getSuit())) {
                System.out.println("Card is found in magic hand at index " + (i +1));
                found = true;
                break;
            }
        }
        if(!found)
            System.out.println("Card is not found in magic hand");
    }
    
}
