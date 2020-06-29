package _03_if_else._1_unbirthday;

import javax.swing.JOptionPane;

public class unbirthday {

	public static void main(String[] args) {
		
		String birthday = JOptionPane.showInputDialog(null, "When is your birthday?");
		if (birthday.equalsIgnoreCase("Today")) {
			
			JOptionPane.showMessageDialog(null, "Happy birthday");
		}
		else {
			JOptionPane.showMessageDialog(null, "Happy unbirthday");
		}
	}

}
