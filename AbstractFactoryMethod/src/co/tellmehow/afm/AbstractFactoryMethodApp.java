package co.tellmehow.afm;

public class AbstractFactoryMethodApp {

	public static void main(String[] args) {
		FactoryProducer fd = FactoryOfFactory.getFactory("laptop");
		Laptop l = fd.getLaptop("apple");
		l.getLaptopData();

	}

}
