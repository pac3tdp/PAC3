package edu.uoc.tds.gui;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import edu.uoc.tds.i18n.TDSLanguageUtils;

/**  
 * Técnicas de Desarrollo de Software
 * Universitat Oberta de Catalunya (UOC)
 * @
 * @author Joan Esteve Riasol  
 * @version 1.0
 * 
 */
public class TDSPanelTitulos extends JPanel {

	private static final long serialVersionUID = 1L;	
	
	public TDSPanelTitulos() {
		setBackground(Color.WHITE);
		TitledBorder border = new TitledBorder(TDSLanguageUtils.getMessage("Panel2.title"));
		setBorder(border);
	}
	

}
