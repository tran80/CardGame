/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package cardgame;

import cardgame.Card.Suit;
import cardgame.Card.Value;
import java.util.Random;
import java.util.Scanner;

/**
 * This class +++Insert Description Here+++
 * 
 * @author Trinh Tran
 */
public class CardGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Card[] cardHand = CardHandGenerator.generateHand(7);
        
        String format = "%s of %s\n";
        for (Card card: cardHand) {
            System.out.printf(format, card.getValue(), card.getSuit());
        }
        
        System.out.println("");
        
        System.out.println("Please choose a suit");
        for (int i = 0; i < Card.Suit.values().length; i++) {
            System.out.println((i + 1) + ": " +Card.Suit.values()[i]);
        } 
        
        int suit = input.nextInt();
        
        System.out.println("Please choose the value:");
        for (int i = 0; i < Card.Value.values().length; i++) {
        
            System.out.println((i + 1) + ": " + Card.Value.values()[i]);
        
        }
        
        int value = input.nextInt();
        
        Card userGuess = new Card(
                Card.Value.values()[value - 1], 
                Card.Suit.values()[suit - 1]);
        
        boolean match = false;
        
        for (Card card: cardHand) {
        
            if (card.getValue() == userGuess.getValue() && 
                    card.getSuit() == userGuess.getSuit()) {
                match = true;
                break;
            }
        }
        
        System.out.println("You got a match: " + match);
    }

}
