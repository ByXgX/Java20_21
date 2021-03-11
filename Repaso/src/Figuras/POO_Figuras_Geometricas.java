package Figuras;

import javax.swing.JOptionPane;
/**
 * Implementacion clase circulo
 * @author Guillermo Palmero Fiz
 * @version beta 1.23.3w
 * 
 *
 */
public class POO_Figuras_Geometricas {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		String [] menu = {"Nueva figura","Figuras existentes","Salir"};
		String [] crear = {"Nuevo Rectángulo","Nuevo círculo","Nuevo cilíndro"};
		
		circulo miCirculo = new circulo(0);
		rectangulo miRectangulo = new rectangulo(0,0);
		cilindro miCilindro = new cilindro();

		int eleccion=0;
		while(eleccion!=2) {
			eleccion = JOptionPane.showOptionDialog(null,"Elije entre:","Menú",JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,
				null,menu,menu[2]);
			switch(eleccion) {

			case 0:

				int crearfigura = JOptionPane.showOptionDialog(null,"Elije","Crear:",JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,
						null,crear,crear[2]);

				switch(crearfigura) {

				case 0:
					
					String base1 = JOptionPane.showInputDialog(null,"Inserta la base del rectángulo:");
					int base2=Integer.parseInt(base1);

					String altura1 = JOptionPane.showInputDialog(null,"Inserta la altura del rectángulo:");
					int altura2=Integer.parseInt(altura1);

					miRectangulo.setBase(base2);
					miRectangulo.setAltura(altura2);

					break;

				case 1:
					
					String radio1 = JOptionPane.showInputDialog(null,"Radio círculo:");
					int radio2=Integer.parseInt(radio1);

					miCirculo.setRadio(radio2);

					break;
				case 2:
					String radio3 = JOptionPane.showInputDialog(null,"Radio cilíndro:");
					int radio4=Integer.parseInt(radio3);

					String altura3 = JOptionPane.showInputDialog(null,"Altura cilíndro:");
					int altura4=Integer.parseInt(altura3);

					miCilindro.setAltura(altura4);
					miCilindro.setRadio(radio4);

					break;	
				}

				break;


			case 1:

				JOptionPane.showMessageDialog(null,"Formas: \nRectángulo: Tiene un area de " + miCirculo.area() + " y un perímetro de " + miCirculo.perimetro() + 
						"\nCírculo: Tiene un perimetro de " +miRectangulo.perimetro() + " y un area de " +miRectangulo.area()+
						"\nCilíndro: Tiene un area de " + miCilindro.area() + " y un volumen de " + miCilindro.volumen());

				break;

			case 2:

				eleccion = 2;
				break;
			}

		}

	}

}


