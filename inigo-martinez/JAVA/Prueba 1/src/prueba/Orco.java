package prueba;

public class Orco {

	int PV, danio, armadura;
	String raza;

	public Orco() {
		raza="Orco";
		this.PV = (int) (Math.random()*4)+4;
		this.danio = (int) (Math.random()*5)+4;
		this.armadura = (int) (Math.random()*2)+4;
	}

	public int atacar() {

		int danioRealizado = Integer.parseInt(Double.toString((Math.random() * (this.danio))));
		return danioRealizado;

	}

	@Override
	public String toString() {
		return "Orco";
	}

}