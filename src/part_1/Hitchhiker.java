/* ************************************************************************** */
/*                                                                            */
/*                                                 :       ::    :: ::   ::   */
/*   Hitchhiker.java                              :+:      :+    :+ :+  :+    */
/*                                               +:+:+     :+    :+ :+  :+    */
/*   By: ykliek <yurii.kliek@auk.edu.ua>        +#   :+    +#    :+ +#:+      */
/*                                             +#+#+#+#+   +#    +# +# +#     */
/*   Created: 2023/09/25 21:07:55 by ykliek   #+       #+  #+    #+ #+  #+    */
/*   Updated: 2023/09/25 21:07:58 by ykliek  ##         ##  ######  ##   ##   */
/*                                                                            */
/* ************************************************************************** */

package part_1;

// 1.1 Class related to Hitchhiker's Guide - The Guide
class Guide {
	Guide() {
		System.out.println("Don't Panic!");
	}
}

// 2.1 Marvin the Paranoid Android
class Marvin {
	public void complain() {
		System.out.println("Here I am, brain the size of a planet, and they" +
				" ask me to write Java code. Call that job satisfaction?" +
				" 'Cause I don't.");
	}
}

// 3.1 Vogon Constructor Fleet - Private Poetry method
class Vogon {
	private void recitePoetry() {
		System.out.println(
				"Oh freddled gruntbuggly,\n" +
				"Thy micturitions are to me\n" +
				"As plurdled gabbleblotchits on a lurgid bee."
		);
	}
}

// 4.1 Class for Babel Fish with constructor
class BabelFish {
	BabelFish() {
		System.out.println("Babel fish is a small, leech-like, and yellow" +
				" fish, which can translate any spoken language instantly.");
	}
}

// 5.1 Class for Starship Heart of Gold with public properties
class HeartOfGold {
	public int improbabilityLevel = 42;
	public String currentLocation = "Magrathea";

	public void showProperties() {
		System.out.println("Improbability Level: " + improbabilityLevel);
		System.out.println("Current Location: " + currentLocation);
	}
}

// 6.1 Zaphod Beeblebrox with private properties
class Zaphod {
	private String title = "President of the Galaxy";
	private int heads = 2;

	private void brag() {
		System.out.println("I'm " + title + " and have " + heads + " heads!");
	}
}

// 7.1 Slartibartfast with private properties and public getters and setters
class Slartibartfast {
	private String award = "Award for the design of fjords in the coastline " +
			"of Norway";

	public String getAward() {
		return award;
	}

	public void setAward(String award) {
		this.award = award;
	}
}

// 8.1 Arthur Dent with constructor with arguments
class ArthurDent {
	private String mood;

	ArthurDent(String mood) {
		this.mood = mood;
		System.out.println("Arthur Dent is feeling " + mood + " today.");
	}
}

// Main Class
public class Hitchhiker {
	public static void main(String[] args) {
		// 1.1 Object creation
		Guide guide = new Guide();

		// 2.1 Public method call
		Marvin marvin = new Marvin();
		marvin.complain();

		// 3.1 Try calling private method - Uncommenting will cause an error
//		 Vogon vogon = new Vogon();
//		 vogon.recitePoetry(); // This will cause a compilation error

		// 4.1 Object creation will call the constructor
		BabelFish fish = new BabelFish();

		// 5.1 Accessing public properties through object and inside the class
		// from the methods
		HeartOfGold starship = new HeartOfGold();
		starship.showProperties();
		System.out.println(starship.improbabilityLevel);
		System.out.println(starship.currentLocation);

		// 6.1 Trying to access private properties – Uncommenting will cause
		// error
//		 Zaphod zaphod = new Zaphod();
//		 System.out.println(zaphod.title); // Error
//		 System.out.println(zaphod.heads); // Error

		// 7.1 Demonstrating the use of getters and setters
		Slartibartfast designer = new Slartibartfast();
		System.out.println(designer.getAward());
		designer.setAward("No Award");
		System.out.println(designer.getAward());

		// 8.1 Creating objects with constructors having arguments
		ArthurDent arthur = new ArthurDent("bemused");
	}
}
