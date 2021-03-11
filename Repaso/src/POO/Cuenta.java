package POO;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Cuenta {

	private String titular;
	private double saldo;

	private ArrayList<Cuenta> Banco;
	
	public Cuenta() {
		this.Banco=new ArrayList <Cuenta>();
	}
	
	//constructor
	public Cuenta(String titular, double saldo) {
		this.titular=titular;
		this.saldo=saldo;
	}
	
	
	public String getTitular() {
		return titular;
	}

	public void setTitular(String newTitulo) {
		this.titular=newTitulo;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double newSaldo) {
		this.saldo= newSaldo;
	}

	 public String toString() {
		 return " \n -Titular: " + this.titular + "\n -Saldo: " + this.saldo;
	}
	 
	 public void nuevaCuenta( Cuenta nuevaCuenta) {
		 Banco.add(nuevaCuenta);
	}
	public void ingresar(double dineroExtra) {
		
		if (dineroExtra>=0) {
			this.saldo= this.saldo + dineroExtra;
			JOptionPane.showMessageDialog(null, "Tienes "+dineroExtra+"€ en tu cuenta. ");
		} else {
			JOptionPane.showMessageDialog(null, "Ingresa una cantidad valida (Superior a 0€) ");
			
		}
	}
	public void retirarDinero(double dineroRetiro) {
		
		double dinero = this.saldo-dineroRetiro;
		
		if (dinero >= 0) {
			
			JOptionPane.showMessageDialog(null, "Operación realizada con éxito.\n Te quedan "+dinero+"€.");
		} else {
			
			JOptionPane.showMessageDialog(null, "No tienes suficiente dinero para llevar a cabo esta operacion, \n realiza una inferior a "+this.saldo+"€");
		}
		
	}
	public void buscarCuenta(String cuenta) {
		
		if(getTitular().equalsIgnoreCase(cuenta)) {
			JOptionPane.showMessageDialog(null, "\n"+getTitular()+"\n"+getSaldo());
			
		}else{
			JOptionPane.showMessageDialog(null, "No hay ninguna cuenta con ese titular. Por favor ingrese otro que sea correcto");
		}
		
	}
}
