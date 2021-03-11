package POO;

//Aqui creamos la clase libro con los gets y los sets de cada propiedad.
public class Libro {

		//inicializamos las variables de un libro 
			protected String Titulo;
			protected String autor;
			protected double Calificacion;

			public Libro (String titulo,String Autor,double calificacion){
				this.Titulo=titulo;
				this.autor=Autor;
				this.Calificacion=calificacion;
			}
		// a continuacion creamos los sets y los gets de cada variable
			public String getTitulo() {
				return Titulo;
			}

			public void setTitulo(String titulo) {
				this.Titulo=titulo;
			}

			public String getAutor() {
				return autor;
			}

			public void setAutor(String Autor) {
				this.autor=Autor;
			}

			public double getCalificacion() {
				return Calificacion;
			}

			public void setCalificacion(int calificacion) {
				this.Calificacion=calificacion;
			}
	}
	 