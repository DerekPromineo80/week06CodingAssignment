package week06CodingAssignment;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;


public class Deck {

	/* Deck Class Objectives:
	 * i. Fields 
	 * 		1. cards (List of Card)
	 * 
	 * ii. Methods
	 * 		1. 	shuffle (randomizes the order of the cards)
	 * 		2. 	draw (removes and returns the top card of the Cards field)
	 *		3. 	In the constructor, when a new Deck is instantiated, 
	 *			the Cards field should be populated 
	 *			with the standard 52 cards.
	 */
	
	List<Card> cards = new ArrayList<Card>();
	
	/**
	 * Create a New Deck
	 */
	public Deck() {
		String[] suits = { "Clubs", "Diamonds", "Hearts", "Spades" };
		String[] numbers = { "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen",
				"King", "Ace" };

		for (String suit : suits) {
			int count = 2;
			for (String number : numbers) {
				String name = number + " of " + suit;
				Card card = new Card(name, count);
				this.cards.add(card);
				count++;
			}
		}
	}
	
	/** Shuffle
	 * Shuffle A Deck
	 */
	public void shuffle() {
		Collections.shuffle(this.cards);
	}
	
	/** Draw
	 * Draw A Card
	 * @return card
	 */
	public Card draw() {
		Card card = this.cards.remove(0);
		return card;
	}
	
	/** Describe
	 * Print Out the Entire Deck
	 */
	public void describe() {
		for (Card card : this.cards) {
			card.describe();
		}
	}

	/** Get The Cards
	 * @return the cards
	 */
	public List<Card> getCards() {
		return cards;
	}

	/** Set The Cards
	 * @param cards the cards to set
	 */
	public void setCards(List<Card> cards) {
		this.cards = cards;
	}
	
	
	
	
	
	
} // End of Deck Class
