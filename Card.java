public class Card {
	public String rank;
	public String suit;
	
	Card (String rank, String suit) {
		this.rank = rank;
		this.suit = suit;
	}
	
	public String toString() {
		return "\n"+rank+" "+suit;
	}
}
