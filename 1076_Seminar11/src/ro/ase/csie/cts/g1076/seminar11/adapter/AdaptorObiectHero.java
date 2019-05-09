package ro.ase.csie.cts.g1076.seminar11.adapter;

public class AdaptorObiectHero implements ISuperErou{
	Hero hero;

	public AdaptorObiectHero(Hero hero) {
		this.hero = hero;
	}

	@Override
	public void ataca(String Inamic, int puncte) {
		hero.loveste(Inamic);
	}

	@Override
	public void seApara(int puncte) {
		hero.esteLovit();
	}
	
	
}
