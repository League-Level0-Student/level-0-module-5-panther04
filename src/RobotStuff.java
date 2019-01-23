import org.jointheleague.graphical.robot.Robot;

public class RobotStuff {
public static void main(String[] args) {
	
	Robot myu=new Robot();
	
	for (int i = 0; i < 4; i++) {
	
	
	myu.penDown();
	myu.setSpeed(100);
	myu.move(200);
	myu.turn(90);
	
	
	
}
}
}