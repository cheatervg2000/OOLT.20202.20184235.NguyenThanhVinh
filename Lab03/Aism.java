package lab03;

public class Aism {
	public static void main(String[] args) {
		Order anOrder = new Order();
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King");
		dvd1.setCategory ("Animation");
		dvd1.setCost (19.95f);
		dvd1.setDirector ("Roder Allers");
		dvd1.setLength (87);
		anOrder.addDigitalVideoDisc(dvd1);
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars");
		dvd1.setCategory ("Science Fiction");
		dvd1.setCost (24.95f);
		dvd1.setDirector ("George Lucas");
		dvd1.setLength (124);
		anOrder.addDigitalVideoDisc(dvd2);
		
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin");
		dvd1.setCategory ("Animation");
		dvd1.setCost (18.99f);
		dvd1.setDirector ("John Musker");
		dvd1.setLength (90);
		anOrder.addDigitalVideoDisc(dvd3);
		
		System.out.print("Total cost is: ");
		System.out.println(anOrder.totalCost());
		
			//Remove dvd3 in order
		/*
		anOrder.removeDigitalVideoDisc(dvd3);
		System.out.print("Total cost is: ");
		System.out.println(anOrder.totalCost());
		*/
		
		System.exit(0);
	}

}
