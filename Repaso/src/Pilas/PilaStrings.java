package Pilas;

import javax.swing.JOptionPane;

public class PilaStrings {

	// aqui vamos a crear todas las funciones que usaremos en la pagina del menú
	private class Nodo {
		String dato;
		Nodo siguiente;
	}

	private Nodo arriba = null;
//creamos una class para la funcion insertar 
	public void insertar (String web) {
		Nodo nuevo = new Nodo(); 
		nuevo.dato = web;

		//con un if decimos que inserte un dato 
		if (arriba == null) {
			nuevo.siguiente = null;
			arriba=nuevo;	
		}
		else {
			nuevo.siguiente = arriba;
			arriba = nuevo;
		}
	}
	
	//con este public string creamos la funcion para extraer la ultima web que hemos escrito y almacenado en la pila
	public String WebAnterior() {
		if (arriba==null) {
		String resultado=arriba.dato;
		arriba=arriba.siguiente;
		return resultado;
		}else {
			return("No queda nada en la pila");
		}
		
		
	}
	
	//esta funcion no tiene utilidad, simplemente la cree para ir comprobando rapidamente si iban funcionando las funciones que iba creando.
	public void print() {
		Nodo nodoaux=arriba;
	
		while(nodoaux!=null) {
			System.out.println(nodoaux.dato);
			nodoaux=nodoaux.siguiente;
		}
	}
	
	// esta funcion sirve para comprobar si la pila esta vacia o no, más adelante la uso para realizar algunas funciones más complejas.
	public boolean pilaVacia() {
		
		if(arriba==null) {
			return true;
		}else {
			return false;
		}
	}
	
	//esta funcion sirve para contar la cantidad de datos que insertamos en una pila, con un bucle y un contador sabemos exactamente la cantidad
	public int contar() {
		int cuenta = 0;
		Nodo nodoaux = arriba;
		while (nodoaux!=null) {
			cuenta++;
			nodoaux = nodoaux.siguiente;
		}
		return cuenta;
	}
	
		// esta y la siguiente funcion han sido las que más me han costado, ya que he tenido que mezclar varias funciones y evitarr errores que habia tenido combinando un int con un string o cosas por el estilo
	public String posicion (int posicion) {
		Nodo nodoaux = arriba;
		int posaux = 1;
		String resultado = null;
		if (!pilaVacia()) { // aqui usamos la funcion creada anteriormente para comprobar que la pila no este vacia y poder realizar lo siguiente
			
			int numero = contar();
		
		
		if ((numero >= posicion)) { // esto es otro contador parecido al anterior para saber la cantidad de caracteres que queremos
			while (posaux != posicion) {
				nodoaux = nodoaux.siguiente;
				posaux++;
				
			}
			resultado = nodoaux.dato;
		
		}else {
			JOptionPane.showMessageDialog(null, "Escribe un número que no sobrepase el número de webs que hay en el historial");
			}
		}else{
			JOptionPane.showMessageDialog(null, "No hay ninguna web en el historial");
		}
		return resultado;
		
	}	
		
	// esta es la ultima funcion en la que tambien usamos "pilaVacia", sirve para eliminar un dato de la pila, el que queramos, en este caso sera una web que hayamos introducido previamente.
	 public void eliminar (String valor) {
			
			Nodo aux = arriba;						
			Nodo anterioraux = arriba; 
			
			if (!pilaVacia()) {							
				
				while (!aux.dato.equals(valor)) {			
					anterioraux = aux;				
					aux = aux.siguiente;			
					if (aux == null) 
						{
						break;
						}
				}
			
			if (aux==null)
			{
				JOptionPane.showMessageDialog(null,"No se encuentra ninguna web asi en el historial, por favor inserte un nombre válido");
			}
				
			else {	
			
				if (aux==arriba)
					{
					arriba=arriba.siguiente; 
					}
				else {
					anterioraux.siguiente=aux.siguiente; 
				}
			}
		}
			else {
				JOptionPane.showMessageDialog(null,"No se ha podido eliminar ningun dato porque el historial esta ");
			}
		}

}

