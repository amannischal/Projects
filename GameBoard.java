
public class GameBoard {
	Card[][] board;
	boolean gameOver = false; 
	
	GameBoard() {
		this.board = new Card[6][5];
		
	}
	/*
	 * This method scans the gameboard for null cards. If the spot is null then it prints out the 
	 * spot number. If however it is not null then it will print out the card display
	 */
	public void display(GameBoard b) {
		for (int i =0; i<6; i++) {
			for (int j=0;j<5;j++) {
				if (b.board[i][j] == null) {
					if(i==0) {int spot = j+1; System.out.print("  "+spot+"  ");}
					if (i ==1) {int spot = j +6; System.out.print("  "+spot+"  ");}
					if(i ==2 && j==1) {System.out.print("  11  ");}
			        if (i ==2 && j==0) {System.out.print("    "); }
			        if (i ==2 && j==2) {System.out.print("  12  "); }
			        if (i ==2 && j==3) {System.out.print("  13  "); }
			        if (i ==2 && j==4) {System.out.print("    "); }
			        if(i ==3 && j==1) {System.out.print("  14  ");}
			        if (i ==3 && j==0) {System.out.print("    "); }
			        if (i ==3 && j==2) {System.out.print("  15  "); }
			        if (i ==3 && j==3) {System.out.print("  16  "); }
			        if (i ==3 && j==4) {System.out.print("    "); }
			        if (i ==4) {System.out.print("    "); }
		            if(i ==5 && j==1) {System.out.print("  18  ");}
		            if (i ==5 && j==0) {System.out.print("  17  "); }
			        if (i ==5 && j==2) {System.out.print("  19  "); }
			        if (i ==5 && j==3) {System.out.print("  20  "); }
			        if (i ==5 && j==4) {System.out.print("    "); }
				}
				else {System.out.print("   "+b.board[i][j].cardDisplay+" ");
				}
			}
			System.out.println("   ");
		}
	}
	/*
	 * This method checks to see if all the spots on the gameboard have been filled.
	 * If they have been then the boolean gameOver is changed to true. meaning the game is over
	 */
	void checkGame(Card[][] game) {
		if (game[0][0] != null  && game[0][1]!=null && game[0][2]!=null &&
			game[0][3] != null && game[0][4] != null && game[1][0] != null &&
			game[1][1] != null  && game[1][2] != null && game[1][3] != null &&
			game[1][4] != null  && game[2][1] != null && game[2][2] != null &&
			game[2][3] != null && game[3][1] != null && game[3][2] != null &&
			game[3][3] != null) 
		{gameOver = true;}
	
	}
	
}


