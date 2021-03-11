package Figuras;
/**
 * Implementacion clase rectangulo
 * @author Guillermo Palmero Fiz
 * @version beta 1.23.3w
 * 
 *
 */

public class rectangulo {

 

              private double base;
              private double altura;
              
              /**
               * 
               * @param base
               * @param altura
               */
              public rectangulo (double base, double altura) {

                            this.base=base;

                            this.altura=altura;

              }
              /**
               * 
               * @return base
               */
              public double getBase(){

                            return this.base;
              }
              /**
               * 
               * @param nuevaBase
               */
              public void setBase(double nuevaBase) {

                            this.base=nuevaBase;
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
          		area = this.base*this.altura;
          		return area;
          	}
               /**
                * 
                * @return perimetro
                */
              public double perimetro() {
          		double perimetro;
          		perimetro = this.base*2+this.altura*2;
          		return perimetro;
          	}
}