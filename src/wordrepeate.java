import javax.swing.JOptionPane;

public class wordrepeate {
public static void main(String[] args) {
	
	String laptop = JOptionPane.showInputDialog("What word/name do u want");
	String toplap = JOptionPane.showInputDialog("what number do u wnat");
	
	int lap = Integer.parseInt(toplap);
	for (int i = 0; i < lap; i++) {
		System.out.println(i+": "+laptop);
	}
	
	
	
	
	
	
	
}
}
