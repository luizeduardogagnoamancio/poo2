package chainofresponsability;

import javax.swing.JOptionPane;

public class DinheiroHandler extends AbstractPagamentoHandler{
	public static final int DINHEIRO = 4;
	@Override
	protected int getTipoPagamento() {
		return DINHEIRO;
	}

	@Override
	protected int handlePagamento(int valor) {
		int valorRestante = super.perguntaPagamento("Qual o valor para o pagamento"
                + " com dinheiro?", valor);
        JOptionPane.showMessageDialog(null, "Pago com dinheiro. Valor restante:" 
                + valorRestante);
        return valorRestante;
	}
	
}
