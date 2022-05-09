package week11Assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Cats {
	
	public Cats () {};
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Cats (String name) {
		this.name = name;
	}
	
	
	
	@Override
	public String toString() {
		return name;
	}

	public static int compare (Cats c1, Cats c2) { 
		
	
		int answer = c1.name.compareTo(c2.name);
		
		if (answer >0) {
			answer = 1;
			
		}
		else if (answer<0) {
			answer = -1;}
		else if (answer==0) {
			answer = 0;}
		
		return answer;

			
			
		}
	
	public static List <Cats> cats = new ArrayList(List.of(new Cats("Calico"), new Cats("Bombay"), new Cats("Bengal"), new Cats("Tabby")))  ;
	public List <Cats> getCats(){
		return cats;
	}
		 
	public static void main (String[] args) {
		Cats a = new Cats ();
		System.out.println(a.compare(new Cats("Calico"), new Cats ("Bombay")));
		System.out.println(a.compare(new Cats("Calico"), new Cats ("Bengal")));
		System.out.println(a.compare(new Cats("Tabby"), new Cats ("Bombay")));
		System.out.println(a.compare(new Cats("Calico"), new Cats ("Calico")));
		System.out.println(a.compare(new Cats("Bombay"), new Cats ("Calico")));
	}
	}
	

 
 