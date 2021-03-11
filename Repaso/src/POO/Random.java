package POO;

import javax.swing.JOptionPane;

public class Random {

	public void main() {
		
		String [] ciudades= new String [5];
		 for (int x=0; x<5; x++)
		 { 
			 ciudades [x] = JOptionPane.showInputDialog(null,"Inserte el nombre de una ciudad");
			 
		 }
	}
}