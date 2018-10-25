/**
 * Akira Morales
 * Craps Project
 * Period 6
 */
import java.util.Scanner;
public class Craps {

	public static void main(String[] args)
	{
		Dice die1 = new Dice();
		Dice die2 = new Dice();
		Scanner in = new Scanner(System.in);
		boolean playAgain = true;
		int val1 = die1.roll();
		int val2 = die2.roll();
		
		while (playAgain)
		{
			System.out.println("Welcome to the craps game!\nPlease press enter to roll the dice.");
			in.nextLine();
			die1.roll();
			die2.roll();
			System.out.println(die1.die1Val() + val1 + die2.die2Val() + val2);
			if(val1 + val2 == 7 || val1 + val2 == 11)
			{
				System.out.println("Congradulations, you win!");
			}
			else if(val1 + val2 == 2 || val1 + val2 == 12)
			{
				System.out.println("You lose.");
			}
			else
			{
				while(val1 + val2 != val1 + val2)
				{
					System.out.println("Press enter to roll again.");
					in.nextLine();
				}
			}
		}
	}

}
