package POO;

import javax.swing.JOptionPane;

public class Biblioteca2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Estante2 estante = new Estante2();

		String [] botones = {"Añadir libro","Eliminar libro","Calificaciones","Autores","ISBN","Salir"};

		String [] botonesEliminar = {"Autor","Título","ISBN"};

		String [] botonesCalificación = {"mejor calificación","peor calificación"};

		String [] botonesISBN = {"Títulos según ISBN","Ordenar libros por ISBN"};


		int menu = JOptionPane.showOptionDialog(null, "Elije una opción", "Biblioteca", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, botones, botones[0]); {
			do {
				switch (menu) {
				case 0:
					String título = JOptionPane.showInputDialog(null, "Título:");
					String autor = JOptionPane.showInputDialog(null, "Autor:");
					int calificación = Integer.parseInt(JOptionPane.showInputDialog(null, "Calificación:"));
					String ISBN = JOptionPane.showInputDialog(null, "ISBN:");
					int npags = Integer.parseInt(JOptionPane.showInputDialog(null, "Nº páginas:"));
					estante.addLibro(new Libro2(título, autor, calificación, ISBN, npags));
					break;
				case 1:
					JOptionPane.showMessageDialog(null,"Eliminar libro por:");
					int menuCase1 = JOptionPane.showOptionDialog(null, "Escoge una opción", "Eliminar libro", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, botonesEliminar, botonesEliminar[0]); {
						switch (menuCase1) {
						case 0:
							String autorE = JOptionPane.showInputDialog(null, "Autor:");
							estante.eliminarLibroA(autorE);
							System.out.println(estante.eliminarLibroA(autorE));
							break;
						case 1:
							String títuloE = JOptionPane.showInputDialog(null, "Título:");
							estante.eliminarLibroT(títuloE);
							System.out.println(estante.eliminarLibroA(títuloE));
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
					int menuCase2 = JOptionPane.showOptionDialog(null, "Escoge una opción", "Obtener calificaciones", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, botonesCalificación, botonesCalificación[0]); {
						switch (menuCase2) {
						case 0:
							estante.mejorCalificación();
							System.out.println(estante.mejorCalificación());
							break;
						case 1:
							estante.peorCalificación();
							System.out.println(estante.peorCalificación());
							break;
						}
					}
					break;
				case 3:
					String lAutor = JOptionPane.showInputDialog(null, "Autor del cual se quieren obtener sus títulos:");
					estante.mostrarLibrosA(lAutor);
					System.out.println(estante.mostrarLibrosA(lAutor));
					break;
				case 4:
					int menuCase4 = JOptionPane.showOptionDialog(null, "Escoge una opción", "ISBN", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, botonesISBN, botonesISBN[0]); {
						switch (menuCase4) {
						case 0:
							String lISBN = JOptionPane.showInputDialog(null, "ISBN del libro/libros: ");
							estante.libroSegúnISBN(lISBN);
							System.out.println(estante.mostrarLibrosA(lISBN));
						case 1:
							estante.ordenISBN();
							JOptionPane.showMessageDialog(null, "Libros ordenados según su ISBN satisfactoriamente");
						}
					}
					break;
				case 5:
					JOptionPane.showMessageDialog(null, "Salir");
					break;

				} if (menu!=5) {menu = JOptionPane.showOptionDialog(null, "Escoge una opción", "Navegador web", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, botones, botones[0]);}
			}while(menu!=5);
		}
	}

}