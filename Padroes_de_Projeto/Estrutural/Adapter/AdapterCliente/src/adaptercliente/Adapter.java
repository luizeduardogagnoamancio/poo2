package adaptercliente;

import adaptercliente.model.ICliente;
import lib.ClienteExterno;

public class Adapter implements ICliente{

	private String nomeCompleto;
	private String telefone;
	private String email;
	private String celular;
	private ClienteExterno cliente;
	
	
	
	public Adapter(ClienteExterno cliente)
	{
		this.cliente = cliente;
	}

	@Override
	public String getNomeCompleto() {
		// TODO Auto-generated method stub
		return cliente.getNome();
	}

	@Override
	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = cliente.getNome();
		
	}

	@Override
	public String getTelefone() {
		// TODO Auto-generated method stub
		return cliente.getTelefone();
	}

	@Override
	public void setTelefone(String telefone) {
		this.telefone = cliente.getTelefone();
		
	}

	@Override
	public String getEmail() {
		// TODO Auto-generated method stub
		return cliente.getEmail();
	}

	@Override
	public void setEmail(String email) {
		this.email = cliente.getEmail();
		
	}

	@Override
	public String getCelular() {
		// TODO Auto-generated method stub
		return cliente.getCelular();
	}

	@Override
	public void setCelular(String celular) {
		this.celular = cliente.getCelular();
		
	}

}
