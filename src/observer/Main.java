package observer;

import java.util.Observable;



public class Main {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		Observable	pacient=new	Covid19Pacient("Mikel Bueno", 20);
		new	PacientObserverGUI	(pacient);
		new PacientThermometerGUI(pacient);
		new	PacientSymptomGUI((Covid19Pacient)pacient);

		
		Observable	pacient1 =new	Covid19Pacient("Mikel Malo", 8);
		new	PacientObserverGUI	(pacient1);
		new PacientThermometerGUI(pacient1);
		new	PacientSymptomGUI((Covid19Pacient)pacient1);
		
		Observable	pacient2 =new	Covid19Pacient("Anne Mejor", 32);
		new	PacientObserverGUI	(pacient2);
		new PacientThermometerGUI(pacient2);
		new	PacientSymptomGUI((Covid19Pacient)pacient2);
	}


}
