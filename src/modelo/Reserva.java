package modelo;

public class Reserva {
	
	private String matricula;
	private String dni;
	private int diasAlquilados;
	private String fechaInicio;
	
	public Reserva(String matricula, String dni, int diasAlquilados, String fechaInicio) {
		
		this.matricula = matricula;
		this.dni = dni;
		this.diasAlquilados = diasAlquilados;
		this.fechaInicio = fechaInicio;
		
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public int getDiasAlquilados() {
		return diasAlquilados;
	}

	public void setDiasAlquilados(int diasAlquilados) {
		this.diasAlquilados = diasAlquilados;
	}

	public String getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(String fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	
}
