import javax.swing.JOptionPane;
public class RandomGuess
{
	public static void main(String [] args)
	{
		//Varaibales and constants 
		int guess;
		int randomNum;
		int attemps = 1;
		String message;
		final int HIGH = 10;
		final int LOW = 1;

		//Statment with the random number between 1 and 10
		randomNum = LOW + (int)(Math.random() * HIGH);

		//Promts the user for their guess and changes it from a string to an integer
		guess = Integer.parseInt(JOptionPane.showInputDialog(null, "Guess a number between " + LOW + " and " + HIGH));

		while(guess != randomNum)
		{
			if(guess < randomNum)
				message = "Your guess was too low ~~~";
			else 
				message = "Your guess was too high ~~~";
			guess = Integer.parseInt(JOptionPane.showInputDialog(null, message + "\nGuess a number between " + LOW + " and " + HIGH));
			++attemps;

		}

		JOptionPane.showMessageDialog(null, "YAYYYYY, YOU GUESS IT! \nIt took you " + attemps + " attemps" );
	}
}