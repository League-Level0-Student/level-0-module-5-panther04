import javax.swing.JOptionPane;

public class sumnum {
public static void main(String[] args) {
	
	String applw = JOptionPane.showInputDialog("Gust give me 1 number");
	String apple = JOptionPane.showInputDialog("Another number");
	String applr = JOptionPane.showInputDialog("Another #");
	String applt = JOptionPane.showInputDialog("Another #");
	String apurple=JOptionPane.showInputDialog("I think you know you have to give me another #"); 
	
	int google = Integer.parseInt(applw);
	
	int googlw = Integer.parseInt(apple);
	
	int googla = Integer.parseInt(applr);
	
	int gooogl = Integer.parseInt(applt);
	
	int gogels = Integer.parseInt(apurple);
	
	
	JOptionPane.showMessageDialog(null, google + googlw + googla + gooogl + gogels);
}
}