package week06CodingAssignment;

import java.util.ArrayList;

import java.util.List;

public class Player {
	
	/* Player Class Objectives:
	 * i. Fields 
	 * 		1. hand (List of Card) 
	 * 		2. score (set to 0 in the constructor) 
	 * 		3. name
	 * 
	 * ii. Methods 
	 * 		1.	describe (prints out information about the player and calls
	 * 			the describe method for each card in the Hand List) 
	 * 		2.	flip (removes and returns the top card of the Hand) 
	 * 		3.	draw (takes a Deck as an argument and
	 * 			calls the draw method on the deck,
	 * 			adding the returned Card to the hand field) 
	 * 		4.  incrementScore (adds 1 to the Player’s score field)
	 */
	
	// Player Hand
	List<Card> playerHand = new ArrayList<Card>();
	
	// Player Score
	int score;
	
	// Player Name
	String name;
	
	
	/** Describe the Player Name and Their Hand
	 * 
	 */
	public void describePlayer() {
		System.out.println(this.name);
		for (Card cards : playerHand) {
			System.out.println(cards.name);
		}
	}
	
	/** Flip a Card Over (Play A Card)
	 * @return card from playerHand
	 */
	public Card flip() {
		Card card = this.playerHand.remove(0);
		return card;
	}
	
	/**
	 * Draw A Card
	 * @return card
	 */
	public void playerDraw(Deck deck) {
		for (int i = 0; i < 26; i++) {
			Card card = deck.draw();
			this.playerHand.add(card);
		}
	}
	
	/** Increase Player Score By One
	 * 
	 */
	public void incrementScore() {
		this.score++;
	}
	
	/** Get the Player's Hand
	 * @return the playerHand
	 */
	public List<Card> getPlayerHand() {
		return playerHand;
	}
	
	/** Set the Player's Hand
	 * @param playerHand the playerHand to set
	 */
	public void setPlayerHand(List<Card> playerHand) {
		this.playerHand = playerHand;
	}
	
	/** Get the Player's Score
	 * @return the score
	 */
	public int getScore() {
		return score;
	}
	
	/** Set the Player's Score
	 * @param score the score to set
	 */
	public void setScore(int score) {
		this.score = score;
	}
	
	/** Get the Player's Name
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	/** Set the Player's Name
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	
} // End of Player Class
