import javax.swing.JOptionPane;

public class prime {
public static void main(String[] args) {
	String kill =JOptionPane.showInputDialog("Type in a random number");

	int die = Integer.parseInt(kill);
	
	for (int i = 0; i <= die; i++) {
		if (i%2==0) {
			
		
		System.out.println(i+"even");
	}
		if (i%2==1) {
			
			System.out.println(i+"odd");
		}
	}
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
