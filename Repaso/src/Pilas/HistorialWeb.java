package Pilas;

import javax.swing.JOptionPane;

public class HistorialWeb {
	
	
public static void main(String[] args) {
		
	//Creamos una pila que este relacionada con la class en la que hemos puesto todas las funciones que vamos a utilizar m�s adelante.
	PilaStrings mipila = new PilaStrings();
	
	//aqui creamos el menu principal con los botones.
	Object [] botones = {"Visitar una nueva p�gina", "Visitar la p�gina anterior", "Numero de webs visitadas", "Poscion de una p�gina","Eliminar una del historial","Salir"};
	int menu = JOptionPane.showOptionDialog(null,"Elige una opci�n", "",JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null,botones, botones[0]);
	//para que los botones funcionen bien debemos meter el switch en un bucle do while.
	
	do {
	switch (menu) {
		case 0:
			
			JOptionPane.showMessageDialog(null, "Visitar una nueva p�gina");
			String pedir = JOptionPane.showInputDialog("Escribe la nueva dirreci�n");	
			mipila.insertar(pedir);
			break;
		case 1:	
			JOptionPane.showMessageDialog(null, "Visitar la p�gina anterior");
			JOptionPane.showMessageDialog(null, "La p�gina anteior es "+mipila.WebAnterior());
			break;
			
		case 2: 
			JOptionPane.showMessageDialog(null, "Has visitado "+mipila.contar()+" webs");
			break;
			
		case 3:
			int pedir1 = Integer.parseInt(JOptionPane.showInputDialog("Escribe un n�mero y te devolvera la p�gina correspondiente a ese n�mero"));
			JOptionPane.showMessageDialog(null, "La web esta en la posici�n: "+mipila.posicion(pedir1));
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
					menu = JOptionPane.showOptionDialog(null,"Elige una opci�n", "",JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null,botones, botones[0]);
				}
			
			} while(menu!=5);
		}
		
	}
