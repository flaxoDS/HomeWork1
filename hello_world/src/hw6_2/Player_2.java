package hw6_2;
import java.util.Scanner;

public class Player_2 {
	static BetMoreGame BetMoreGame = new BetMoreGame();
	
	 
	public  int Play() {
    Scanner Scanner = new Scanner(System.in);	
    
	int i = 0;
	int x= 0;
	while( i < 5) {
		 x = BetMoreGame.pickCard();
		System.out.println("Your current number is "+x);
		System.out.println("If you accept the number write 'y'");
		String answer = Scanner.nextLine();
		
		if(answer.equals("y")) {
			
			i=10;
			break;
			
		}
		
		i++;
	    }
	
	return x;
	}
	

}
