package edu.uoc.tds;

import java.util.Locale;

import edu.uoc.tds.gui.TDSFrame;
import edu.uoc.tds.gui.TDSPanelBotones;
import edu.uoc.tds.gui.TDSPanelLabels;
import edu.uoc.tds.gui.TDSPanelTexto;
import edu.uoc.tds.gui.TDSPanelTitulos;
import edu.uoc.tds.i18n.TDSLanguageUtils;


/**  
 * Técnicas de Desarrollo de Software
 * Universitat Oberta de Catalunya (UOC)
 * @
 * @author Joan Esteve Riasol  
 * @version 1.0
 * 
 */
public class Test {
	
	public Test() {
		String title = TDSLanguageUtils.getMessage("Test.title");
		int width = 600;
		int height = 400;		
		TDSFrame main = new TDSFrame(title,width,height);			
		main.nuevoPanel(new TDSPanelLabels());
		main.nuevoPanel(new TDSPanelTitulos());
		main.nuevoPanel(new TDSPanelBotones());
		main.nuevoPanel(new TDSPanelTexto());
		main.completarFrame();		
	}
	
	public static void main(String args[]) {
		if(args.length==0) {
			TDSLanguageUtils.setDefaultLanguage("i18n/messages");
		}
		if(args.length==1) {
			Locale locale = new Locale(args[0]);
			TDSLanguageUtils.setLanguage("i18n/messages", locale);			
		}
		new Test();
	}
}
