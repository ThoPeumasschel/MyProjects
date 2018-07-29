package wetten;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controler
{

	//controller muss sowohl view als auch model kennen:
		private View view;
		private Model model;
		// innere Klasse
		private ControlerListener listener;
		
		public Controler()
		{
			view=new View();
			model=new Model(this);
			listener=new ControlerListener();
			vermittleListenerAnView();
		}
		
		//innere klasse(n) für das eventhandling
		private class ControlerListener implements ActionListener
		{

			@Override
			public void actionPerformed(ActionEvent arg0) 
			{
				
				if(arg0.getActionCommand().equals("Verbinden"))
				{
					model.dbVerbindung(view.getEingabe());
				}
			}
		}
		
		private void vermittleListenerAnView()
		{
			view.setzeActionlistener(listener);
		}

		public void vermittleMeldungAnView(String string)
		{
			// TODO Auto-generated method stub
			
		}

}
