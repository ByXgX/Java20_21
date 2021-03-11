package POO;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Biblioteca {

	public static void main(String[] args) {
		
		//creamos el m�todo constructor
		ArrayList<Estante> Biblioteca = new ArrayList<Estante>();
		Estante biblio = new Estante();
		
		//inicializamos las variables
		boolean salir = true;
		
		String titulo;
		String autor;
		double cali;
		
		//creamos el menu con los botones
		Object [] botones = {"A�adir Libro","mostrar todo", "Eliminar Libro (T�tulo)", "Eliminar Libro (Autor)", "Mejor calificaci�n","Peor calificaci�n","Mostrar libros de un determinado autor","Salir"};
		int menu = JOptionPane.showOptionDialog(null,"Elige una opci�n", "",JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null,botones, botones[0]);
	
		//creamos un do while para hacer que funcione el menu y no se repita siempre
		do {
			switch (menu) {
				case 0:
					
					JOptionPane.showMessageDialog(null, "Escribe lo siguiente:");
					titulo = JOptionPane.showInputDialog("T�tulo");
					autor = JOptionPane.showInputDialog("Autor");
					cali = Double.parseDouble(JOptionPane.showInputDialog("Calificaci�n"));
					Libro nuevo = new Libro(titulo,autor,cali);
					biblio.addLibro(nuevo);
										
					break;
					
				case 1:	
				
					biblio.mostrarLibrosT();
					biblio.mostrarLibrosA();
					
					break;
				case 2:	
					titulo = JOptionPane.showInputDialog(null, "Escribe un titulo y se eliminar� ese libro  ");
					
					biblio.eliminarLibroT(titulo);
					break;
					
				case 3: 
					autor = JOptionPane.showInputDialog(null, "Escribe un autor y se eliminara un libro de ese autor");
					biblio.eliminarLibroA(autor);
					break;
					
				case 4:
					JOptionPane.showMessageDialog(null,"El libro mejor calificado es: "+biblio.mejorCalificaci�n());
					
					break;
					
				case 5:
					JOptionPane.showMessageDialog(null,"El libro peor calificado es: "+biblio.peorCalificaci�n());
				
					break;
					
				case 6:
					
					
					autor = JOptionPane.showInputDialog(null, "Escribe un autor y se mostraran todos sus titulos");
					JOptionPane.showMessageDialog(null, "Los libros son \n"+biblio.buscarLibro(autor));
					break;
					
				case 7:
					
					JOptionPane.showMessageDialog(null, "Saliendo");
					break;
					
					}
			
					if(menu != 7)
						{
							menu = JOptionPane.showOptionDialog(null,"Elige una opci�n", "",JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null,botones, botones[0]);
						}
					
					} while(menu!=7);
				
	}


}
