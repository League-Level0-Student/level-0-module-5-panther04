import javax.swing.JOptionPane;

public class XGeeks {
public static void main(String[] args) {
	
	
	
	String reginasPower = "to get good grades";
	
	
	String elijahsPower = "Creating portals";
	
	
	String maxPower = "yes";
	
	String idk = JOptionPane.showInputDialog("Whos power do u want to see first");
	

	if (idk.equals("regina")) {
		JOptionPane.showMessageDialog(null,reginasPower);
	}
	
	
		if (idk.equals("elijha")) {
		JOptionPane.showMessageDialog(null,elijhasPower);
	}
	
	
	if (idk.equals("max")) {
		JOptionPane.showMessageDialog(null,maxPower);
	}
	else {
		JOptionPane.showMessageDialog(null,"WRONG");
	}
	
	
	
	
	
	
	
	
	
	

	
}
}