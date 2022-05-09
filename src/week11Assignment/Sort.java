package week11Assignment;

import java.util.Comparator;
import java.util.List;

public class Sort {
	
	Cats a = new Cats ();
	
	private void lambda (Cats a) {
		List <Cats> lista = a.getCats();
		Comparator<Cats> comp = null;
		comp = (c1, c2) -> {return a.compare(c1, c2);};
		 lista.sort(comp);}
		
		
	
	private void mreference (Cats a) {
		Comparator<Cats> comp = null;
		comp = Cats :: compare;
	    a.getCats().sort(comp);
	}
	public static void main(String[] args) {
		Sort a = new Sort ();
		Cats b = new Cats();
		
		a.lambda(b);
		
		System.out.println(b.getCats());
	
		a.mreference(b);
		System.out.println(b.getCats());
		
		
	}
}
