package com.inheritance;

// Example of Hierarchical Inheritance
class Animal {
	void eat() {
		System.out.println("This animal eats food.");
	}
}

class Dog extends Animal {
	void bark() {
		System.out.println("The dog barks.");
	}
}

class Cat extends Animal {
	void meow() {
		System.out.println("The cat meows.");
	}
}

public class Test8 {
	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();

		System.out.println("Dog:");
		dog.eat();
		dog.bark();

		System.out.println("Cat:");
		cat.eat();
		cat.meow();
	}
}
