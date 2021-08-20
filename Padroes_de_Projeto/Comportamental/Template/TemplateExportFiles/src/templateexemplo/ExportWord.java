package templateexemplo;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

public class ExportWord extends ExportFiles{

	public ExportWord()
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
          document.write(out1);
          out1.close();
      } catch (IOException ex) {
          Logger.getLogger(ExportFiles.class.getName()).log(Level.SEVERE, null, ex);
      }
		
	}

	@Override
	protected void printLine(String linha) {
		XWPFParagraph paragraph = document.createParagraph();
		XWPFRun run = paragraph.createRun();
		run.setText(linha);
		
	}

	

}
