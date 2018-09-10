package day5.invoice;


/** An item represents a single type of item being purchased by a customer.  This class 
 * encapsulates the information about this line item, including the name, quantity, and 
 * unit price.
 */
public class Item {
	private String name;
	private int quantity;
	private double unitPrice;

	/** Constructs a new item with the given name, quantity, and unit price. */
	public Item(String name, int quantity, double unitPrice) {
		this.name = name;
		this.quantity = quantity;
		this.unitPrice = unitPrice;
	}

	/**
	 * Returns the total cost of the item based upon the quantity and unit
	 * price.
	 */
	public double getTotal() {
		return quantity * unitPrice;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
}
