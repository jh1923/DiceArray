/**
 * 
 * @author Julia Hu
 * DiceArray main
 *
 */
public class DiceArray 
{

	public static void main(String[] args)
	{
		//array
		int [] values = new int[13];
		
		//creates two dice objects
		Dice dice1 = new Dice();
		Dice dice2 = new Dice();
		
		//two variables for each roll
		int roll1;
		int roll2;
		
		//rolls two dice, sums them, and adds 1 for each instance of given sum
		for (int i=0; i<1000; i++)
		{
			roll1 = dice1.rollDice();
			roll2 = dice2.rollDice();
			int sum = roll1 + roll2;
			values [sum]++;
		}
		
		//displays number and corresponding number of rolls
		for (int i=2; i<13; i++)
		{
			System.out.println("You rolled " + i + " " +  values[i] + " times.");
		}

	}

}
