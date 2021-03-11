package Figuras;
/**
 * 
 *Implementacion clase circulo
 * @author Guillermo Palmero Fiz
 * @version beta 1.23.3w
 * 
 */
public class cilindro {
	
	private double radio;
    private double altura;
	/**
	 * 
	 * @param radio
	 * @param altura
	 */
	  public void circulo (double radio,double altura) {

          this.radio=radio;
          this.altura=altura;
	  		
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
	   * @param nuevoRadio
	   */
	  public void setRadio(double nuevoRadio) {

          this.radio=nuevoRadio;
	  }
	  /**
	   * 
	   * @return altura
	   */
	  public double getAltura(){

         return this.altura;
	  }
	  /**
	   * 
	   * @param nuevaAltura
	   */
	  public void setAltura(double nuevaAltura) {

          this.altura=nuevaAltura;
	  }
	  /**
	   * 
	   * @return area
	   */
	  public double area() {
			double area;
			area = 2*Math.PI*radio*altura;
			return area;
		}
	  /**
	   * 
	   * @return volumen
	   */
	  public double volumen() {
			double volumen;
			volumen = (Math.PI*Math.pow(radio, 2))*altura;
			return volumen;
		}
	
	
}
