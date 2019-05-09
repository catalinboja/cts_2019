package ro.ase.acs.cts;

public class FactorySetariWriter implements FactorySetariDocument{

	@Override
	public SetariPaginaAbstracte getDefaultSetari() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FontAbstract getDefaultFont() {
		// TODO Auto-generated method stub
		return new Arial();
	}

	@Override
	public StilAbstract getDefaultStil() {
		// TODO Auto-generated method stub
		return null;
	}

}
