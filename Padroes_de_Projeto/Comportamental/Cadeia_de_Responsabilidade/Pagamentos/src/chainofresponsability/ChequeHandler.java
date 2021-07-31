package chainofresponsability;

import javax.swing.JOptionPane;

public class ChequeHandler extends AbstractPagamentoHandler{
	public static final int CHEQUE = 3;
	@Override
	protected int getTipoPagamento() {
		return CHEQUE;
	}

	@Override
	protected int handlePagamento(int valor) {
		int valorRestante = super.perguntaPagamento("Qual o valor para o pagamento"
                + " com cheque?", valor);
        JOptionPane.showMessageDialog(null, "Pago com cheque. Valor restante:" 
                + valorRestante);
        return valorRestante;
	}

}
