package POO;

import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JOptionPane;

public class Estante2 {

	private ArrayList<Libro2>miestante = new ArrayList<Libro2>();

	public Estante2() {
		this.miestante=new ArrayList<Libro2>();
	}

	public void addLibro (Libro newLibro) {//en este método añadimos un libro a nuestro array
        miestante.add((Libro2) newLibro);
    }
	
	public void mostrarLibrosT() {// este metodo sirve para mostrar el titulo de los libros
		
		for(int i=0; i<miestante.size();i++) {//aqui recorremos el array 
			JOptionPane.showMessageDialog(null,miestante.get(i).getTitulo());// y aqui escribimos el JOptionPane mostrando el titulo
		}//fin for
	}
		public void mostrarLibrosA(String lISBN) {// este metodo sirve para mostrar el autor de cada libro
			
			for(int i=0; i<miestante.size();i++) {//recorremos el array
				JOptionPane.showMessageDialog(null,miestante.get(i).getAutor());//JOptionPane delos autores de los libros
			}//fin for
			
			
	}
	
    public String eliminarLibroA (String autorRemoved) { //con este método eliminamos un libro dependiendo del autor que pongas
        for (int i=0;i<miestante.size();i++ ) {
            Libro libro = miestante.get(i);
            if (libro.getAutor().equals(autorRemoved)) {//aqui buscamos el autor que se introduce y se compara con el que esta en el array para ver si son iguales
                miestante.remove(i);
                i--;
            }//cerramos if
        }//cerramos for
        
        return  autorRemoved;
    }
    
    
    public String eliminarLibroT (String títuloRemoved) {//este método es igual que el anterior pero en vez de con el autor es con el titulo
        for (int i=0;i<miestante.size();i++ ) {
            Libro libro = miestante.get(i);
            if (libro.getTitulo().equals(títuloRemoved)) {
            	miestante.remove(i);
                i--;
            }//cerramos if
        }//cerramos for
        return  títuloRemoved;
    }

    public String mejorCalificación() {//este método muestra el libro con la mejor calificación 
        Libro libro1;
        Libro libro2 = miestante.get(0);
        String libro="";
        for (int i=1;i<miestante.size();i++ ) {// ponemos un bucle for para recorrer el array
            libro1=miestante.get(i);
            if (libro1.getCalificacion()>libro2.getCalificacion()) {// aqui comparamos los libros hasta descubrir cual es mayor
                libro2=libro1;
                libro=libro2.getTitulo();//damos el nombre del mejor calificado a "libro" para el return.
            }//fin if
        }//fin for
		return libro; 
	
    }
    
    public String peorCalificación() {//este método es igual que el anterior pero para la peor calificación
        Libro libro1;
        Libro libro2 = miestante.get(0);
        String libro="";
        for (int i=1;i<miestante.size();i++ ) {
            libro1=miestante.get(i);
            if (libro1.getCalificacion()<libro2.getCalificacion()) {// aqui comparamos los libros hasta descubrir cual es menor
                libro2=libro1;
                libro=libro2.getTitulo();
            }//fin if
        }//fin for
		return libro;
    }

    public String buscarLibro(String autor) {// este metodo sirve para buscar un los libros de un autor en concreto
    	
    	String titulos="";
    	for(int i=0;i<miestante.size(); i++) {
    		if(miestante.get(i).getAutor().equalsIgnoreCase(autor)) {
    			titulos=titulos+miestante.get(i).getTitulo()+"\n";
    		}//fin if
    	}//fin for
    	return titulos;
    
    }

    
    public String eliminarLibroISBN (String ISBNRemoved) {
		for (int i=0;i<miestante.size();i++ ) {
			Libro2 libro = miestante.get(i);
			if (libro.getISBN().equals(ISBNRemoved)) {
				miestante.remove(i);
				i--;
			}
		}
		return "Libros con " + ISBNRemoved + " por ISBN eliminados";
	}
	public String libroSegúnISBN(String ISBNLibro) {
		String libro="";
		Libro2 libro2;
		for (int i=0;i<miestante.size();i++ ) {
			libro2=miestante.get(i);
			if (libro2.getISBN().equals(ISBNLibro)) {
				libro= libro + "Título: " + libro2.getTítulo() + "; autor: " + libro2.getAutor() + "; calificación:  " + libro2.getCalificación() + "; ISBN:  " + libro2.getISBN() + "; nº páginas: " + libro2.getNpags() + "\n";
			}
		}
		return libro;
	}

	public void ordenISBN() {
		Collections.sort(miestante);
		for (Libro2 libroAux: miestante) {
			System.out.println(libroAux.toString()+"\n");
		}
	}

}