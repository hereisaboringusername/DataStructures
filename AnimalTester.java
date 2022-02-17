
public class AnimalTester {

	final static int SIZE=10;
	public static void main(String[] args) {

		Animal[] animalTester = new Animal[SIZE];

		Fish fish = new Fish();
		fish.setColor("Orange");

		Fish Fish1 = new Fish();
		Fish1.setColor("Blue");

		Fish Fish2 = new Fish();
		Fish2.setColor("Black");

		Dog dog = new Dog();
		dog.setFurColor("Black");

		Dog Dog2 = new Dog();
		Dog2.setFurColor("Purple");

		Dog Dog3 = new Dog();
		Dog3.setFurColor("Orange");

		Dog Dog4 = new Dog();
		Dog4.setFurColor("Blue");

		GuardDog guardDog = new GuardDog();
		guardDog.setFurColor("White");
		guardDog.setMeanness((short)2);

		GuardDog guardDog1 = new GuardDog();
		guardDog1.setFurColor("Gray");
		guardDog1.setMeanness((short)3);


		ShowDog showDog = new ShowDog();
		showDog.setFurColor("White");
		showDog.setBreed("Golden Retriever");


		animalTester[0] = fish;
		animalTester[1] = dog;
		animalTester[2] = guardDog;
		animalTester[3] = showDog;
		animalTester[4] = Fish1;
		animalTester[5] = Fish2;
		animalTester[6] = Dog2;
		animalTester[7] = Dog3;
		animalTester[8] = Dog4;
		animalTester[9] = guardDog1;


		for (Animal animal : animalTester) {
			System.out.println(animal);
			animal.makeSound();
			animal.move();

		}
	}
}


