import java.util.Random;

public class Dice {// declare dice class

	private static int roll = 0;
	public static int diceall;
	
	public static int  Throw()
    {
        roll = new Random().nextInt(6)+1; //roll of the dice
        return roll;
    }
    public static int Throw(int dice)//roll certain amount a dice, pass through parameters
    {
        
        for (int i = 0; i < dice; i++)
        {
        diceall = diceall + Throw();
        }
    roll = diceall;
    return roll;
    }

}
