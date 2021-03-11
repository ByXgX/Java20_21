package POO;

import java.util.ArrayList;
import java.util.Collections;

public class Arraylist_enteros {

	public static void main(String[] args) {
	
		ArrayList<Integer> a = new ArrayList <Integer>();
		
		a.add(18);
		a.add(32);
		a.add(-2);
		a.add(76);
		
		
		for (int numero:a) {
			System.out.println(numero);
			
		}
		
		Collections.sort(a);
		
		System.out.println();
	}
}
