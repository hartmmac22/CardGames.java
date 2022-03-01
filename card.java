
import java.util.ArrayList;

public class Card {
	ArrayList<String> cards = new ArrayList<String>();
	ArrayList<String> dealtCards = new ArrayList<String>();
	
	public void deck() {
		String[] suit = {" Hearts", " Diamonds", " Spaids", " Clubs"};
		String[] ranks = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
		String temp;
	
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 12; j++) {
				temp = ranks[j] + suit[i];
				cards.add(temp);
			}
		}
		System.out.println(cards);
	}
	
	public boolean isEmpty() {
		if (cards.size() == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public int size() {
		return cards.size();
	}
	
	public void deal() {
		
	}
}
