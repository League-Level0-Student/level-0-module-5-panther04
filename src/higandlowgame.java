import java.util.Random;

import javax.swing.JOptionPane;

public class higandlowgame {
public static void main(String[] args) {
	
	
	Random app = new Random();
	int lab=app.nextInt(100);
	
	
	for (int i = 0; i <10; i++) {
		
	
	
	String mousf = JOptionPane.showInputDialog("I need you to guess a random number between 0-100");
	
	int no = Integer.parseInt(mousf);
	if (lab == no) {
		JOptionPane.showMessageDialog(null,"you got it right");
	}
	else if (lab < no) {
		JOptionPane.showMessageDialog(null, "go lower");
	}
	else if (lab > no) {
		JOptionPane.showMessageDialog(null,"go higher");
	}
	
	

	
	
	
	
	
	
	
	
	
	
	}
	
}
}