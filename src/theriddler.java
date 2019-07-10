import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;

public class theriddler {
public static void main(String[] args) {
	
	int score = 0;
	
	String the = JOptionPane.showInputDialog("Who makes it, has no need of it.\n" + 
			"Who buys it, has no use for it. \n" + 
			"Who uses it can neither see nor feel it. \n" + 
			"What is it?");
	
	if (the.equals("a coffin")) {
		JOptionPane.showMessageDialog(null,"Nice job just 1 more");
		score=score+1;
		
	}
	else {
		JOptionPane.showMessageDialog(null,"Nice try but you still got it wrong");
	}
	
	JOptionPane.showMessageDialog(null,score);
	
	String joy = JOptionPane.showInputDialog("What can travel around the world while staying in a corner?\n" + 
			"\n" + 
			"");
	
	if (joy.equals("a stamp")) {
		JOptionPane.showMessageDialog(null,"That was an easy one");
		score=score+1;
	}
	else {
		JOptionPane.showMessageDialog(null,"That was sooooo easy how did you get it wrong?");
	}
	
		JOptionPane.showMessageDialog(null,score);	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}