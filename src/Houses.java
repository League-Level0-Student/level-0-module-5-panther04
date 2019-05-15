import java.awt.Color;
import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	public static Robot noice;
	public static void main(String[] args) {
		noice = new Robot();
		noice.setWindowColor(Color.BLACK);
		noice.hide();
		noice.setSpeed(50);
		noice.moveTo(5, 500);
		noice.penDown();
		noice.setPenColor(Color.ORANGE);
		noice.move(100);
		noice.turn(90);
		noice.move(50);
		noice.turn(90);
		noice.move(100);
			drawgrass();

		for (int i = 0; i < 10; i++) {
			noice.setRandomPenColor();
			noice.turn(-90);
			Random walk = new Random();
			int talk = walk.nextInt(401) + 100;
System.out.println(talk);
		if (talk<150) {
			noice.penDown();
			noice.setPenColor(Color.ORANGE);
			noice.move(100);
			noice.turn(90);
			noice.move(50);
			noice.turn(90);
			noice.move(100);
				drawgrass();
		}else {
			
		
				noice.move(talk);
				noice.turn(45);
				noice.move(20);
				noice.turn(90);
				noice.move(20);
				noice.turn(45);
				noice.move(talk);
		
				drawgrass();
		}
		}

	}
	
	public static void drawgrass() {
		noice.turn(270);
		noice.setPenColor(Color.green);
		noice.move(20);
	}
}
