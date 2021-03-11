package Pilas;

public class PruebasPilas {
	 class Nodo {
	        int info;
	        Nodo sig;
	    }
		
	    private Nodo raiz;
	    
	    public PruebasPilas () {
	        raiz=null;
	    }
	    
	    public void insertar(int x) {
	    	Nodo nuevo;
	        nuevo = new Nodo();
	        nuevo.info = x;
	        if (raiz==null)
	        {
	            nuevo.sig = null;
	            raiz = nuevo;
	        }
	        else
	        {
	            nuevo.sig = raiz;
	            raiz = nuevo;
	        }
	    }
	    
	    public int extraer ()
	    {
	        if (raiz!=null)
	        {
	            int informacion = raiz.info;
	            raiz = raiz.sig;
	            return informacion;
	        }
	        else
	        {
	            return Integer.MAX_VALUE;
	        }
	    }
	    
	    public void imprimir() {
	        Nodo reco=raiz;
	       //JOptionPane.showInputDialog("Listado de todos los elementos de la pila.");
	        while (reco!=null) {
	            //System.out.print(reco.info+"-");
	            reco=reco.sig;
	        }
	        System.out.println();
	    }
	    
	    
	    
	    public static void main(String[] args) {
//	    	String pedir = JOptionPane.showInputDialog(null,"");
//	    	int n1 = Integer.parseInt(pedir);
	    	
	    	PruebasPilas pila1=new PruebasPilas();
	    	
	    	PruebasPilas pila2=new PruebasPilas();
	    	
	        pila2.insertar(32);
	        pila1.insertar(40);
	        pila1.insertar(8);
	        pila1.imprimir();
	        System.out.println("Extraemos de la pila:"+pila1.extraer());
	        pila1.imprimir();        
	    }
}
