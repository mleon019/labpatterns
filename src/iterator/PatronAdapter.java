package iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import adapter.InvertedIterator;
import domain.Symptom;

public class PatronAdapter implements InvertedIterator{



	private List<Symptom> lista;
	private int i;

	public PatronAdapter(Set<Symptom> s) {
		this.lista = new ArrayList<>(s);
		i=lista.size()-1;
	}
	@Override
	public Object previous() {
		i = i-1;
		return lista.get(i);
	}

	@Override
	public boolean hasPrevious() {
		return i!=0;
	}

	@Override
	public void goLast() {;
		i=lista.size();
	}

}
