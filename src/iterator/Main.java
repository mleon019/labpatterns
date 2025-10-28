package iterator;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import adapter.CompIndex;
import adapter.CompName;
import adapter.InvertedIterator;
import adapter.Sorting;
import domain.Covid19Pacient;
import domain.Symptom;

	public class Main {

		public static void main(String[] args) {
			Covid19Pacient p=new Covid19Pacient("Ane", 29);
			p.addSymptom(new Symptom("Hola", 10, 10), 1);
			p.addSymptom(new Symptom("Buenas", 5, 2), 2);
			p.addSymptom(new Symptom("Tardes", 8, 1), 3);
			p.addSymptom(new Symptom("Caballero", 10, 7), 4);
			p.addSymptom(new Symptom("Dama", 3, 10), 5);
						
			InvertedIterator pa = new PatronAdapter(p.getSymptoms());
			CompName comparador = new CompName();
			Iterator ordenado = Sorting.sortedIterator(pa, comparador);
			
			System.out.println("Ordenado alfabeticamente");

			while(ordenado.hasNext())
				System.out.println(ordenado.next());
				
			
			pa = new PatronAdapter(p.getSymptoms());
			CompIndex comparador1 = new CompIndex();
			Iterator ordenado1 = Sorting.sortedIterator(pa, comparador1);
			
			System.out.println("Ordenado por severidad de menor a mayor");

			
			while(ordenado1.hasNext())
				System.out.println(ordenado1.next());
	

		}

	}

