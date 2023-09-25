/* ************************************************************************** */
/*                                                                            */
/*                                                 :       ::    :: ::   ::   */
/*   Main.java                                    :+:      :+    :+ :+  :+    */
/*                                               +:+:+     :+    :+ :+  :+    */
/*   By: ykliek <yurii.kliek@auk.edu.ua>        +#   :+    +#    :+ +#:+      */
/*                                             +#+#+#+#+   +#    +# +# +#     */
/*   Created: 2023/09/25 21:50:02 by ykliek   #+       #+  #+    #+ #+  #+    */
/*   Updated: 2023/09/25 21:50:06 by ykliek  ##         ##  ######  ##   ##   */
/*                                                                            */
/* ************************************************************************** */

package part_4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		int[] prices = new int[5];
		String[] names = new String[5];

		// Taking user input for prices and names of pizzas
		for (int i = 0; i < 5; i++) {
			System.out.println(
					"How to you want to name your pizza " + (i + 1) + ": ");
			names[i] = scanner.nextLine();
			prices[i] = getUserInt(
					"Enter the price of your pizza " + (i + 1) + ": ");
			scanner.nextLine(); // consume the extra newline
		}

		Pizza[] pizzas = new Pizza[5];

		// Creating Pizza objects with user input data
		for (int i = 0; i < 5; i++) {
			pizzas[i] = new Pizza(prices[i], names[i]);
		}

		// Sorting Pizza array by price
		Arrays.sort(pizzas, Comparator.comparingInt(Pizza::getPrice));

		// Displaying sorted pizzas
		System.out.println("Pizzas in sorted order by price: ");
		for (Pizza pizza : pizzas) {
			System.out.println(pizza.getPizzaInfo());
		}

		scanner.close();
	}

	private static int getUserInt(String prompt) {
		System.out.println(prompt);
		while (!scanner.hasNextInt()) {
			System.out.println("InputError: Please enter a valid number: ");
			scanner.next();
		}
		return scanner.nextInt();
	}
}
