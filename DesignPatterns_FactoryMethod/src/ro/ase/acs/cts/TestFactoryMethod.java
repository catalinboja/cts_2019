package ro.ase.acs.cts;

public class TestFactoryMethod {

	public static void main(String[] args) {
		
		//creare factory documente - de tip Word
		AbstractDocumentFactory documentFactory = 
				new WordDocumentFactory();
		
		//creare document text de tip text
		InterfataDocument doc1 = 
				documentFactory.newDocument(TipDocument.TEXT, "Factory.txt");
		//creare document html
		InterfataDocument doc2 = 
				documentFactory.newDocument(TipDocument.HTML, "Factory.html");
		
		System.out.println("Tip document doc1: "+doc1.getTip());
		System.out.println("Tip document doc2: "+doc2.getTip());
		
		//modificare generator - tip OpenOffice
		documentFactory = new OpenDocumentFactory();
		
		//creare document text de tip text
		InterfataDocument doc3 = 
				documentFactory.newDocument(TipDocument.TEXT, "Factory.txt");
		
		System.out.println("Tip document doc1: "+doc3.getTip());
		
	}

}
