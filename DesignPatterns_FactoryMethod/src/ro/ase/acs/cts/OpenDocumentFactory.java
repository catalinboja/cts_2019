package ro.ase.acs.cts;

public class OpenDocumentFactory extends AbstractDocumentFactory{

	@Override
	public InterfataDocument creareDocument(TipDocument tipDocument) {
		//referinta obiect generat
		InterfataDocument document = null;
		
		//verificare tip document solicitat
		switch(tipDocument){
		case TEXT:
			//generare document text specific Open Office
			document = new DocumentOpenOfficeText();
			break;
		case HTML:
			document = new DocumentHtmlGeneric();
			break;
		}
		
		return document;
	}

}
