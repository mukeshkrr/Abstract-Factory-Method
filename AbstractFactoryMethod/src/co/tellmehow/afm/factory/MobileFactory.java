package co.tellmehow.afm.factory;

import co.tellmehow.afm.Iphone;
import co.tellmehow.afm.Laptop;
import co.tellmehow.afm.FactoryProducer;
import co.tellmehow.afm.Mobile;
import co.tellmehow.afm.NokiaLumina;
import co.tellmehow.afm.Samsung;

public class MobileFactory extends FactoryProducer {
	
	public Mobile getMobile(String s) {
		
		if(s.equals("android")) {
			return new Samsung();
		}
		else if(s.equals("ios")) {
			return new Iphone();
		}
		else {
			return new NokiaLumina();
		}
	}
	public Laptop getLaptop(String s) {
		return null;
	}

}
