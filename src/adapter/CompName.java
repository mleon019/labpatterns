package adapter;

import java.util.Comparator;

import domain.Symptom;

public class CompName implements Comparator {

	@Override
	public int compare(Object arg0, Object arg1) {
		System.out.println("Comparamos " + ((Symptom) arg0).getName() + "con " +((Symptom) arg1).getName());
		System.out.println("Saleeee : "+ ((Symptom) arg0).getName().compareTo(((Symptom) arg1).getName()));
		return ((Symptom) arg0).getName().compareTo(((Symptom) arg1).getName());
	}



}
