package week11Assignment;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {
	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		
		Cats a = new Cats ();
		
		List <Cats> list = a.getCats();
		Stream b = list.stream();
		String s= list.stream().map(e -> e.toString()).sorted().collect(Collectors.joining(", "));
		
	
		System.out.println(s);
		
		
	
	} }