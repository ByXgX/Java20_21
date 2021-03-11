package Figuras;
/**
 * Implementacion clase circulo
 * @author Guillermo Palmero Fiz
 * @version beta 1.23.3w
 * 
 */
public class circulo {

	private double radio;
	/**
	 * 
	 * @param radio
	 */
	 public circulo (double radio) {

         this.radio=radio;
	 }
	 /**
	  * 
	  * @return radio
	  */
	 public double getRadio(){

         return this.radio;
	 }
	 /**
	  * 
	  * @param radio
	  */
	 public void setRadio(double radio) {

         this.radio=radio;
	 } 
	 /**
	  * 
	  * @return area
	  */
	 public double area() {
		 
	        double area;
	        area = Math.PI*Math.pow(radio, 2);
	        return area;
	}
	 /**
	  * 
	  * @return perimetro
	  */
	public double perimetro() {
		
    	double perimetro;
    	perimetro = 2*Math.PI*radio;
    	return perimetro;
    }
	
}	
