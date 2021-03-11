package POO;

public class Libro2 extends Libro implements Comparable<Libro2>{

	private String ISBN;
	private int numPags;

	public Libro2(String título, String autor, int calificación, String ISBN, int numpags) {
		super (título, autor, calificación);
		this.ISBN=ISBN;
		this.numPags=numpags;
	}

	public String getTítulo() {
		return this.Titulo;
	}

	public void setTitulo(String newTítulo) {
		this.Titulo=newTítulo;
	}

	public String getAutor() {
		return this.autor;
	}

	public void setAutor(String newAutor) {
		this.autor=newAutor;
	}

	public double getCalificación() {
		return this.Calificacion;
	}

	public void setCalificación(int newCalificación) {
		this.Calificacion=newCalificación;
	}

	public String getISBN() {
		return this.ISBN;
	}

	public void setISBN(String newISBN) {
		this.ISBN=newISBN;
	}

	public int getNpags() {
		return this.numPags;
	}

	public void setNpags(int newNpags) {
		this.numPags=newNpags;
	}

	public String toString() {
		return "Título: " + this.Titulo + "\nAutor: " + this.autor + "\nCalificación: " + this.Calificacion + "\nISBN: " + this.ISBN + "\nNº páginas: " + this.numPags;
	}

	public int compareTo(Libro2 o) {
		int comparacion;
		comparacion = (this.ISBN).compareTo(o.getISBN());

		return comparacion;
	}
}