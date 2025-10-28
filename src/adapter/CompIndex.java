package adapter;

import java.util.Comparator;

import domain.Symptom;

public class CompIndex implements Comparator{

	@Override
	public int compare(Object arg0, Object arg1) {
		return ((Symptom) arg0).getSeverityIndex() - (((Symptom) arg1).getSeverityIndex());
	}
}