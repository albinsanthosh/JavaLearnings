package oops;

class Animal {
}

class Dog4Downcasting extends Animal {
	static void method(Animal a) {
		Dog4Downcasting d = (Dog4Downcasting) a;// downcasting
		System.out.println("ok downcasting performed");
	}

	public static void main(String[] args) {
		Animal a = new Dog4Downcasting();
		Dog4Downcasting.method(a);
	}
}