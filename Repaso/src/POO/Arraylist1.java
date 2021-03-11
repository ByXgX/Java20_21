package POO;

import java.util.ArrayList;

public class Arraylist1 {

	public static void main(String[] args) {
		
		
		ArrayList<String> a = new ArrayList <String>();
		
		System.out.println("Nº elementos: " + a.size());
		
		a.add("rojo");
		a.add("azul");
		a.add("blanco");
		
		System.out.println("Nº elementos: " + a.size());
		
		System.out.println("en la posicion 0 " + a.get(0));
		
		a.add("negro");
		
		System.out.println("contenido del array con FOR: ");
		for(int i=0; i<a.size(); i++) {
			System.out.println(a.get(i));
		}
		
		a.add("naranja");
		
		System.out.println("FOREACH: ");
		for(String elemento:a) {
			System.out.println(elemento);
		}
		
		if (a.contains("blanco")) {
			System.out.println("el blanco esta");
			a.remove("blanco");
		}
	
		for(String color:a) {
			System.out.println(color);
		}
		
		a.remove(2);
		for(String elemento:a) {
			System.out.println("existe "+ elemento);
		}
		
		a.set(2, "morado");
		for(String color:a) {
			System.out.println(color);
		}	
		
		
		
	}

}
