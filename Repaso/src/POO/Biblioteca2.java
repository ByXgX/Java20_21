package POO;

import javax.swing.JOptionPane;

public class Biblioteca2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Estante2 estante = new Estante2();

		String [] botones = {"A�adir libro","Eliminar libro","Calificaciones","Autores","ISBN","Salir"};

		String [] botonesEliminar = {"Autor","T�tulo","ISBN"};

		String [] botonesCalificaci�n = {"mejor calificaci�n","peor calificaci�n"};

		String [] botonesISBN = {"T�tulos seg�n ISBN","Ordenar libros por ISBN"};


		int menu = JOptionPane.showOptionDialog(null, "Elije una opci�n", "Biblioteca", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, botones, botones[0]); {
			do {
				switch (menu) {
				case 0:
					String t�tulo = JOptionPane.showInputDialog(null, "T�tulo:");
					String autor = JOptionPane.showInputDialog(null, "Autor:");
					int calificaci�n = Integer.parseInt(JOptionPane.showInputDialog(null, "Calificaci�n:"));
					String ISBN = JOptionPane.showInputDialog(null, "ISBN:");
					int npags = Integer.parseInt(JOptionPane.showInputDialog(null, "N� p�ginas:"));
					estante.addLibro(new Libro2(t�tulo, autor, calificaci�n, ISBN, npags));
					break;
				case 1:
					JOptionPane.showMessageDialog(null,"Eliminar libro por:");
					int menuCase1 = JOptionPane.showOptionDialog(null, "Escoge una opci�n", "Eliminar libro", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, botonesEliminar, botonesEliminar[0]); {
						switch (menuCase1) {
						case 0:
							String autorE = JOptionPane.showInputDialog(null, "Autor:");
							estante.eliminarLibroA(autorE);
							System.out.println(estante.eliminarLibroA(autorE));
							break;
						case 1:
							String t�tuloE = JOptionPane.showInputDialog(null, "T�tulo:");
							estante.eliminarLibroT(t�tuloE);
							System.out.println(estante.eliminarLibroA(t�tuloE));
							break;
						case 2:
							String ISBNe = JOptionPane.showInputDialog(null, "ISBN:");
							estante.eliminarLibroISBN(ISBNe);
							System.out.println(estante.eliminarLibroISBN(ISBNe));
							break;
						}
					}
					break;
				case 2:
					JOptionPane.showMessageDialog(null,"Obtener...");
					int menuCase2 = JOptionPane.showOptionDialog(null, "Escoge una opci�n", "Obtener calificaciones", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, botonesCalificaci�n, botonesCalificaci�n[0]); {
						switch (menuCase2) {
						case 0:
							estante.mejorCalificaci�n();
							System.out.println(estante.mejorCalificaci�n());
							break;
						case 1:
							estante.peorCalificaci�n();
							System.out.println(estante.peorCalificaci�n());
							break;
						}
					}
					break;
				case 3:
					String lAutor = JOptionPane.showInputDialog(null, "Autor del cual se quieren obtener sus t�tulos:");
					estante.mostrarLibrosA(lAutor);
					System.out.println(estante.mostrarLibrosA(lAutor));
					break;
				case 4:
					int menuCase4 = JOptionPane.showOptionDialog(null, "Escoge una opci�n", "ISBN", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, botonesISBN, botonesISBN[0]); {
						switch (menuCase4) {
						case 0:
							String lISBN = JOptionPane.showInputDialog(null, "ISBN del libro/libros: ");
							estante.libroSeg�nISBN(lISBN);
							System.out.println(estante.mostrarLibrosA(lISBN));
						case 1:
							estante.ordenISBN();
							JOptionPane.showMessageDialog(null, "Libros ordenados seg�n su ISBN satisfactoriamente");
						}
					}
					break;
				case 5:
					JOptionPane.showMessageDialog(null, "Salir");
					break;

				} if (menu!=5) {menu = JOptionPane.showOptionDialog(null, "Escoge una opci�n", "Navegador web", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, botones, botones[0]);}
			}while(menu!=5);
		}
	}

}