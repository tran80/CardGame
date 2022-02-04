/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cardgame;

/**
 *
 * @author tran80
 */
public class PickCard {
     private String suit; // HEARTS, CLUBS, SPADES, DIAMONDS
    private int value;   // value 1 -> 13
    
    public static final String[] SUITS ={"Hearts", "Clubs", "Spades", "Diamons"};

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
    
    @Override
    public String toString() {
        return "Cards{" +  "suit = '" + suit + '\'' + ", value=" + value + '}';
    }
}
