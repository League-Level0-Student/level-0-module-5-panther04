import org.jointheleague.graphical.robot.Robot;
public class SomethingRandom {
public static void main(String[] args) {

	Robot dumb = new Robot();
	
	dumb.penDown();
	dumb.setSpeed(10);
	dumb.hide();
	for (int i = 0; i < 4; i++) {
		dumb.move(100);
		dumb.turn(90);
	}
	
	
	
	
	
}
}