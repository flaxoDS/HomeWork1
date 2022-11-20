package hw6_2;

public class GameChair {
	static Computer Computer = new Computer();
	static Player_2 Player_2 = new Player_2();
	private  int x;
	private int y;
	
	public static void main(String[] args) {
		Start();
	}
	public static void Start() {
		int Computer_x;
		int Player_2_x;
		Computer_x = Computer.Play();
		Player_2_x = Player_2.Play();
		String winner = FindWinner(Computer_x, Player_2_x);
		
		
	}
	public static String FindWinner(int computer, int player) {
		String string = "Es gibt keinen Gewinner";
		if(computer>player) {
			string = "Computer";
		}else {
			string = "Player_2";
		}
		System.out.println("Computer: "+computer);
		System.out.println("Player_2: "+player);
		System.out.println(string+" hat gewonnen");
		return string;
		
	}
	
	
}
