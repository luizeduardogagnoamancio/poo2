package usuario;

import java.io.Serializable;

public class Mensagem implements Serializable{
	
	String mensagem;
	
	public void setMensagem(String mensagem)
	{
		this.mensagem = mensagem;
	}
	
	public String getMensagem()
	{
		
		return mensagem;
	}
	

}
