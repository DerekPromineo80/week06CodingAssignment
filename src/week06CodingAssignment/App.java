package week06CodingAssignment;


public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* APP Class Objectives:
		 * 
		 * A. 	Instantiate a Deck and two Players, 
		 * 		call the shuffle method on the deck. 
		 * 
		 * B. 	Using a traditional for loop, iterate 52 times 
		 * 		calling the Draw method on the other player 
		 * 		each iteration using the Deck you instantiated.
		 * 
		 * C.	Using a traditional for loop, iterate 26 times 
		 * 		and call the flip method for each player.
		 * 		Compare the value of each card returned by 
		 * 		the two player’s flip methods. 
		 * 		Call the incrementScore method on the player 
		 * 		whose card has the higher value.  
		 * 		Print a message to say which player received a point. 
		 * 		Note:  If the values are equal 
		 * 		(it is a tie), 
		 * 		print a message saying that no point was awarded.
		 * 
		 * D.	After the loop, compare the final score from each player.
		 * 
		 * E.	Print the final score of each player and 
		 * 		either “Player 1”, “Player 2”, or “Draw” 
		 * 		depending on which score is higher 
		 * 		or if they are both the same.
		 */
		
		 System.out.println(" - + - + - + - + - + - + - + - + - ");
		 System.out.println("           Game of WAR:            ");
		 System.out.println(" - + - + - + - + - + - + - + - + - ");
		 System.out.println();

		 
		 Deck deck = new Deck();
		 deck.shuffle();
		 
		 System.out.println("Shuffled Deck: ");
		 System.out.println("---------------");
		 deck.describe();
		 
		 System.out.println();
		 System.out.println(" - + - + - + - + - + - + - + - + - ");
		 System.out.println("             PLAYERS:              ");
		 System.out.println(" - + - + - + - + - + - + - + - + - ");
		 System.out.println();
		 
		 Player player1 = new Player();
		 Player player2 = new Player();
		 
		 player1.setName("Player 1");
		 player2.setName("Player 2");
		 
		 System.out.println(player1.getName());
		 System.out.println(player2.getName());
		 
		 System.out.println();
		 System.out.println(" - + - + - + - + - + - + - + - + - ");
		 System.out.println("            DEAL CARDS...          ");
		 System.out.println(" - + - + - + - + - + - + - + - + - ");
		 System.out.println();
		 
		 // Method ignored due to App Instructions for "52 loop"
//		 player1.playerDraw(deck);
//		 player2.playerDraw(deck);
		 
		 
		 for (int i = 0; i < 52; i++) {
			 if (i % 2 == 1) {
				 player1.getPlayerHand().add(deck.draw());
			 }
			 if (i % 2 == 0) {
				 player2.getPlayerHand().add(deck.draw());
			 }
		 }
		 
		 System.out.println();
		 System.out.println("  :: Each Player Gets 26 Cards ::");
		 System.out.println();
		 
		 System.out.println();
		 System.out.println(" - + - + - + - + - + - + - + - + - ");
		 System.out.println("              BEGIN!!              ");
		 System.out.println(" - + - + - + - + - + - + - + - + - ");
		 System.out.println();
		 
		 
		 for (int i = 0; i < 26; i++) {
			 System.out.println("Round " + (i + 1) + ": ");
			 Card p1flip = player1.flip(); 
			 System.out.print("Player 1 card is: ");
			 p1flip.describe();
			 Card p2flip = player2.flip();
			 System.out.print("Player 2 card is: ");
			 p2flip.describe();
			 
			 if (p1flip.getValue() > p2flip.getValue()) {
				 player1.incrementScore();
				 System.out.println("Point goes to Player 1!");
			 } else if (p2flip.getValue() > p1flip.getValue()) {
				 player2.incrementScore();
				 System.out.println("Point goes to Player 2!");
			 } else {
				 System.out.println("TIE: NO POINT AWARDED TO EITHER PLAYER");
			 }
			 
			 System.out.println("Player 1 Score Now: " + player1.getScore());
			 System.out.println("Player 2 Score Now: " + player2.getScore());
			 System.out.println();
			 
			 if (i == 25) {
				 System.out.println();
				 System.out.println(" - + - + - + - + - + - + - + - + - ");
				 System.out.println();
				 System.out.println("     Player 1 Final Score: " + player1.getScore());
				 System.out.println("     Player 2 Final Score: " + player2.getScore());
				 System.out.println();
			 }
		 }
		
		 
		 System.out.println(" - + - + - + - + - + - + - + - + - ");
		 System.out.println();
		 System.out.println("             GAME OVER:            ");
		 if (player1.getScore() > player2.getScore()) {
			 System.out.println("           Player 1 WINS!");
		 } else if (player1.getScore() < player2.getScore()) {
			 System.out.println("           Player 2 WINS!");
		 } else {
			 System.out.println("                DRAW!    ");
		 }
		 System.out.println();
		 System.out.println(" - + - + - + - + - + - + - + - + - ");

		 
		 // Testing methods again:
//		 Deck deck2 = new Deck();
//		 deck2.shuffle();
//		 player1.playerDraw(deck2);
//		 player2.playerDraw(deck2);
//		 for (int i = 0; i < 52; i++) {
//			 if (i % 2 == 1) {
//				 player1.getPlayerHand().add(deck2.draw());
//			 }
//			 if (i % 2 == 0) {
//				 player2.getPlayerHand().add(deck2.draw());
//			 }
//		 }
//		 player1.describePlayer();
//		 player2.describePlayer();
		 
		 
	} // End of Class

	
	
	
	
	
	
	
	
	
	
	
	
}
