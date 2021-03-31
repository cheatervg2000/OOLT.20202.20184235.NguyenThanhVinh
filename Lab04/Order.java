package lab04;

public class Order {
	private static final int MAX_LIMTED_ORDERED = 5;
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_LIMTED_ORDERED];
	private int qtyOrdered = 0;
	private static MyDate dateOrdered = new MyDate();	
	private static int nbOrders = 0;
	
	public int getQtyOrdered() {
		return qtyOrdered;
	}

	public void setQtyOrdered(int qtyOrdered) {
		this.qtyOrdered = qtyOrdered;
	}

	public void addDigitalVideoDisc (DigitalVideoDisc disc) {
		if (qtyOrdered < MAX_LIMTED_ORDERED) {
			itemsOrdered[qtyOrdered] = disc;
			System.out.println("The disc has been added");
			qtyOrdered ++;
		}
		else System.out.println("The order is almost full");
	}
	
	public void addDigitalVideoDisc (DigitalVideoDisc [] dvdList) {
		if (dvdList != null && (qtyOrdered + dvdList.length > MAX_LIMTED_ORDERED)) {
			System.out.println("Cannot be added to the current order because of full ordered items");
		}else{
            for(int i = 0 ; i < dvdList.length ; i++){
                addDigitalVideoDisc(dvdList[i]);
             }
         }
	}
	
	public void addDigitalVideoDisc (DigitalVideoDisc dvd1,DigitalVideoDisc dvd2) {
		if(qtyOrdered > MAX_LIMTED_ORDERED - 2){
            if(qtyOrdered == MAX_LIMTED_ORDERED - 1){
                addDigitalVideoDisc(dvd1);
                System.out.println("The dvd "+ dvd2.getTitle()+" could not be added . ");
            }
            else {
                System.out.println("The item quantity has reached its limit");
            }
        }
        else{
            addDigitalVideoDisc(dvd1);
            addDigitalVideoDisc(dvd2);
        }
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
	
	public void ListofOrderedItems() {
        int day = dateOrdered.getDay();
        int month = dateOrdered.getMonth();
        int year = dateOrdered.getYear();
        System.out.println("***********************Order***********************");
        System.out.printf("Date: %d/%d/%d\n", day, month, year);
        for (int i = 0; i < nbOrders; i++) {
            String title = itemsOrdered[i].getTitle();
            String category = itemsOrdered[i].getCategory();
            String director = itemsOrdered[i].getDirector();
            int length = itemsOrdered[i].getLength();
            float cost = itemsOrdered[i].getCost();
            System.out.printf("%d. DVD-%s-%s-%s-%d-%f\n", i + 1, title, category, director, length, cost);
        }
        float cost = totalCost();
        System.out.println("Total cost: " + cost);
        System.out.println("***************************************************");
    }

	
	public float totalCost() {
		float Total = 0;
		for(int i = 0; i < qtyOrdered; i++) {
			Total += itemsOrdered[i].getCost();
		}
		return Total;
	}
}
