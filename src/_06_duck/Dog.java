package _06_duck;

public class Dog {
static String ownersName;
static int numOfFoodEveryMeal;
public static void main(String[] args) {
	Dog dog = new Dog(ownersName, numOfFoodEveryMeal);
	dog.sit();
	dog.bark();
}
void sit(){
	System.out.println("Sit");
}
void bark() {
	System.out.println("Bark");
}
Dog(String ownersName, int numOfFoodEveryMeal) {
    this.ownersName = ownersName;
    this.numOfFoodEveryMeal = numOfFoodEveryMeal;
}
}
