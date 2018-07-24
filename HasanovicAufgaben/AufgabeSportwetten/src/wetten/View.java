package wetten;

import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class View extends JFrame
{
	// Komponenten
	private JTextField txtEingabe;
	private JTable tblTabelle;
	private ActionListener action;
	private ArrayList<JComponent> komponenten;

	public View()
	{
		setTitle("Dude!");
		setLayout(new GridBagLayout());
		txtEingabe = new JTextField(50);
		tblTabelle = new JTable(30, 5); // tabelle hat 30 zeilen und 5 spalten
		komponenten = new ArrayList<JComponent>();

		
		
		
		
		
		
		
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setVisible(true);
		pack();
	}

	
	
	private JPanel buildPanel(ArrayList<JComponent> komponenten, LayoutManager layout, boolean rahmen)
	{
		JPanel pnlTemp=new JPanel();
		//rahmen?
		if(rahmen)
		{
			pnlTemp.setBorder(BorderFactory.createEtchedBorder());
		}
		//layoutmanager setzen
		pnlTemp.setLayout(layout);
		//alle komponenten aus der list auf dem panel platzieren
		Iterator<JComponent> it=komponenten.iterator();
		while(it.hasNext())
		{
			pnlTemp.add(it.next());
		}
		
		return pnlTemp;
	}
	
	//diese methode fügt ein panel unter bestimmten constraints dem fenster hinzu:
	private void attachPanel(JPanel pnl, Object constraint)
	{
		getContentPane().add(pnl, constraint);
	}
	
	//holen des textfeldinhaltes
	public String getEingabe()
	{
		return txtEingabe.getText();
	}
	
	//hier kann der controler seinen actionlistener setzen lassen:
	public void setzeActionlistener(ActionListener listener)
	{
		action=listener;
		//knopf auf der gui per index holen:
		JPanel pnlTemp=(JPanel) getContentPane().getComponent(0);
		JButton btnTemp=(JButton) pnlTemp.getComponent(2);
		btnTemp.addActionListener(listener);
	}
	
	//hier kann der controler meldungen aus dem model in das status-label schreiben_
	public void setzeStatusMeldung(String meldung)
	{
		JPanel pnlTemp=(JPanel)getContentPane().getComponent(2);
		JLabel lblTemp=(JLabel)pnlTemp.getComponent(0);
		lblTemp.setText(meldung);
	}
	
	
	//hier übergibt der controler die DB-Daten an die JTable der view:
	public void fuelleTabelle(String[] spalten, Object[][] daten)
	{
		DefaultTableModel modell=new DefaultTableModel(spalten, 0);
		for(int i=0;i<daten.length;i++)
		{
			modell.addRow(daten[i]);
		}
		tblTabelle.setModel(modell);
	}
}
