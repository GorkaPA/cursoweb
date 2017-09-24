package tulibroencasa.beans;

import java.io.Serializable;
import java.util.Date;

public class Libro implements Serializable {
	private static final long serialVersionUID = 1L;

	private String isbn;
	private String titulo;
	private double precio;
	private String stock;
	private String autor;
	private String categoria;
	private String editorial;

	public Libro(String isbn, String titulo, double precio, String stock, String autor, String categoria,
			String editorial) {
		super();
		this.isbn = isbn;
		this.titulo = titulo;
		this.precio = precio;
		this.stock = stock;
		this.autor = autor;
		this.categoria = categoria;
		this.editorial = editorial;
	}
	public Libro() {
		// TODO Auto-generated constructor stub
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getStock() {
		return stock;
	}
	public void setStock(String stock) {
		this.stock = stock;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getEditorial() {
		return editorial;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
}
