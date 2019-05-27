package ro.ase.csie.cts.g1078.lab13;

import ro.ase.csie.cts.g1078.lab13.composite.AbstractNode;
import ro.ase.csie.cts.g1078.lab13.composite.GroupOfSoldiers;
import ro.ase.csie.cts.g1078.lab13.composite.Soldier;
import ro.ase.csie.cts.g1078.lab13.proxy.LoginProxy;
import ro.ase.csie.cts.g1078.lab13.proxy.LoginServer;

public class GameTest {
	
	public static void main(String[] args) {
		//test the composite
		AbstractNode theArmy = 
				new GroupOfSoldiers("The army - level 3");
		
		AbstractNode smallArmy = 
				new GroupOfSoldiers("Small army");
		smallArmy.addComponent(
				new Soldier("Soldier 1", "pistol", false));
		smallArmy.addComponent(
				new Soldier("Soldier 2", "pistol", false));
		
		AbstractNode mediumArmy = 
				new GroupOfSoldiers("Medium army");
		
		mediumArmy.addComponent(
				new Soldier("Joker", "Rifle", true));
		AbstractNode onotherSmallArmy = 
				new GroupOfSoldiers("Small army");
		onotherSmallArmy.addComponent(
				new Soldier("Soldier 1", "pistol", false));
		onotherSmallArmy.addComponent(
				new Soldier("Soldier 2", "pistol", false));
		mediumArmy.addComponent(onotherSmallArmy);
		
		theArmy.addComponent(smallArmy);
		theArmy.addComponent(mediumArmy);
		
		theArmy.getInfo();
		theArmy.attack("Batman");
		
		//testing the login without a proxy
		String[] dictionary = 
				new String[] {"admin","1234","admin1","admin12",
						"admin1234"};
		LoginServer login = new LoginServer();
		for(String pass : dictionary)
			if(login.login("admin", pass))
				System.out.println("I got the password: " + pass);
		
		//testing the login with a proxy
		System.out.println("******************");
		LoginProxy proxy = new LoginProxy(login);
		for(String pass : dictionary)
			if(proxy.login("admin", pass))
				System.out.println("I got the password: " + pass);
	}
}
