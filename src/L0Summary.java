import java.util.Random;

import javax.swing.JOptionPane;

public class L0Summary {
public static void main(String[] args) {
	
	
//	int six =7;
//	
//	String seven = new String("carpet");
//	
//	if (six == 7) {
//		JOptionPane.showMessageDialog(null, "hello");
//	}
//	if (seven.equals("carpet")) {
//		JOptionPane.showMessageDialog(null, "Good bye");
//	}
//	
//	for (int i = 0; i < 17; i++) {
//		JOptionPane.showMessageDialog(null,"apple");
//	}
//	Random lot= new Random();
//	
//	
//	int a = lot.nextInt(101);
//	System.out.println(a);
	
	functionOne();
	functionTwo("help",04);
	
}

	static void functionOne() {
		String x = "";
		x += (char)('I' - 1);
		x += (char)('F' - 1);
		x += (char)('M' - 1);
		x += (char)('M' - 1);
		x += (char)('P' - 1);
		JOptionPane.showMessageDialog(null, x);
	}
	
	static void functionTwo(String w, int v) {
		for(int i = 0; i < v; i++) {
			System.out.println(w);
		}
	}
}
