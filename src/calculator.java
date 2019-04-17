import javax.swing.JOptionPane;
import javax.swing.text.StyledEditorKit.ForegroundAction;

public class calculator {
	//1. make a main method
	public static void main(String[] args) {
		
	
	//2. ask the user for two numbers
	String rob = JOptionPane.showInputDialog("What number do u want.");
	String beery = JOptionPane.showInputDialog("Give me another number");
	//3. ask the user if they want to add or subtract
	String friends = JOptionPane.showInputDialog("Do u want to add or subtract or multiply or divide");
	//4. give them the result
	int mind = Integer.parseInt(rob);
	int ham = Integer.parseInt(beery);
	if (friends.contentEquals("add")) {
		JOptionPane.showMessageDialog(null,mind+ham);
	}
	if (friends.contentEquals("subtract")) {
		JOptionPane.showMessageDialog(null,mind-ham);
	}
	if (friends.contentEquals("multiply")) {
		JOptionPane.showMessageDialog(null,mind*ham);
	}
	if (friends.contentEquals("divide")) {
		JOptionPane.showMessageDialog(null,mind/ham);
	}
	
	
	System.out.println(rob+beery+friends);
	

	}
	}
