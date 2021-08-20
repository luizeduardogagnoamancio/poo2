package templateexemplo;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ExportHtml extends ExportFiles{
	
	public ExportHtml()
	{
		super();
	}

	@Override
	protected void export(String txt) {
		String[] txtLinhas = txt.split("\n");
      for(Object linhas : txtLinhas )
      {
          printLine((String)linhas);
      }   
      save();
		
	}

	@Override
	protected void save() {
		try {
          out.write("</BODY>");
          out.write("</HTML>");
          out.close();
      } catch (IOException ex) {
          Logger.getLogger(ExportFiles.class.getName()).log(Level.SEVERE, null, ex);
      }
		
	}

	@Override
	protected void printLine(String linha) {
		try {
          out.write("<BR>" + linha);
      } catch (IOException ex) {
          Logger.getLogger(ExportFiles.class.getName()).log(Level.SEVERE, null, ex);
      }
		
	}

	
}
