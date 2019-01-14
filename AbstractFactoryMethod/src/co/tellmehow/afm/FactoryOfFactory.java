package co.tellmehow.afm;

import co.tellmehow.afm.factory.LaptopFactory;
import co.tellmehow.afm.factory.MobileFactory;

public class FactoryOfFactory {

	public static FactoryProducer getFactory(String s) {
		if(s.equalsIgnoreCase("mobile")) {
			return new MobileFactory();
		}
		else {
			return new LaptopFactory();
		}
	}

}
