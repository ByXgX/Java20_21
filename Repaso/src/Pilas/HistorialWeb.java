package Pilas;

import javax.swing.JOptionPane;

public class HistorialWeb {
	
	
public static void main(String[] args) {
		
	//Creamos una pila que este relacionada con la class en la que hemos puesto todas las funciones que vamos a utilizar más adelante.
	PilaStrings mipila = new PilaStrings();
	
	//aqui creamos el menu principal con los botones.
	Object [] botones = {"Visitar una nueva página", "Visitar la página anterior", "Numero de webs visitadas", "Poscion de una página","Eliminar una del historial","Salir"};
	int menu = JOptionPane.showOptionDialog(null,"Elige una opción", "",JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null,botones, botones[0]);
	//para que los botones funcionen bien debemos meter el switch en un bucle do while.
	
	do {
	switch (menu) {
		case 0:
			
			JOptionPane.showMessageDialog(null, "Visitar una nueva página");
			String pedir = JOptionPane.showInputDialog("Escribe la nueva dirreción");	
			mipila.insertar(pedir);
			break;
		case 1:	
			JOptionPane.showMessageDialog(null, "Visitar la página anterior");
			JOptionPane.showMessageDialog(null, "La página anteior es "+mipila.WebAnterior());
			break;
			
		case 2: 
			JOptionPane.showMessageDialog(null, "Has visitado "+mipila.contar()+" webs");
			break;
			
		case 3:
			int pedir1 = Integer.parseInt(JOptionPane.showInputDialog("Escribe un número y te devolvera la página correspondiente a ese número"));
			JOptionPane.showMessageDialog(null, "La web esta en la posición: "+mipila.posicion(pedir1));
			break;
			
		case 4:
			String pedir2 = JOptionPane.showInputDialog("Escribe una web y se va a eliminar");
			JOptionPane.showMessageDialog(null, "Se esta eliminando la web ");
			mipila.eliminar(pedir2);
			break;
			
		case 5:
			
			JOptionPane.showMessageDialog(null, "Saliendo");
			break;
			
			}
	
			if(menu != 5)
				{
					menu = JOptionPane.showOptionDialog(null,"Elige una opción", "",JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null,botones, botones[0]);
				}
			
			} while(menu!=5);
		}
		
	}
