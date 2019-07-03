import javax.swing.JOptionPane;

public class sumnum2 {
public static void main(String[] args) {
	
	String four = JOptionPane.showInputDialog("How many numbers do you want to enter");
	int five = Integer.parseInt(four);
	int six = 0;
	for (int i = 0; i < five; i++) {
		String seven = JOptionPane.showInputDialog("enter a number" );
		int eight = Integer.parseInt(seven);
		six=six+eight;
	}
	JOptionPane.showMessageDialog(null,"" + six);
	
	
	
	
	
	
	
	
	
	
}
}