package subastas;

public class SubastaMinima extends Subasta {
	
	private double numeroSubastasMinimo;
	
	public SubastaMinima(String producto, Usuario propietario, double numeroSubastasMinimo) {
		super(producto, propietario);
		// TODO Auto-generated constructor stub�
		
		this.numeroSubastasMinimo = numeroSubastasMinimo;
	}

}
