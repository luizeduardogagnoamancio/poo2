package usuario;

import java.io.*;

public class RecuperarUsuarioSerializado {

    public static void main(String[] args) throws Exception {
        {
            Usuario user = null;
            Mensagem mensagem = null;
            String current = new java.io.File(".").getCanonicalPath();
            FileInputStream fileIn = new FileInputStream(current + 
                    "\\src\\usuario_serializado.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            user = (Usuario) in.readObject();
            mensagem = (Mensagem) in.readObject();
            in.close();

            System.out.println("Deserializando Usuario...");
            System.out.println("Nome: " + user.getNome());
            System.out.println("Email: " + user.getEmail());
            System.out.println("Senha: " + user.getSenha());
            
            System.out.println("Deserializando Mensagem...");
            System.out.println("Mensagem: " + mensagem.getMensagem());

        }
    }
}
