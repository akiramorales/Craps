/**
 * 
 * @author Akira Morales
 * Dice
 * Roll, numRoll, Reset
 */
public class Dice
{
	//Fields
	private int val;
	private String dieDisplay;
	//Constructors
	public Dice()
	{
	val = 0;
	dieDisplay = "";
	}
	//Methods
	public int roll()
	{		
		val = (int)(Math.random()*6+1);
		return val;
	}
	/**
	 * Returns the value of the roll
	 * @return Math.random()*6+1
	 */
	public String die1Val()
	{
		if(val == 1)
		{
			dieDisplay = "__________\n|         |\n|         |\n|         |\n|         |\n__________";
		}
		else if(val == 2)
		{
			dieDisplay ="__________\n|         |\n|         |\n|         |\n|         |\n__________";
		}
		else if(val == 3)
		{
			dieDisplay = "__________\n|         |\n|         |\n|         |\n|         |\n__________";
		}
		else if(val == 4)
		{
			dieDisplay = "__________\n|         |\n|         |\n|         |\n|         |\n__________";
		}
		else if(val == 5)
		{
			dieDisplay = "__________\n|         |\n|         |\n|         |\n|         |\n__________";
		}
		else if(val == 6)
		{
			dieDisplay = "__________\n|         |\n|         |\n|         |\n|         |\n__________";
		}
		return dieDisplay;
	}
	
	public String die2Val()
	{
		if(val == 1)
		{
			dieDisplay = "__________\n|         |\n|         |\n|         |\n|         |\n__________";
		}
		else if(val == 2)
		{
			dieDisplay ="__________\n|         |\n|         |\n|         |\n|         |\n__________";
		}
		else if(val == 3)
		{
			dieDisplay = "__________\n|         |\n|         |\n|         |\n|         |\n__________";
		}
		else if(val == 4)
		{
			dieDisplay = "__________\n|         |\n|         |\n|         |\n|         |\n__________";
		}
		else if(val == 5)
		{
			dieDisplay = "__________\n|         |\n|         |\n|         |\n|         |\n__________";
		}
		else if(val == 6)
		{
			dieDisplay = "__________\n|         |\n|         |\n|         |\n|         |\n__________";
		}
		return dieDisplay;
	}
	
}
