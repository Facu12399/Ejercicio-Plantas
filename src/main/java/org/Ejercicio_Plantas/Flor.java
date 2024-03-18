package org.Ejercicio_Plantas;

public class Flor extends Planta {
	private String colorDePetalos;
	private int cantidadPromedioDePetalos;
	private String colorDelPistilo;
	private String variedadDeFlor;
	private String estacionQueFlorece;
	
	public Flor(){}

	public Flor(String nombre, double altoDelTallo, boolean tieneHojas, String climaIdeal, String colorDePetalos,
			int cantidadPromedioDePetalos, String colorDelPistilo, String variedadDeFlor,
			String estacionQueFlorece) {
		super(nombre, altoDelTallo, tieneHojas, climaIdeal);
		this.colorDePetalos = colorDePetalos;
		this.cantidadPromedioDePetalos = cantidadPromedioDePetalos;
		this.colorDelPistilo = colorDelPistilo;
		this.variedadDeFlor = variedadDeFlor;
		this.estacionQueFlorece = estacionQueFlorece;
	}

	public String getColorDePetalos() {
		return colorDePetalos;
	}

	public void setColorDePetalos(String colorDePetalos) {
		this.colorDePetalos = colorDePetalos;
	}

	public int getCantidadPromedioDePetalos() {
		return cantidadPromedioDePetalos;
	}

	public void setCantidadPromedioDePetalos(int cantidadPromedioDePetalos) {
		this.cantidadPromedioDePetalos = cantidadPromedioDePetalos;
	}

	public String getColorDelPistilo() {
		return colorDelPistilo;
	}

	public void setColorDelPistilo(String colorDelPistilo) {
		this.colorDelPistilo = colorDelPistilo;
	}

	public String getVariedadDeFlor() {
		return variedadDeFlor;
	}

	public void setVariedadDeFlor(String variedadDeFlor) {
		this.variedadDeFlor = variedadDeFlor;
	}

	public String getEstacionQueFlorece() {
		return estacionQueFlorece;
	}

	public void setEstacionQueFlorece(String estacionQueFlorece) {
		this.estacionQueFlorece = estacionQueFlorece;
	}
	
	public void mensajeFlor() {
		System.out.println("Hola soy una flor");
	}

}
