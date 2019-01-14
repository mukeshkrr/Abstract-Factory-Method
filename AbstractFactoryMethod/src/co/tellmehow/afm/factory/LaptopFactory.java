package co.tellmehow.afm.factory;

import co.tellmehow.afm.AppleMac;
import co.tellmehow.afm.Asus;
import co.tellmehow.afm.Compaq;
import co.tellmehow.afm.Laptop;
import co.tellmehow.afm.FactoryProducer;
import co.tellmehow.afm.Mobile;


public class LaptopFactory extends FactoryProducer {
	
	@Override
	public Laptop getLaptop(String s) {
			
			if(s.equals("amd")) {
				return new Asus();
			}
			else if(s.equals("apple")) {
				return new AppleMac();
			}
			else {
				return new Compaq();
			}
		}
	
	public Mobile getMobile(String s) {
		return null;
	}

}
