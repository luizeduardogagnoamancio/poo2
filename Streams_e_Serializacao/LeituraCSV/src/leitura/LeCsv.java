
package leitura;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.LinkedList;

public class LeCsv {
  
     public LinkedList<Cliente> leCsvClientes() throws IOException{         
      
        LinkedList<Cliente> clientes = new  LinkedList<Cliente>();
        String current = new java.io.File( "." ).getCanonicalPath();        
        //File inputFile = new File(current + "\\src\\arquivo.csv");                
        //FileReader in = new FileReader(inputFile);
        int c;
        
        String input = "";
        
        BufferedReader br = new BufferedReader(new FileReader(current + "\\src\\arquivo.csv"));
        
        String line = br.readLine();
        line = br.readLine();
        while (line != null)
        {
        	Cliente cliente = new Cliente();
        	String[] vect = line.split(";");
        	cliente.setId(vect[0]);
        	cliente.setNome(vect[1]);
        	cliente.setEmail(vect[2]);
        	cliente.setTelefone(vect[4]);
        	cliente.setTotalCompras(Double.parseDouble(vect[5]));
        	clientes.add(cliente);
        	line = br.readLine();
        }
        
        
        //while ((c = in.read()) != -1) {
            //c = in.read();     		
        //}
        
        
        //in.close();
        
        
        //complete o codigo para ler o csv e criar as instancias de cliente.
        //rode o teste MainReadCsvTest.java para testar o seu código.
        
        return clientes;
     }
}
