package edu.uoc.tds.gui;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
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
public class TDSPanelTexto extends JPanel{

	private static final long serialVersionUID = 1L;		
	
	public TDSPanelTexto() {
		
		TitledBorder border = new TitledBorder(TDSLanguageUtils.getMessage("Panel4.title"));
		setBorder(new CompoundBorder(border,new EmptyBorder(50,50,50,50)));
		setBackground(Color.GREEN);
		setLayout(new GridLayout(1,1));
		add(new JScrollPane(new JTextArea()));
	}
	
	
	

}
