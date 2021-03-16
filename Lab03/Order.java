package lab03;

public class Order {
	public static final int MAX_NUMBERS_ORDERED = 10;
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	private int qtyOrdered = 0;
	
	public void addDigitalVideoDisc (DigitalVideoDisc disc) {
		if (qtyOrdered < MAX_NUMBERS_ORDERED) {
			itemsOrdered[qtyOrdered] = disc;
			System.out.println("The disc has been added");
			qtyOrdered ++;
		}
		else System.out.println("The order is almost full");
	}
	
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		int n = 0;
		for(int i = 0; i < qtyOrdered; i++) {
			if(disc.equals(itemsOrdered[i])) {
				for(int j = i; j < qtyOrdered - 1; j++) {
					itemsOrdered[j] = itemsOrdered[j+1];
				}
				System.out.println("The disc has been removed");
				qtyOrdered--;
				n = 1;
				return;
			}
		}
		if (n == 0) {
			System.out.println("Item does not exist in the ordered list");
		}
	}
	
	public float totalCost() {
		float Total = 0;
		for(int i = 0; i < qtyOrdered; i++) {
			Total += itemsOrdered[i].getCost();
		}
		return Total;
	}

}
