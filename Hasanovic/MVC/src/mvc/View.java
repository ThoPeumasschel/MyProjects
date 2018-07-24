package mvc;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;
import java.util.*;


public class View extends JFrame
{
	//attribute
	private JTextField txtEingabe;
	private JTable tblTabelle;
	private ActionListener action;
	private ArrayList<JComponent> komponenten;
	
	//konstruktor
	public View()
	{
		//titel setzen
		super("Datenbankverbinder");
		//fenster erhält das borderlayout
		setLayout(new BorderLayout());
		txtEingabe=new JTextField(50);
		tblTabelle=new JTable(30, 5); //tabelle hat 30 zeilen und 5 spalten
		komponenten=new ArrayList<JComponent>();
		//label setzen
		komponenten.add(new JLabel("Bitte DB-Name eingeben: "));
		komponenten.add(txtEingabe);
		JButton btnVerbinden=new JButton("Verbinden");
		//der knopf soll der standard-knopf der gui sein
		getRootPane().setDefaultButton(btnVerbinden);
		komponenten.add(btnVerbinden);
		attachPanel(buildPanel(komponenten, new FlowLayout(), true), BorderLayout.NORTH);
		//jtable hinzufügen:
		//tabelle scrollfähig machen, indem sie einer scrollpane hinzugefügt wird
		JScrollPane scrlTabelle=new JScrollPane(tblTabelle);
		tblTabelle.setFillsViewportHeight(true);
		komponenten.clear();
		komponenten.add(scrlTabelle);
		attachPanel(buildPanel(komponenten, new FlowLayout(), true), BorderLayout.CENTER);
		//statuszeile setzen
		JLabel lblStatus=new JLabel(" ");
		komponenten.clear();
		komponenten.add(lblStatus);
		attachPanel(buildPanel(komponenten, new FlowLayout(), true),BorderLayout.SOUTH);
		setSize(400, 400);
		setLocation(200, 200);
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
