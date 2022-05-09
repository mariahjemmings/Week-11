package week11Assignment;

import java.util.*;

public class Optionals {
	
	public static Cats a (Optional <Cats> kitty) {
		
		return kitty.orElseThrow(()-> new NoSuchElementException("Sorry, this element does not exist here"));
		
	}
	

	
	public void b (Optional <Cats> kitten) {
		kitten = Optional.empty();
		
		try {
		Optionals.a(kitten);
		System.out.println(kitten);}
		catch(NoSuchElementException e){
		System.out.println(e.getMessage());}
	}

	public static void main(String[] args) {

		Optional <Cats>kitten = Optional.empty();
		
		Optionals c = new Optionals ();
		
		c.b(kitten);
		
		
		
		
		
	
		
		
		

	}

}
