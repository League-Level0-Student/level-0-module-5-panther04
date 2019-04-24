import java.awt.Color;
import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
public static void main(String[] args) {
	
	Robot noice = new Robot();
	noice.setWindowColor(Color.BLACK);
	noice.hide();
	noice.setSpeed(100);
	noice.moveTo(5, 500);
	noice.penDown();
	noice.move(100);
	noice.turn(90);
	noice.move(50);
	noice.turn(90);
	noice.move(100);
	noice.turn(270);
	noice.setPenColor(Color.green);
	noice.move(20);
	for (int i = 0; i < 10; i++) {
	noice.hide();
	noice.setSpeed(10);	
	noice.setRandomPenColor();
	noice.turn(-90);
	Random walk = new Random();
	int talk=walk.nextInt(401)+100;
	noice.move(talk);
	noice.turn(90);
	noice.move(50);
	noice.turn(90);
	noice.move(talk);
	noice.turn(90);
	noice.setPenColor(Color.green);
	noice.move(20);
	}
	
}
}
