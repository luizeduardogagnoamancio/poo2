
package templateexemplo;


public class TemplateMain {

   
    public static void main(String[] args) {
        String texto = "linha 1\n" 
                + "linha2\n"
                + "fim\n";                                
      ExportFiles export = new ExportHtml();
      ExportFiles export2 = new ExportWord();
      export.export(texto);
      export2.export(texto);
    }
    
}
