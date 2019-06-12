import javax.swing.JOptionPane;

public class NumRepeat {
public static void main(String[] args) {
	
	String earth = JOptionPane.showInputDialog("What number do you want");
	
	String quake = JOptionPane.showInputDialog("What word do you want");
	
	int seven = Integer.parseInt(earth);
	System.out.println(seven);
	
	for (int i = 0; i < seven; i++) {
		System.out.print(i+"    ");
		System.out.println(quake);
	}
	
	
	
	
	
	
}
}