package modelo;

public class Furgon extends Vehiculo {
	
	private float cargaMaxima;
	private int plazas;
	
	public Furgon(String matricula, String modelo, String marca, float kmRecorridos, float precioDia, String tipoMotor,
			float cargaMaxima, int plazas) {
		super(matricula, modelo, marca, kmRecorridos, precioDia, tipoMotor);
		this.cargaMaxima = cargaMaxima;
		this.plazas = plazas;
	}

	public float getCargaMaxima() {
		return cargaMaxima;
	}

	public void setCargaMaxima(float cargaMaxima) {
		this.cargaMaxima = cargaMaxima;
	}

	public int getPlazas() {
		return plazas;
	}

	public void setPlazas(int plazas) {
		this.plazas = plazas;
	}
	
}
