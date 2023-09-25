/* ************************************************************************** */
/*                                                                            */
/*                                                 :       ::    :: ::   ::   */
/*   StaticMethodsAndProperties.java              :+:      :+    :+ :+  :+    */
/*                                               +:+:+     :+    :+ :+  :+    */
/*   By: ykliek <yurii.kliek@auk.edu.ua>        +#   :+    +#    :+ +#:+      */
/*                                             +#+#+#+#+   +#    +# +# +#     */
/*   Created: 2023/09/25 21:49:50 by ykliek   #+       #+  #+    #+ #+  #+    */
/*   Updated: 2023/09/25 21:49:52 by ykliek  ##         ##  ######  ##   ##   */
/*                                                                            */
/* ************************************************************************** */

package part_3;

public class StaticMethodsAndProperties {
	public static int staticVar; // static variable

	public static void staticMethod() { // static method
		System.out.println(
				"This is a static method. Static variable: " + staticVar);
//		nonStaticMethod(); // Uncommenting this will result in an error
	}

	public void nonStaticMethod() { // non-static method
		System.out.println(
				"This is a non-static method. Static variable: " + staticVar);
		staticMethod(); // Accessing static method inside non-static method
	}

	public static void main(String[] args) {
		// Accessing and modifying static variable using class name
		StaticMethodsAndProperties.staticVar = 5;
		System.out.println(
				"Static variable using class name: " +
						StaticMethodsAndProperties.staticVar);

		// Creating objects of the class
		StaticMethodsAndProperties obi = new StaticMethodsAndProperties();
		StaticMethodsAndProperties wan = new StaticMethodsAndProperties();

		// Modifying static variable using an object
		obi.staticVar = 10;

		// Checking the value of static variable using both objects
		System.out.println("Static variable using obi: " + obi.staticVar);
		System.out.println("Static variable using wan: " + wan.staticVar);

		// Calling static method using class name
		StaticMethodsAndProperties.staticMethod();

		// Accessing static and non-static methods inside the class
		obi.nonStaticMethod();
	}
}
