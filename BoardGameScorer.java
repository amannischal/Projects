
public class BoardGameScorer {
	int score =0;
	
	public int BjsScore(GameBoard game) {
		// intial totals per row per columns
		int row1 =0;
		int row2 =0; 
		int row3 =0;
		int row4 =0;
		
		int col1 =0;
		int col2 =0;
		int col3 =0;
		int col4 =0;
		int col5 =0;
		
		// row 1
		for (int i=0; i<5; i++) 
		{
			row1 += game.board[0][i].value; 
		}
		//check value of Aces 
		for (int i=0; i<5; i++)
		{
			if (game.board[0][i].rank=="A") {
				if (10 + row1 <= 21) { row1 += 10;}
			}
		}
		//row 2
		for (int i=0; i<5; i++) 
		{
			row2 += game.board[1][i].value; 
		}
		for (int i=0; i<5; i++)
		{
			if (game.board[1][i].rank=="A") {
				if (10 + row2 <= 21) { row2 += 10;}
			}
		}
		//row 3
		for (int i=1; i<4; i++) 
		{
			row3 += game.board[2][i].value; 
		}
		for (int i=1; i<4; i++)
		{
			if (game.board[2][i].rank=="A") {
				if (10 + row3 <= 21) { row3 += 10;}
			}
		}
		// row 4 
		for (int i=1; i<4; i++) 
		{
			row4 += game.board[3][i].value; 
		}
		for (int i=1; i<4; i++)
		{
			if (game.board[3][i].rank=="A") {
				if (10 + row4 <= 21) { row4 += 10;}
			}
		}
		
		// column 1
		for (int i=0; i<2; i++) 
		{
			col1 += game.board[i][0].value; 
		}
		for (int i=0; i<2; i++)
		{
			if (game.board[i][0].rank=="A") 
			{
			if (10 + col1 <= 21) { col1 += 10;}
			}
		}
		// column 2
		for (int i=0; i<4; i++) 
		{
			col2 += game.board[i][1].value; 
				}
		for (int i=0; i<4; i++)
		{
			if (game.board[i][1].rank=="A") 
			{
			if (10 + col2 <= 21) { col2 += 10;}
			}
		}
		// column 3
		for (int i=0; i<4; i++) 
		{
			col3 += game.board[i][2].value; 
				}
		for (int i=0; i<4; i++)
		{
			if (game.board[i][2].rank=="A") 
			{
			if (10 + col3 <= 21) { col3 += 10;}
			}
		}
		// column 4
		for (int i=0; i<4; i++) 
		{
			col4 += game.board[i][3].value; 
				}
		for (int i=0; i<4; i++)
		{
			if (game.board[i][3].rank=="A") 
			{
			if (10 + col4 <= 21) { col4 += 10;}
			}
		}
		// column 5
		for (int i=0; i<2; i++) 
		{
			col5 += game.board[i][4].value; 
				}
		for (int i=0; i<2; i++)
		{
			if (game.board[i][4].rank=="A") 
			{
			if (10 + col5 <= 21) { col5 += 10;}
			}
		}
	 
		
		
		
		//calc scoring based on totals per row and column
		if (row1 <= 16) {score += 1;}
		else if (row1 == 17) {score += 2;}
		else if (row1 == 18) {score += 3;}
		else if (row1 == 19) {score += 4;}
		else if (row1 == 20) {score += 5;}
		else if (row1 == 21) {score += 7;}
		else if (row1 >= 22) {score += 0;}
		
		if (row2 <= 16) {score += 1;}
		else if (row2 == 17) {score += 2;}
		else if (row2 == 18) {score += 3;}
		else if (row2 == 19) {score += 4;}
		else if (row2 == 20) {score += 5;}
		else if (row2 == 21) {score += 7;}
		else if (row2 >= 22) {score += 0;}
		
		if (row3 <= 16) {score += 1;}
		else if (row3 == 17) {score += 2;}
		else if (row3 == 18) {score += 3;}
		else if (row3 == 19) {score += 4;}
		else if (row3 == 20) {score += 5;}
		else if (row3 == 21) {score += 7;}
		else if (row3 >= 22) {score += 0;}
		
		if (row4 <= 16) {score += 1;}
		else if (row4 == 17) {score += 2;}
		else if (row4 == 18) {score += 3;}
		else if (row4 == 19) {score += 4;}
		else if (row4 == 20) {score += 5;}
		else if (row4 == 21) {score += 7;}
		else if (row4 >= 22) {score += 0;}
		
		//Scoring for the first and last column differ bc you can get blackjack
		
		if (col1 <= 16) {score += 1;}
		else if (col1 == 17) {score += 2;}
		else if (col1 == 18) {score += 3;}
		else if (col1 == 19) {score += 4;}
		else if (col1 == 20) {score += 5;}
		else if (col1 == 21) {score += 10;}
		else if (col1 >= 22) {score += 0;}
		
		if (col2 <= 16) {score += 1;}
		else if (col2 == 17) {score += 2;}
		else if (col2 == 18) {score += 3;}
		else if (col2 == 19) {score += 4;}
		else if (col2 == 20) {score += 5;}
		else if (col2 == 21) {score += 7;}
		else if (col2 >= 22) {score += 0;}
		
		if (col3 <= 16) {score += 1;}
		else if (col3 == 17) {score += 2;}
		else if (col3 == 18) {score += 3;}
		else if (col3 == 19) {score += 4;}
		else if (col3 == 20) {score += 5;}
		else if (col3 == 21) {score += 7;}
		else if (col3 >= 22) {score += 0;}
		
		if (col4 <= 16) {score += 1;}
		else if (col4 == 17) {score += 2;}
		else if (col4 == 18) {score += 3;}
		else if (col4 == 19) {score += 4;}
		else if (col4 == 20) {score += 5;}
		else if (col4 == 21) {score += 7;}
		else if (col4 >= 22) {score += 0;}
		
		if (col5 <= 16) {score += 1;}
		else if (col5 == 17) {score += 2;}
		else if (col5 == 18) {score += 3;}
		else if (col5 == 19) {score += 4;}
		else if (col5 == 20) {score += 5;}
		else if (col5 == 21) {score += 10;}
		else if (col5 >= 22) {score += 0;}
		
		return score;
		
	}

}
