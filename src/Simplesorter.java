import javax.swing.JOptionPane;

public class Simplesorter {
	public static void main(String[] args) {

		String goal = JOptionPane.showInputDialog("Put in a random number");
		String step = JOptionPane.showInputDialog("Put another random number");
		String help = JOptionPane.showInputDialog("Put another random number");

		int simple = Integer.parseInt(goal);
		int sorter = Integer.parseInt(step);
		int mouse = Integer.parseInt(help);

		if (simple < sorter && simple < mouse) {
			System.out.println(simple);

			if (sorter < mouse) {
				System.out.println(sorter);
				System.out.println(mouse);
			} else {
				System.out.println(mouse);
				System.out.println(sorter);
			}

		}

		if (sorter < simple && sorter < mouse) {
			System.out.println(sorter);
			if (simple < mouse) {
				System.out.println(simple);
				System.out.println(mouse);
			} else {
				System.out.println(mouse);
				System.out.println(simple);
			}
		}
		
		if (mouse<sorter && mouse<simple) {
			System.out.println(mouse);
		if (sorter<simple) {
			System.out.println(sorter);
			System.out.println(simple);
		}
		else {
			System.out.println(simple);
			System.out.println(sorter);
		}
		}

	}
}
