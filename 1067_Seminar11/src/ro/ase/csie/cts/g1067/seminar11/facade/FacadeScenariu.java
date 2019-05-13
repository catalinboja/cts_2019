package ro.ase.csie.cts.g1067.seminar11.facade;

import java.util.ArrayList;

public class FacadeScenariu {
	public static void incarcaScenariu(String numeScenariu,
			String calePozaFundal, String[] figuranti,
			String[] elementeDecor) {
		
		PovesteScenariu scenariu = 
				new PovesteScenariu(numeScenariu);
		ImagineFundal background = 
				new ImagineFundal(calePozaFundal);
		
		ArrayList<CaracterFiguratie> elementeFiguratie = 
				new ArrayList<>();
		for(String figurant : figuranti)
			elementeFiguratie.add(new CaracterFiguratie(figurant));
		
		ArrayList<ElementActiv> elementeActive = 
				new ArrayList<>();
		for(String decor : elementeDecor)
			elementeActive.add(new ElementActiv(decor));
		
		scenariu.incarcaScenariu();
		for(CaracterFiguratie figurant : elementeFiguratie)
			figurant.afisareEcran();
		for(ElementActiv element : elementeActive)
			element.incarcaInScenariu();
		
	}
	public void stergeScenariu() {
		
	}
}
