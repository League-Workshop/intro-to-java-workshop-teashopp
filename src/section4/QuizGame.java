package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
		int score = 0;
		// 2.  Ask the user a question 
		String ans0 = JOptionPane.showInputDialog("What number did Julius Peppers wear with the Packers?");
		// 3.  Use an if statement to check if their answer is correct
		if(ans0.equals("56")) {
		// 4.  if the user's answer was correct, add one to their score 
			JOptionPane.showMessageDialog(null, "Correct!");
			score += 1;
		}
		
		else {
			JOptionPane.showMessageDialog(null, "Incorrect");
			score -= 1;
		}
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
		String ans1 = JOptionPane.showInputDialog("Which team traded for Brett Favre after his initial retirement? (include city)");
		
		if(ans1.equalsIgnoreCase("New York Jets")) {
			JOptionPane.showMessageDialog(null, "Correct!");
			score += 1;
		}
		
		else {
			JOptionPane.showMessageDialog(null, "Incorrect!");
			score -= 1;
			
			}
		
		
		String ans2 = JOptionPane.showInputDialog("Who had a 17 yard pick-6 in Superbowl XLV?");
	
		if(ans2.equalsIgnoreCase("Nick Collins")) {
			JOptionPane.showMessageDialog(null, "Correct!");
			score += 1;
			}
		else {
			JOptionPane.showMessageDialog(null,"Incorrect");
			score -= 1;
			}
		// 6.  After all the questions have been asked, print the user's score 
		JOptionPane.showMessageDialog(null, "You scored: "+score);
		
	}
}
