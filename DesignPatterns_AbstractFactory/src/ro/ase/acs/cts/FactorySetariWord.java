package ro.ase.acs.cts;

public class FactorySetariWord implements FactorySetariDocument{

	@Override
	public SetariPaginaAbstracte getDefaultSetari() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FontAbstract getDefaultFont() {
		return new Calibri();
	}

	@Override
	public StilAbstract getDefaultStil() {
		// TODO Auto-generated method stub
		return null;
	}

}
