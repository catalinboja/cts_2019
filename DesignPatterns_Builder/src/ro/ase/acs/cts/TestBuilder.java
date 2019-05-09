package ro.ase.acs.cts;

import ro.ase.acs.cts.builder.DispozitivMobil;
import ro.ase.acs.cts.builder.DispozitivMobil.DispozitivMobilBuilder;
import ro.ase.acs.cts.builder2.ACMESmartDeviceBuilder;
import ro.ase.acs.cts.builder2.ConfiguratorDispozitiv;
import ro.ase.acs.cts.module.DisplaySuperAmoled;
import ro.ase.acs.cts.module.GPSIntern;
import ro.ase.acs.cts.module.SDCard;
import ro.ase.acs.cts.module.TelCoSIMCard;

public class TestBuilder {
	public static void main(String[] args){
		
		
		SmartDevice smartphone = new SmartDevice(
				"1",
				"2",
				true,
				new TelCoSIMCard(),
				new GPSIntern(),
				new DisplaySuperAmoled(5.1),
				new SDCard(64));
				
		SmartDevice smartphone2 = new SmartDevice(
				"3310",
				"Nokia",
				true,
				null,
				null,
				null,
				null);
		
		SmartDevice smartphone3 = new SmartDevice(
				"3310",
				"Nokia");
		//TO DO utilizeaza set pentru alte atribute

		
		smartphone.setDisplay(new DisplaySuperAmoled(5.1) );
		
		// alte instructiuni
		
		smartphone.setDisplay(new DisplaySuperAmoled(3.1) );
		
		//definire builder dispozitiv
		ACMESmartDeviceBuilder builder = new ACMESmartDeviceBuilder("X5");
		
		//definire configurator
		ConfiguratorDispozitiv configurator = new ConfiguratorDispozitiv(builder);
		
		//construire dispozitiv
		configurator.construieste();
		//obtin dispozitiv
		SmartDevice dispozitiv = configurator.getDispozitiv();
		
		
		DispozitivMobil dispozitivMobil = 
				new DispozitivMobil.DispozitivMobilBuilder("S6", "Samsung")
				.adaugaWiFi()
				.adaugaDisplay(new DisplaySuperAmoled(5.1))
				.adaugaCardMemorie(new SDCard(64))
				.build();
	
	}

}
