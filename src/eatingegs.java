import javax.swing.JOptionPane;

public class eatingegs {
public static void main(String[] args) {
	
	
	String chill = JOptionPane.showInputDialog("How many eggs do you want to eat");
	
	int bill = Integer.parseInt(chill);
	System.out.println(bill);
	
	if (bill<48) {
		JOptionPane.showMessageDialog(null,"Dont eat more than you are eating");
	}
	
	if (bill>48) {
		JOptionPane.showMessageDialog(null,"You are eating to much eggs EAT LESS YOUR GETING FAT");
	}
	
	if (bill==48) {
		JOptionPane.showMessageDialog(null,"You are eating a lot of eggs. They give you diabetes");
		
	}
	
	
	
	
	
	
	
	
	
	
	

	
}
}