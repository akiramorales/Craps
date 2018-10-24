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
	//Constructors
	public Dice()
	{
	val = 0;
	}
	//Methods
	public int roll()
	{		
		return (int)(Math.random()*6+1);
	}
	/**
	 * Returns the value of the roll
	 * @return Math.random()*6+1
	 */
	/**public String die1Val()
	{
		if(val == 1)
		{
			System.out.print("_____\n|    |\n|    |\n|    |\n|    |\n|    |\n_____");
		}
		else if(val == 2)
		{
			System.out.print(arg0);
		}
		else if(val == 3)
		{
			System.out.print(arg0);
		}
		else if(val == 4)
		{
			System.out.print(arg0);
		}else if(val == 5)
		{
			System.out.print(arg0);
		}else if(val == 6)
		{
			System.out.print(arg0);
		}
	}**/
	
}
