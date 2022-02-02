package application;

public class App {

	public static void main(String[] args) {
		// Java doesn't have multiple inheritance per se
		// Java only allows you to extend one class
		// you can extend multiple interfaces though
		
		Person p1 = new Person();
		p1.speak();
		p1.greet();
		
		/* If we do this
		 * Speaker p2 = new Person();
		 * we get an error for p2.greet(); because
		 * Speaker know nothing about Greeter.  The
		 * Speaker variable p2 only knows what is 
		 * available to Speaker. The way around this is
		 * to cast it:
		 * ((Person)p1).greet();  Not recommended.
		 */

	}

}
