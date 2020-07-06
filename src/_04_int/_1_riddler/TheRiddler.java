package _04_int._1_riddler;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
String answer = JOptionPane.showInputDialog(null, "32 white horses on a red hill. They stomp, and stamp, and buck. " + "\n"+
"Then they stop. What are they?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
if (answer.equalsIgnoreCase("teeth")) {
	
	JOptionPane.showMessageDialog(null, "Correct");
	score++;
}
		// 5. Otherwise, say "wrong" and tell them the answer
else {
	
	JOptionPane.showMessageDialog(null, "Wrong, it was teeth");
}
		// 6. Add some more riddles
String answer2 = JOptionPane.showInputDialog("It has many nuts and bolts. Shows people things." + "\n" +
		"It takes any input gives you anything back");
		// 2. Make a pop up to show the score.
		if (answer2.equalsIgnoreCase("a Computer")) {
			JOptionPane.showMessageDialog(null, "Correct");
			score++;
		}
		else {
			JOptionPane.showMessageDialog(null, "Wrong, it was a computer");
		}
		JOptionPane.showMessageDialog(null, score);
	}
}

