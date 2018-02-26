// Since Dog extends Animal it gets all of Animals fields and methods
// This is called inheritance
public class Dog extends Animal {

	public Dog() {

	}

	// You can override Animal's method makeSound()
	public String makeSound() {

		return "Woof";

	}

	public static void main(String[] args) {

		Dog fido = new Dog();

		// Inherited Method from Animal class
		fido.setName("Fido");

		// Inherited Method from Animal class
		System.out.println(fido.getName());

	}

}
