package blackjack;

public class Main {
	
	public static void main(String[] args) {
		
		int dealer = 14;
		int player = 17;
		
		System.out.println("The winning hand belongs to " + blackjackWinner(dealer, player) + " who got " + blackjackResult(dealer, player));
		
	}
	
	public static int blackjackResult(int dealer, int player) {
		if(dealer < 1 || player < 1) {
			return 0;
		} else if(dealer > player) {
			return dealer;
		} else {
			return player;
		}
			
		
	}
	
	public static String blackjackWinner(int dealer, int player) {
		if(dealer > player) {
			return "dealer";
		} else {
			return "player";
		}
	}

}
