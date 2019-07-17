import javax.swing.JOptionPane;

public class votingbooth {
public static void main(String[] args) {
	
	
	String six = JOptionPane.showInputDialog("How old are you in years");
	
	int seven =Integer.parseInt(six);
	
	if (seven > 18) {
		JOptionPane.showInputDialog("Who should the next president be");
	}
	
	else {
		JOptionPane.showMessageDialog(null,"Nobody cares about your idea");
	}
	
	
	
	
	
	
	
	
	
	
	
}
}