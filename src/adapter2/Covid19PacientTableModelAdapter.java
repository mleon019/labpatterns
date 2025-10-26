package adapter2;

import java.util.Observable;
import java.util.Observer;
import java.util.Set;

import javax.swing.table.AbstractTableModel;

import domain.Covid19Pacient;
import domain.Symptom;

public class Covid19PacientTableModelAdapter extends AbstractTableModel implements Observer{
	  protected observer.Covid19Pacient pacient;
	  protected String[] columnNames =
	    new String[] {"Symptom", "Weight" };

	  public Covid19PacientTableModelAdapter(observer.Covid19Pacient pacient2) {
	    this.pacient=pacient2;
        pacient.addObserver(this);  
	  }

	  public int getColumnCount() {
	    // Challenge!
		 return columnNames.length;
	  }

	  public String getColumnName(int i) {
	    // Challenge!
		  if (i <= columnNames.length) {
			  return columnNames[i];
		  } else {
			  return "null";
		  }
	  }

	  public int getRowCount() {
	    // Challenge!
		  return pacient.getSymptoms().size();
	  }

	  public Object getValueAt(int row, int col) {
	    // Challenge!
		  Set<Symptom> symptoms = pacient.getSymptoms();
		  Object[] symptoms_toarray = symptoms.toArray();
		  Symptom s = (Symptom)symptoms_toarray[row];
		  
		  if (col == 0) return s.getName();
		  if (col == 1) return pacient.getWeight(s);
	  
	  	  return null;
	  }
	  
	   @Override
	    public void update(Observable o, Object arg) {
	        fireTableDataChanged();
	    }
	 }
