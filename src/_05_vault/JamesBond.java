package _05_vault;

public class JamesBond {
	public static void main(String[] args) {
		
	}
int findCode(Vault a) {
	for (int i = 0; i <= 1000000; i++) {
		
		boolean o = a.tryCode(i);
		if (o == true) {
			return i;
		}
	}
	return -1;
	
}
}
