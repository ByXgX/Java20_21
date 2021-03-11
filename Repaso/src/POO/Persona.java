package POO;

public class Persona {

	private String Nombre;
	private String Apellidos;
	private String Telefono;
	
	  
	  public String getNombre(){

        return this.Nombre;
	  }
	  
	  public void setNombre(String nuevoNombre) {

        this.Nombre=nuevoNombre;
	  }
	
	  public String getApellidos(){

	        return this.Apellidos;
		  }
		  
	  public void setApellidos(String nuevoApellidos) {

	        this.Apellidos=nuevoApellidos;
		  }
	  public String getTelefono(){

		        return this.Telefono;
			  }
			  
	  public void setTelefono(String nuevoTelefono) {

		        this.Telefono=nuevoTelefono;
			  }
	
	
}
