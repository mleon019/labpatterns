package observer;

import java.util.Observable;

import adapter2.ShowPacientTableGUI;



public class Main {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		Observable	pacient=new	Covid19Pacient("Mikel Bueno", 20);
		new	PacientObserverGUI	(pacient);
		new PacientThermometerGUI(pacient);
		new	PacientSymptomGUI((Covid19Pacient)pacient);
		ShowPacientTableGUI gui=new ShowPacientTableGUI((Covid19Pacient)pacient);
		gui.setPreferredSize(
			      new java.awt.Dimension(300, 200));
		gui.setVisible(true);
		
		Observable	pacient1 =new	Covid19Pacient("Mikel Malo", 8);
		new	PacientObserverGUI	(pacient1);
		new PacientThermometerGUI(pacient1);
		new	PacientSymptomGUI((Covid19Pacient)pacient1);
		ShowPacientTableGUI gui1=new ShowPacientTableGUI((Covid19Pacient)pacient1);
		gui1.setPreferredSize(
			      new java.awt.Dimension(300, 200));
		gui1.setVisible(true);
		
		
		Observable	pacient2 =new	Covid19Pacient("Anne Mejor", 32);
		new	PacientObserverGUI	(pacient2);
		new PacientThermometerGUI(pacient2);
		new	PacientSymptomGUI((Covid19Pacient)pacient2);
		ShowPacientTableGUI gui2=new ShowPacientTableGUI((Covid19Pacient)pacient2);
		gui2.setPreferredSize(
			      new java.awt.Dimension(300, 200));
		gui2.setVisible(true);
		
	}


}
