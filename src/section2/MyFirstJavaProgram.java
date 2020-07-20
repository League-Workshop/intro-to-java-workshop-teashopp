package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
	Robot ethan = new Robot () ;
	
	ethan.setSpeed(100);
	ethan.penDown();
	ethan.setPenColor(Color.CYAN);
	
	for (int i = 0; i < 4; i++) {
		
		ethan.move(100);
		ethan.turn(90);
		
	}
	
	int x = 0;
	while(x<10) {
		
		System.out.println("hello");
		
	}
	
	
	}
}
