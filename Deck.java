import java.util.*;

public class Deck {
	Card[] deck;
	
	Deck(){
		this.deck = new Card[52];
	}
	
	//creates and returns a full deck of 52 cards a
	public Card[] generateDeck() { 
		int k =0;
		for (int i=0; i<13; i++) 
			{
			for (int j=0; j<4; j++) 
			{
				this.deck[k] = new Card(i,j);
				k++;
				}	
			}
		return this.deck; 
		}
	
	
	/*Creates a random array of numbers from 0-51 then 
	 * assigns those values in in the array to a the card deck
	 */
	
	public Card[] shuffle() {
		Integer[] order = new Integer[52];
		for (int i=0;i<52;i++) {
			order[i] = i; 
		}
		
		List<Integer> orderList = Arrays.asList(order);
		Collections.shuffle(orderList);
		int[] array = orderList.stream().mapToInt(i->i).toArray();	
		
		Card[] shuff = new Card[52];
		for (int i =0; i< deck.length; i++) {
			int x = array[i];
			shuff[i] = deck[x]; 
			}
		this.deck = shuff; 
		return this.deck; 
		
	}
}

