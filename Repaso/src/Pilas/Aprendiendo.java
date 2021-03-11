package Pilas;

import java.net.URL;

public class Aprendiendo implements Aprender_pilas {
	
	
	private class Nodo {
		
		public URL url;
		public Nodo siguiente = null;
		public Nodo (URL url) {
			this.url = url;
		}
	}
	
	private Nodo cima = null;
	
	
	
	
	@Override
	public void apilar(URL url) {
		Nodo nodo = new Nodo(url);
		nodo.siguiente = cima;
		cima = nodo;
		
		
	}
	@Override
	public void desapilar() {
	}
	@Override
	public int longitud() {
	return 0;
	}
	@Override
	public URL obtener() {
		if (cima == null){
			return null;
		} else { return cima.url;
		
		}
	}
	@Override
	public boolean vacia() {				
	return false;
	}
	}


