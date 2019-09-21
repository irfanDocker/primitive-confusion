package solutions.techcircle.javaRecaps;

public class TestMain {

	public static void main(String[] args) {

		
		Iphone iphone = new Iphone();
		
		Alexa a = new Alexa();
		
		Clock clock = new Clock();
		
		
		
		
		
		testingAlarm(iphone);
		
		testingAlarm(a);
		
		testingAlarm(clock);
		
		
		
		
		
		
		
		
		
		
		//Animal a = new Animal();
		
//		Animal myDog = new Dog();
////		myDog.walk();
////		myDog.makeSound();
//		
//		
//		
//		Animal myCat = new Cat();
////		myCat.walk();
////		myCat.makeSound();
////		
//		
//		Animal myHorse = new Horse();
//		myHorse.walk();
//		myHorse.makeSound();
		
		
//		Animal[] zoo = {myDog, myCat , myHorse,new Horse(),new Horse(),new Horse(),new Horse()};
//		
//		for (Animal animal : zoo) {
//			//animal.makeSound();
//			
//			test(animal);
//		}
//		
		
//		myDog
//		Dog d = new Dog();
//		Cat c = new Cat();
//		Horse h = new Horse();
//		
//		test(d);
//		test(c);
//		test(h);
//		
		
//		test(new Dog());
//		test(new Cat());
//		test(new Horse());
		
		
		
//		MethodOverloading myObj = new MethodOverloading();
//
//		
//		int areaOfSquare = myObj.getArea(10);
//		
//		System.out.println("Area of square is with int : "+ areaOfSquare);
//		
//		
//		
//		double areaOfSquareD = myObj.getArea(2.3);
//		
//		System.out.println("Area of square is with double : "+ areaOfSquareD);
//		
//		
//		int areaOfRectangle = myObj.getArea(10, 5);
//		
//		
//		System.out.println("Area of rectangle is with int : "+ areaOfRectangle);
		
	}
	
	
	private static void testingAlarm(Alarm c) {
		c.setAlarm();
	}
	
	
	private static void test(Animal d) {
		d.walk();
		d.makeSound();
		d.eat();
	}
//	private static void test(Dog d) {
//		d.walk();
//		d.makeSound();
//	}
//	
//	
//	private static void test(Cat d) {
//		d.walk();
//		d.makeSound();
//	}
//	
//	
//	private static void test(Horse d) {
//		d.walk();
//		d.makeSound();
//	}

}
