package modelo;
public class Camion extends Vehiculo{
private int pesoMaximo;
private float longitudMaxima;
	 
	public Camion(String matricula, String modelo, String marca, float kmRecorridos, float precioDia, String tipoMotor,
			int pesoMaximo, float longitudMaxima) {
		super(matricula, modelo, marca, kmRecorridos, precioDia, tipoMotor);
		this.pesoMaximo = pesoMaximo;
		this.longitudMaxima = longitudMaxima;
	}
	public int getPesoMaximo() {
		return pesoMaximo;
	}
	public void setPesoMaximo(int pesoMaximo) {
		this.pesoMaximo = pesoMaximo;
	}
	public float getLongitudMaxima() {
		return longitudMaxima;
	}
	public void setLongitudMaxima(float longitudMaxima) {
		this.longitudMaxima = longitudMaxima;
	}

}
