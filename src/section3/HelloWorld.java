package section3;

import javax.swing.JOptionPane;

public class HelloWorld {

	public static void main(String[] args) {
		
		int x = 15;
		String y = "This is text";
		JOptionPane.showMessageDialog(null, y);
		String Input = JOptionPane.showInputDialog("Enter your name:");
		
		if (Input.equalsIgnoreCase("Bob")) {
				JOptionPane.showMessageDialog(null, "Hey Bob");
				
		}
		
		JOptionPane.showMessageDialog(null, "Hello, " + Input);
		
	}	
	
}
