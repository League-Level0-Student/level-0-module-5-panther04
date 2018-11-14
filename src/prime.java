import javax.swing.JOptionPane;

public class prime {
	public static void main(String[] args) {
		String kill = JOptionPane.showInputDialog("Type in a random number");

		int die = Integer.parseInt(kill);
		boolean sico=true;
		for (int i = 2; i < die; i++) {
			if (die % i == 0) {
				sico=false;
				System.out.println("not prime");
				break;
			}

		}
		if (sico) {
			JOptionPane.showMessageDialog(null,"It is prime");
		}

	}
}
