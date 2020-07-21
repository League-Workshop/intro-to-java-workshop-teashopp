package section4;

import java.awt.print.Printable;
import java.util.Random;

import javax.swing.JOptionPane;

public class AwesomeOrNot {

	// 1. Make a main method that includes all the steps below…
	public static void main(String [] args) { 
	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
		Random rand = new Random();
		int var = rand.nextInt(4);
	// 3. Print out this variable
		JOptionPane.showMessageDialog(null, var);
	// 4. Get the user to enter something that they think is awesome
		JOptionPane.showInputDialog("What is something you think is awesome?");
	// 5. If the random number is 0
		if (var ==0) {
	// -- tell the user whatever they entered is awesome!
			JOptionPane.showMessageDialog(null,"That is awesome!");
		}
	// 6. If the random number is 1
		else if(var ==1){
	// -- tell the user whatever they entered is ok.
			JOptionPane.showMessageDialog(null, "Eh, that's ok I guess...");
		}
	// 7. If the random number is 2
		else if(var ==2){
	// -- tell the user whatever they entered is boring.
			JOptionPane.showMessageDialog(null,"That's pretty boring.");
		}
	// 8. If the random number is 3
		else {
	// -- write your own answer
			JOptionPane.showMessageDialog(null,"Fantastic!");
		
		}
	}
}


