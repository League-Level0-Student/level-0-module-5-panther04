import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class obedientrobot {
public static void main(String[] args) {
	Robot nice = new Robot();
	nice.hide();
	nice.setSpeed(100);
	nice.penDown();
	
	String way = JOptionPane.showInputDialog("What shape do you want to draw a square a triangle or a sirsle");
	
	
	
	
	
	if (way.equals("square")) {
		
	
	
	for (int i = 0; i <4 ; i++) {
		nice.move(50);
		nice.turn(90);
			
	}
	}
	
	
	
	if (way.equals("triangle")) {
		
	
	nice.setX(40);
	for (int i = 0; i <3 ; i++) {
		
		nice.move(50);
		nice.turn(120);
			
	}
	}

	if (way.equals("sirsle")) {
		
	
	nice.setX(150);
for (int i = 0; i <360 ; i++) {
		
		nice.move(1);
		nice.turn(1);
			
	}
	}
	
	
	
	
	
	
	
	
	
}
}