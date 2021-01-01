package _02_cat;

public class CatRunner {
	public static void main(String[] args) {
		Cat a = new Cat("bob");
		a.meow();
		a.printName();
		for (int i = 0; i < 9; i++) {
			a.kill();
		}
	}
}
