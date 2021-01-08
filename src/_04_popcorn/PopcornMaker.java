package _04_popcorn;

import javax.swing.JOptionPane;

public class PopcornMaker {
	public static void main(String[] args) {
		Microwave a = new Microwave();
		String c = JOptionPane.showInputDialog("What flavor of popcorn do you want?");
		Popcorn b = new Popcorn(c);
		String d = JOptionPane.showInputDialog("How long would you like to cook it for?");
		// Ask the user for the flavor of the popcorn and the number of minutes to cook
		// it.
		a.putInMicrowave(b);
		int e = Integer.parseInt(d);
		a.setTime(e);
		a.startMicrowave();
	}
}
