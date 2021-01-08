package _05_vault;

import javax.swing.JOptionPane;

public class Vault {
	int secretCode = 153469;
	
	Vault(int c){
		secretCode = c;
	}
	
	public static void main(String[] args) {
		Vault vault = new Vault(5453);
		JamesBond james = new JamesBond();
		int k = james.findCode(vault);
		System.out.println(k);
		boolean g = vault.tryCode(k);
		if (g == true) {
			JOptionPane.showMessageDialog(null, "The vault was opened!");
		}
		else {
			JOptionPane.showMessageDialog(null, "Failed to open vault");
		}
	}
	

	boolean tryCode(int x) {
		if (x == secretCode) {
			return true;
		} else {
			return false;
		}
	}
}