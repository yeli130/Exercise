package exercise1;

import java.util.Scanner;


/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 * @author  Ye Li Jan 26, 2023
 * @author dancye
 * @author Paul Bonenfant Jan 25, 2022 
 */
public class CardTrick {
    
    public static void main(String[] args) {
        
        Card[] hand = new Card[7];
        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
            //card.setValue(insert call to random number generator here)
            
            card.setValue((int)(Math.random()*7 + 1));
            //card.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            card.setSuit(Card.SUITS[(int)(Math.random()*4)]);
            hand[i] = card;
            //System.out.println("The random cards in hand are:" + hand[i].getSuit() + " " + hand[i].getValue());
            // Hint: You can use Random -> random.nextInt(n) to get a random number between 0 and n-1 (inclusive)
            //       Don't worry about duplicates at this point
        }

        // insert code to ask the user for Card value and suit, create their card
            Scanner scan = new Scanner(System.in);
            System.out.println("Please enter a Card value(1-13) and suit(0 for Hearts, 1 for Diamonds, 2 for Spades, 3 for Clubs");
            int inputValue = scan.nextInt();
            int inputSuit = scan.nextInt();
        // and search the hand here. 
        // Hint: You can ask for values 1 to 10, and then
        //       11 for jack, 12 for queen, etc. (remember arrays are 0-based though)
        //       1 for Hearts, 2 for Diamonds, etc. (remember arrays are 0-based though)
        // 
        // Then loop through the cards in the array to see if there's a match.
            
        // If the guess is successful, print System.out.println("Congratulations, you guessed right!");.
            for(int i = 0; i < hand.length; i++){
                if(inputValue == hand[i].getValue() && Card.SUITS[inputSuit].equals(hand[i].getSuit())){
                    printInfo();
                }
            }
    }

    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author Ye Li Jan 26, 2023
     */
    private static void printInfo() {
    
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Ye.");
        System.out.println();
        
        System.out.println("My career ambitions:");
        System.out.println("-- Be more active on LinkedIn");
        System.out.println("-- Practice more to familiar with software development skills");
	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("-- Eating");
        System.out.println("-- Hiking");
        System.out.println("-- Reading");
        System.out.println("-- Shopping");

        System.out.println();
        
    
    }

}
