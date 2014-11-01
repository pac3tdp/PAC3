package edu.uoc.tds.gui;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import edu.uoc.tds.i18n.TDSLanguageUtils;

/**  
 * Técnicas de Desarrollo de Software
 * Universitat Oberta de Catalunya (UOC)
 * @
 * @author Joan Esteve Riasol  
 * @version 1.0
 * 
 */
public class TDSPanelLabels extends JPanel{

	private static final long serialVersionUID = 1L;	
		
	public TDSPanelLabels() {
		setBackground(Color.CYAN);
		JLabel label1 = new JLabel(TDSLanguageUtils.getMessage("Panel1.label1"),JLabel.CENTER);
		JLabel label2 = new JLabel(TDSLanguageUtils.getMessage("Panel1.label2"),JLabel.RIGHT);
		JLabel label3 = new JLabel(TDSLanguageUtils.getMessage("Panel1.label3"),JLabel.LEFT);
		setLayout(new GridLayout(3,1));
		setBorder(new EmptyBorder(5,5,5,5));
		add(label1);
		add(label2);
		add(label3);			
	}			
}
