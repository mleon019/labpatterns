package adapter;

import java.util.Comparator;

import domain.Symptom;

public class CompName implements Comparator {

	@Override
	public int compare(Object arg0, Object arg1) {
		return ((Symptom) arg0).getName().compareTo(((Symptom) arg1).getName());
	}



}
