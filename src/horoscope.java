import javax.swing.JOptionPane;

public class horoscope {
public static void main(String[] args) {
	
	
	String bottle = JOptionPane.showInputDialog("What is your star sign");
	
		
	if (bottle.equals("Aries")) {
		JOptionPane.showMessageDialog(null, "The Ram. A Fire Sign, Ruled by Mars");
	}
	
	if (bottle.equals("Taurus")) {
		JOptionPane.showMessageDialog(null,"The Bull. An Earth Sign, Ruled by Venus");
	}
	
	if (bottle.equals("The Twins")) {
		JOptionPane.showMessageDialog(null,"The Twins. An Air Sign, Ruled by Mercury");
	}

	if (bottle.equals("The Crab")) {
		JOptionPane.showMessageDialog(null,"The Crab. An Water Sign, Ruled by the Moon");
	}
	
	if (bottle.equals("The Lion")) {
		JOptionPane.showMessageDialog(null,"The Lion. A Fire Sign, Ruled by the Sun");
	}
	
	
	
	
	
	
}
}