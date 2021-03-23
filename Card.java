
public class Card {
	public int ranknum;
	public int suitnum;
	public String rank;
	public String suit;
	public String cardDisplay;
	public int value;
	
	//suit 0-3 each stand for clubs, spades, diamonds, hearts respectively 
	//rank 0-12 each stand for  ace, 2,3,4... Jack, Queen, King respectively  
	
	public Card(int ranknum, int suitnum) {
		this.ranknum = ranknum;
		this.suitnum = suitnum;
		
		//assign a suit number to a suit string
		if (suitnum ==0) {this.suit = "C";}
		if (suitnum ==1) {this.suit = "S";}
		if (suitnum ==2) {this.suit = "D";}
		if (suitnum ==3) {this.suit = "H";}

		
		
		//assign ranknum to a card string rank
		if (ranknum == 0) {this.rank = "A"; value = 1;}
		if (ranknum ==1) {this.rank = "2";value = 2;}
		if (ranknum == 2) {this.rank = "3";value = 3;}
		if (ranknum == 3) {this.rank = "4";value = 4;}
		if (ranknum == 4) {this.rank = "5";value = 5;}
		if (ranknum == 5) {this.rank = "6";value = 6;}
		if (ranknum == 6) {this.rank = "7";value = 7;}
		if (ranknum == 7) {this.rank = "8";value = 8;}
		if (ranknum == 8) {this.rank = "9";value = 9;}
		if (ranknum == 9) {this.rank = "10";value = 10;}
		if (ranknum == 10) {this.rank = "J";value = 10;}
		if (ranknum == 11) {this.rank = "Q";value = 10;}
		if (ranknum == 12) {this.rank = "K";value = 10;}
		
		//assign the card display value ex. "KH" is King of Hearts
		
		cardDisplay = rank + suit;
		
	

	}
}
	
