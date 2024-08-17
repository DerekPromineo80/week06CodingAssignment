package week06CodingAssignment;

public class Card {

	/* Card Class Objectives:
	 * i. Fields 
	 * 		1.	value (contains a value from 2-14 representing cards 2-Ace)
	 * 		2.	name (e.g. Ace of Diamonds, or Two of Hearts)
	 * 
	 * ii. Methods
	 * 		1.	Getters and Setters 
	 * 		2.	describe (prints out information about a card)
	 */
	
	// Name of Card (Face of Suit)
	String name;
	
	// Value of Card (What Points it is Worth)
	int value;
	
	
	/**
	 * New Card
	 * @param name Face of Suit
	 * @param value Points It Is Worth
	 */
	Card(String name, int value) {
		this.name = name;
		this.value = value;
	}

	/**
	 * Get the Name of the Card
	 * @return
	 */
	public String getName() {
		return name;
	}

	/**
	 * Set the Name of the Card
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Get the Value of the Card
	 * @return
	 */
	public int getValue() {
		return value;
	}

	/**
	 * Set the Value of the Card
	 * @param value
	 */
	public void setValue(int value) {
		this.value = value;
	}
	
	/** Describe Cards:
	 * Prints Out A Card's Name and Value
	 */
	public void describe() {
		System.out.println(this.name + " -- " + this.value);
	}

} // End of Card Class



