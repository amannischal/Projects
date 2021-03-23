
import java.util.*;

public class BlackjackSolitaire {
	Card[] gameDeck;
	Card currentCard;
	GameBoard bjsBoard;
	int position; 
	BoardGameScorer scorer; 
	
	
	
	public void play() {
		//Create and shuffle a new deck of cards 
		Deck gameDeck = new Deck();
		this.gameDeck = gameDeck.generateDeck();
		this.gameDeck = gameDeck.shuffle();
		
		bjsBoard = new GameBoard();
		int i=0;
		
		// While the gameboard still has null spots continue playing the game
		while (!bjsBoard.gameOver) {
				System.out.println("***** spots 17-20 are discard spots ******");
				bjsBoard.display(bjsBoard);
				System.out.println("******************************************");
				Scanner s = new Scanner(System.in); 
				System.out.println("Your Card is: " + this.gameDeck[i].cardDisplay);
				System.out.println("Type in where to place your card on the board:");
				currentCard = this.gameDeck[i];
				this.position = s.nextInt();
				if (this.position >0 && this.position <= 5 && this.bjsBoard.board[0][position-1] == null) 
					{this.bjsBoard.board[0][position-1] = currentCard;}
				else if (this.position >=6 && this.position <= 10 && this.bjsBoard.board[1][position-6] == null) 
					{this.bjsBoard.board[1][position-6] = currentCard;}
				else if (this.position >=11 && this.position <= 13 && this.bjsBoard.board[2][position-10] == null)
					{this.bjsBoard.board[2][position-10] = currentCard;}
				else if (this.position>= 14 && this.position <= 16 && this.bjsBoard.board[3][position-13] == null)
					{this.bjsBoard.board[3][position-13] = currentCard;}
				else if (this.position>= 17 && this.position <= 20 && this.bjsBoard.board[5][position-17] == null)
					{this.bjsBoard.board[5][position-17] = currentCard;}
				else {System.out.println("Sorry that spot is taken please select an open spot from thr board");i--;}
				
				bjsBoard.checkGame(bjsBoard.board);
				i++;
		}
		//When the game is over, call the scorer method to show the final score. 
		bjsBoard.display(bjsBoard);
		System.out.println("***************GAME OVER***************");
		scorer = new BoardGameScorer(); 
		System.out.println("YOUR SCORE IS: "+scorer.BjsScore(bjsBoard));
		
		
	}
}
