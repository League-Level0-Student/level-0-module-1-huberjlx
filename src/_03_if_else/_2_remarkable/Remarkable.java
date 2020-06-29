package _03_if_else._2_remarkable;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class Remarkable {
public static void main(String[] args) {

		// 1. Save something remarkable about each person in a variable.

		// 2. Ask the user to enter a name. Store their answer in a variable.

		// 3. In a pop-up, tell the user what is remarkable about that person. 
String millan = "Really Good At League Of Legends"; 
String andrew = "Is very good at support";
String john = "Is really good at cs go";

String Name = JOptionPane.showInputDialog(null, "What is your name?");

if (Name.equalsIgnoreCase(millan)) {
	JOptionPane.showMessageDialog(null,"Really Good At League Of Legends");
	
}
else if (Name.equalsIgnoreCase(andrew)) {
	JOptionPane.showMessageDialog(null, "Is very good at support");
}
else if (Name.equalsIgnoreCase(john)) {
	JOptionPane.showMessageDialog(null, "Is really good at cs go");	
}
	}
}

