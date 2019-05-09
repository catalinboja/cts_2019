package ro.ase.csie.cts.g1078.lab9.builder;

public class SuperHero {
	private String name;
	private int lifePoints;
	private boolean isGood;
	private boolean isCriticallyInjured;
	private String rightHandWeapon;
	private String leftHandWeapon;
	private String superPower;
	private String superSuperPower;
	private int runSpeed;
	
	
	public SuperHero(String name, int lifePoints, boolean isGood, boolean isCriticallyInjured, String rightHandWeapon,
			String leftHandWeapon, String superPower, String superSuperPower, int runSpeed) {
		super();
		this.name = name;
		this.lifePoints = lifePoints;
		this.isGood = isGood;
		this.isCriticallyInjured = isCriticallyInjured;
		this.rightHandWeapon = rightHandWeapon;
		this.leftHandWeapon = leftHandWeapon;
		this.superPower = superPower;
		this.superSuperPower = superSuperPower;
		this.runSpeed = runSpeed;
	}
	
	public SuperHero() {
		
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setLifePoints(int lifePoints) {
		this.lifePoints = lifePoints;
	}


	public void setGood(boolean isGood) {
		this.isGood = isGood;
	}


	public void setCriticallyInjured(boolean isCriticallyInjured) {
		this.isCriticallyInjured = isCriticallyInjured;
	}


	public void setRightHandWeapon(String rightHandWeapon) {
		this.rightHandWeapon = rightHandWeapon;
	}


	public void setLeftHandWeapon(String leftHandWeapon) {
		this.leftHandWeapon = leftHandWeapon;
	}


	public void setSuperPower(String superPower) {
		this.superPower = superPower;
	}


	public void setSuperSuperPower(String superSuperPower) {
		this.superSuperPower = superSuperPower;
	}


	public void setRunSpeed(int runSpeed) {
		this.runSpeed = runSpeed;
	}
	
	
}
