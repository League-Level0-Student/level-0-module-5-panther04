import javax.swing.JOptionPane;

public class XGeeks {
public static void main(String[] args) {
	
	
	
	String reginasPower = "to get good grades";
	
	
	String elijahsPower = "Creating portals";
	
	
	String maxPower = "yes";
	
	String idk = JOptionPane.showInputDialog("Which persons power do u want to see first");
	

	if (idk.equals("regina")) {
		JOptionPane.showMessageDialog(null,reginasPower);
	}
	
	
		if (idk.equals("elijah")) {
		JOptionPane.showMessageDialog(null,elijahsPower);
	}
	
	
	if (idk.equals("max")) {
		JOptionPane.showMessageDialog(null,maxPower);
	}
	else {
		JOptionPane.showMessageDialog(null,"You picked the wrong persons so there is no power");
	}
	
	
	
	
	
	
	
	
	
	

	
}
}