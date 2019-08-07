import javax.swing.JOptionPane;

public class mystory {
public static void main(String[] args) {
	
	String food = JOptionPane.showInputDialog("Which dragon do you want to take an Ice or Poisen dragon");
	
	if (food.equals("Ice")) {
		JOptionPane.showMessageDialog(null,"So you chose an Ice dragon. You must think what to do with it.");
	}
	
	else if (food.equals("Poisen")) {
		JOptionPane.showMessageDialog(null,"Nice you chose a good dragon but you still have to help it out");
	}
	
	String drink = JOptionPane.showInputDialog("You know have a dragon but you must train it. Want it to be a fighter or a helper");
	
	if (drink.equals("Fighter")) {
		JOptionPane.showMessageDialog(null,"You are training a dragon that will fight people that you chose and fight with you and be loyal");
	}
	
	else if (drink.equals("Helper")) {
		JOptionPane.showMessageDialog(null,"Ok so you are training a dragon that will help people and you but will also be loyal and fight for you");
	}
	
	String lab = JOptionPane.showInputDialog("What habitat would you chose for your dragon. A cave or a forest");
	
	if (lab.equals("Cave")) {
		JOptionPane.showMessageDialog(null,"You chose a cave that is dirty");
	}
	
	else if (lab.equals("Forset")) {
		JOptionPane.showMessageDialog(null,"You have a forest that is dirty with life.");
	}
	
	String last = JOptionPane.showInputDialog("You could clean up your space and be spotted easy or not clean it up and not be spotted easy");
	
	if (last.equals("Clean")) {
		JOptionPane.showMessageDialog(null,"So you chose to clean up your space now you are spotted ");
	}
	
	else if (last.equals("Not clean")) {
		JOptionPane.showMessageDialog(null,"You chose to not clean up you just got spotted by wood cutters");
	}
	
	
	
	
	
	
	
	
	
}
}