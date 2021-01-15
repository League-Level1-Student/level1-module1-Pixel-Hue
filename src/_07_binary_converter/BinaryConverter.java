package _07_binary_converter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryConverter implements ActionListener {
	
	JTextField d = new JTextField(20);
	JButton e = new JButton();
	JLabel c = new JLabel();
	JFrame a = new JFrame();
	JPanel b = new JPanel();
	JLabel o = new JLabel();
	
public void main() {
	
	
	

	c.setText("Convert");
	a.add(b);
	b.add(d);
	b.add(e);
	e.add(c);
	a.setVisible(true);
	b.add(o);
	o.setText("null");
	a.pack();
	e.addActionListener(this);
}


@Override
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
	String k = d.getText();
	System.out.println(k);
	String n = convert(k);
	o.setText(n);
}

String convert(String input) {
    if(input.length() != 8){
        JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
        return "-";
    }
    String binary = "[0-1]+";//must contain numbers in the given range
    if (!input.matches(binary)) {
        JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
        return "-";   
    }
    try {
        int asciiValue = Integer.parseInt(input, 2);
        char theLetter = (char) asciiValue;
        return "" + theLetter;
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
        return "-";
    }
}
}