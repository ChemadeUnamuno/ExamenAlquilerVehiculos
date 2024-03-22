package modelo;

public class Camion extends Vehiculo {
	
	protected float pesoMaximo;
	protected float longitudMaxima;
	 
	public Camion(String matricula, String modelo, String marca, float kmRecorridos, float precioDia, String tipoMotor,
			float cargaMaxima, float longitudMaxima) {
		
		super(matricula, modelo, marca, kmRecorridos, precioDia, tipoMotor);
		this.pesoMaximo = cargaMaxima;
		this.longitudMaxima = longitudMaxima;
		
	}
	
	public float getPesoMaximo() {
		return pesoMaximo;
	}
	
	public void setPesoMaximo(float pesoMaximo) {
		this.pesoMaximo = pesoMaximo;
	}
	
	public float getLongitudMaxima() {
		return longitudMaxima;
	}
	
	public void setLongitudMaxima(float longitudMaxima) {
		this.longitudMaxima = longitudMaxima;
	}

}
