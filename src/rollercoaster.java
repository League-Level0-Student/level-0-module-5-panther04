import javax.swing.JOptionPane;

public class rollercoaster {
public static void main(String[] args) {
	
	String luck = JOptionPane.showInputDialog("What is your height in inches");
	
	int club = Integer.parseInt(luck);
	
	if (club > 48) {
		JOptionPane.showMessageDialog(null,"You can go on the roller coaster");
	}
	
	if (club < 48) {
		JOptionPane.showMessageDialog(null,"You need to grow taller");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
}	
}