package ro.ase.cts;

public class TestProxy {

	public static void main(String[] args) {
		InterfataImagine img1 = 
				new Imagine("Car.png");
		
		//we do a lot of other things
		System.out.println("Do other stuff");
		
		img1.afisareImagine();
		img1.afisareImagine();
		img1.afisareImagine();
		
        final InterfataImagine IMAGE1 = 
        		new ProxyImagine("Photo1");
        final InterfataImagine IMAGE2 = 
        		new ProxyImagine("Photo2");
 
        IMAGE1.afisareImagine();
        IMAGE1.afisareImagine();
        IMAGE2.afisareImagine();
        IMAGE2.afisareImagine();
        IMAGE1.afisareImagine();
	}

}
