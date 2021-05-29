package fabrica.abstrata.botoes;

import javax.swing.JButton;

public class FabricaPadrao extends FabricaAbstrataBotoes{

	private JButton ok;
    private JButton cancel;
	@Override
	public JButton criaBotaoOK() {
		// TODO Auto-generated method stub
		JButton ok = new JButton();
		return ok;
	}

	@Override
	public JButton criaBotaoCancel() {
		// TODO Auto-generated method stub
		JButton cancel = new JButton();
		return cancel;
	}

}
