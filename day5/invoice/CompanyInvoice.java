package day5.invoice;

import java.util.ArrayList;
import java.util.Scanner;

/** This class interacts with the user, asking for a list of items purchased
 * and then prints an appropriate invoice for that customer.
 **/
public class CompanyInvoice {

	/**
	 * This method reads a list of items to purchase from the user and returns
	 * the list as an ItemList.
	 */
	public static ArrayList<Item> readItems() {
		Scanner input = new Scanner(System.in);

		ArrayList<Item> l = new ArrayList<>();

		System.out
				.println("Please enter the name of the first item purchased.");
		String name = input.nextLine();
		name = name.trim();

		while (name.length() > 0) {
			System.out.println("How many of these were purchased?");
			int quantity = input.nextInt();
			input.nextLine();

			System.out.println("How much does each cost?");
			float cost = input.nextFloat();
			input.nextLine();

			Item i = new Item(name, quantity, cost);
			l.add(i);

			System.out
					.println("Please enter the name of the next item or press enter to print invoice.");
			name = input.nextLine();
			name = name.trim();
		}
		input.close();
		
		return l;
	}

	/** This method prints an invoice for the items in ItemList. */
	public static void printInvoice(ArrayList<Item> l) {
		double totalCost = 0;
		int totalItems = l.size();
		System.out.printf("\n-------------------------------------------\n\n");
		System.out.printf("Invoice:\n\n");
		System.out.printf("%-30s%8s%12s%12s\n", "Item Name", "Quantity",
				"Unit Price", "Total");

		for (int i = 0; i < totalItems; i++) {
			Item item = l.get(i);
			totalCost += item.getTotal();
			System.out.printf("%-30s%8d%12.2f%12.2f\n", item.getName(),
					item.getQuantity(), item.getUnitPrice(), item.getTotal());
		}
		
		System.out.printf("\nTotal Cost: %.2f", totalCost);
	}

	public static void main (String arg[])
	{
		ArrayList<Item> list = readItems();
		printInvoice (list);
	}

}
