package hw6_2;

public class BetMoreGame {
	Shuffle Shuffle = new Shuffle();
	public int pickCard() {
		int x = Shuffle.random.nextInt(100)+1;
		return x;
	}

}
