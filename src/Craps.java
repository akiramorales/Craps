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
		
		while (playAgain)
		{
		System.out.println("Welcome to the craps game!\nPlease press enter to roll the dice.");
		in.nextLine();
		int val1 = die1.roll();
		int val2 = die2.roll();
		System.out.print(die1.die1Val() + die2.die2Val());
		}
	}

}
