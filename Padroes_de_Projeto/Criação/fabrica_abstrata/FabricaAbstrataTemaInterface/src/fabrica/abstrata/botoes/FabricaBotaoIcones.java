package fabrica.abstrata.botoes;

import javax.swing.JButton;

public class FabricaBotaoIcones extends FabricaAbstrataBotoes{

	@Override
	public JButton criaBotaoOK() {
		// TODO Auto-generated method stub
		return new ButtonOK();
	}

	@Override
	public JButton criaBotaoCancel() {
		// TODO Auto-generated method stub
		return new ButtonCancel();
	}

}
