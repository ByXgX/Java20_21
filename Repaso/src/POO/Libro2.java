package POO;

public class Libro2 extends Libro implements Comparable<Libro2>{

	private String ISBN;
	private int numPags;

	public Libro2(String t�tulo, String autor, int calificaci�n, String ISBN, int numpags) {
		super (t�tulo, autor, calificaci�n);
		this.ISBN=ISBN;
		this.numPags=numpags;
	}

	public String getT�tulo() {
		return this.Titulo;
	}

	public void setTitulo(String newT�tulo) {
		this.Titulo=newT�tulo;
	}

	public String getAutor() {
		return this.autor;
	}

	public void setAutor(String newAutor) {
		this.autor=newAutor;
	}

	public double getCalificaci�n() {
		return this.Calificacion;
	}

	public void setCalificaci�n(int newCalificaci�n) {
		this.Calificacion=newCalificaci�n;
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
		return "T�tulo: " + this.Titulo + "\nAutor: " + this.autor + "\nCalificaci�n: " + this.Calificacion + "\nISBN: " + this.ISBN + "\nN� p�ginas: " + this.numPags;
	}

	public int compareTo(Libro2 o) {
		int comparacion;
		comparacion = (this.ISBN).compareTo(o.getISBN());

		return comparacion;
	}
}