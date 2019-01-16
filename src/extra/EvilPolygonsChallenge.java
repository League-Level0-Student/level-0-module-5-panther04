package extra;
import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class EvilPolygonsChallenge {
	
	public static void main(String[] args) {
		
		//1. Create a new Robot
Robot sky = new Robot();
		//2. Set the speed to 100
	sky.setSpeed(100);
		int colorChoice=JOptionPane.showOptionDialog(null, "hello", "title", JOptionPane.INFORMATION_MESSAGE, JOptionPane.DEFAULT_OPTION, null, new String[]{"Red","Blue", "Pink"}, 0);
		
		//3. Use if statements to check the the value of colorChoice and set the pen color accordingly 
if (colorChoice==0) {
	sky.setPenColor(Color.RED);
}		
if (colorChoice==1) {
	sky.setPenColor(Color.BLUE);
}
if (colorChoice==2) {
	sky.setPenColor(Color.PINK);
}
		//4. Ask the use how many polygons they want to be drawn.
		String dave = JOptionPane.showInputDialog("how many polygons do you want drawn");
		//5. Use the robot to draw the number of polygons the user requested.
	
		//6. Make it so your shapes do not overlap

		//7. Challenge: add more colors to the Option Dialog.
	}
}

