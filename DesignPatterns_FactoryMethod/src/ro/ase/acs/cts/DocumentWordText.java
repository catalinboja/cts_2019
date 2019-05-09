package ro.ase.acs.cts;

public class DocumentWordText extends InterfataDocument {

	@Override
	public String getTip() {
		return "Document MSWord de tip text";
	}

	@Override
	public void print(String text) {
		System.out.println(text);
	}

}
