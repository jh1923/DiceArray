/**
 * 
 * @author Julia Hu
 * Dice
 *
 */
public class Dice 
{
	//Methods
	
	/**
	 * 
	 * @return int (int)(Math.random()*6)+1
	 * returns an integer between and including 1 and 6
	 */
	public int rollDice()
	{	
		return (int)(Math.random()*6)+1;
	}
}