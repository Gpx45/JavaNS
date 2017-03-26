
public class DeckOfCards_Test {

	public static void main(String[] args){
		
		DeckOfCards myCards = new DeckOfCards();
		myCards.shuffle();
		
		for(int i = 1; i <= 52; i++){
			System.out.printf("%-19s" , myCards.dealCard());
			
			if(i % 4 == 0)
				System.out.println();
		}
		
	}
	
}
