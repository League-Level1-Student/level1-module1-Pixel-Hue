package _04_popcorn;

import javax.swing.JOptionPane;

public class PopcornMaker {
public static void main(String[] args) {
	Microwave a = new Microwave();
	String c = JOptionPane.showInputDialog("What flavor of popcorn do you want?");
	Popcorn b = new Popcorn(c);
	//Ask the user for the flavor of the popcorn and the number of minutes to cook it.
	a.putInMicrowave(b);
}
}
