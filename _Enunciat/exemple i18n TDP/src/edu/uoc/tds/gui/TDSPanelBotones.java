package edu.uoc.tds.gui;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;
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
public class TDSPanelBotones extends JPanel implements ActionListener{

	private static final long serialVersionUID = 1L;	
	private JButton button1;
	private JButton button2;
	
	public TDSPanelBotones() {
		setBackground(Color.WHITE);
		TitledBorder border = new TitledBorder(TDSLanguageUtils.getMessage("Panel3.title"));
		setBorder(border);
		button1 = new JButton(TDSLanguageUtils.getMessage("Panel3.button1"));
		button1.addActionListener(this);
		
		button2 = new JButton(TDSLanguageUtils.getMessage("Panel3.button2"));
		button2.addActionListener(this);
		
		setLayout(new GridLayout(2,1,10,10));
		add(button1);
		add(button2);
	}

	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==button1) {
			JOptionPane.showMessageDialog(null, 
					TDSLanguageUtils.getMessage("Panel3.dialog1"),
					TDSLanguageUtils.getMessage("Panel3.dialogsTitle"),
					JOptionPane.INFORMATION_MESSAGE);
		}
		else if (e.getSource()==button2) {
			JOptionPane.showMessageDialog(null, 
					TDSLanguageUtils.getMessage("Panel3.dialog2"),
					TDSLanguageUtils.getMessage("Panel3.dialogsTitle"),
					JOptionPane.ERROR_MESSAGE);
		}
	}
	

}
