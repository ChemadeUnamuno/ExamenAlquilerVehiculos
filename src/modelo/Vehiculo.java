package modelo;

public class Vehiculo {
	
	protected String matricula;
	protected String modelo;
	protected String marca;
	protected float kmRecorridos;
	protected float precioDia;
	protected String tipoMotor;
	protected boolean alquilado;
	
	public Vehiculo(String matricula, String modelo, String marca, float kmRecorridos, float precioDia,
			String tipoMotor) {
		
		this.matricula = matricula;
		this.modelo = modelo;
		this.marca = marca;
		this.kmRecorridos = kmRecorridos;
		this.precioDia = precioDia;
		this.tipoMotor = tipoMotor;
		this.alquilado = false;
		
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public float getKmRecorridos() {
		return kmRecorridos;
	}

	public void setKmRecorridos(float kmRecorridos) {
		this.kmRecorridos = kmRecorridos;
	}

	public float getPrecioDia() {
		return precioDia;
	}

	public void setPrecioDia(float precioDia) {
		this.precioDia = precioDia;
	}

	public String getTipoMotor() {
		return tipoMotor;
	}

	public void setTipoMotor(String tipoMotor) {
		this.tipoMotor = tipoMotor;
	}

	public boolean isAlquilado() {
		return alquilado;
	}
	
	public void setAlquilado() {
		this.alquilado = true;
	}
	
	public float calcularPrecioACobrar(Reserva r, float kmsDeMas, int dias) {
		float resultado = 0.0f;
		kmRecorridos+=kmsDeMas;
		resultado += r.getDiasAlquilados() * precioDia;
		if (kmRecorridos/r.getDiasAlquilados()> 500) {
			resultado *= 1.2;
		}
		if (r.getDiasAlquilados()<dias) {
			int diferencia = dias-r.getDiasAlquilados();
			resultado += (precioDia*1.5)*diferencia;
			r.setDiasAlquilados(dias);
		}
		this.alquilado = false;
		return resultado;
	}
	
}
