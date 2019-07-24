import javax.swing.JOptionPane;

public class horoscope {
public static void main(String[] args) {
	
	
	String bottle = JOptionPane.showInputDialog("What is your star sign");
	
		
	if (bottle.equals("Aries")) {
		JOptionPane.showMessageDialog(null, "The Ram. A Fire Sign, Ruled by Mars");
	}
	
	else if (bottle.equals("Taurus")) {
		JOptionPane.showMessageDialog(null,"The Bull. An Earth Sign, Ruled by Venus");
	}
	
	else if (bottle.equals("The Twins")) {
		JOptionPane.showMessageDialog(null,"The Twins. An Air Sign, Ruled by Mercury");
	}

	else if (bottle.equals("The Crab")) {
		JOptionPane.showMessageDialog(null,"The Crab. An Water Sign, Ruled by the Moon");
	}
	
	else if (bottle.equals("The Lion")) {
		JOptionPane.showMessageDialog(null,"The Lion. A Fire Sign, Ruled by the Sun");
	}
	
	else if (bottle.equals("Virgo")) {
		JOptionPane.showMessageDialog(null,"The Maiden. An Earth sign, ruled by Mercury");
	}
	
	else if (bottle.equals("Libra")) {
		JOptionPane.showMessageDialog(null,"The Scales. An Air sign, ruled by Venus");
	}
	
	else if (bottle.equals("Scorpio")) {
		JOptionPane.showMessageDialog(null,"The Scorpion. A Water sign, ruled by Pluto");
	}
	
	else if (bottle.equals("Sagittarius")) {
		JOptionPane.showMessageDialog(null,"The Centaur. A Fire sign, ruled by Jupiter");
	}
	
	else if (bottle.equals("Capricorn")) {
		JOptionPane.showMessageDialog(null,"The Mountain Goat. An Earth sign, ruled by Saturn");
	}
	
	else if (bottle.equals("Aquarius")) {
		JOptionPane.showMessageDialog(null,"The Man who Carries Water. An Air sign, ruled by Uranus");
	}
	
	else if (bottle.equals("Pisces")) {
		JOptionPane.showMessageDialog(null,"The Fish. A Water sign, ruled by Neptune");
	}
	else {
		JOptionPane.showMessageDialog(null,"Tht is not a star sign");
	}
}
}