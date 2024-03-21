package modelo;

public class Cliente {
	private String Nombre;
	private String Apellidos;
	private String Email;
	private String Telefono;
	private String DNI;
	private int NumeroTarjeta;
	public Cliente(String nombre, String apellidos, String email, String telefono, String dNI, int numeroTarjeta) {
		super();
		Nombre = nombre;
		Apellidos = apellidos;
		Email = email;
		Telefono = telefono;
		DNI = dNI;
		NumeroTarjeta = numeroTarjeta;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getApellidos() {
		return Apellidos;
	}
	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getTelefono() {
		return Telefono;
	}
	public void setTelefono(String telefono) {
		Telefono = telefono;
	}
	public String getDNI() {
		return DNI;
	}
	public void setDNI(String dNI) {
		DNI = dNI;
	}
	public int getNumeroTarjeta() {
		return NumeroTarjeta;
	}
	public void setNumeroTarjeta(int numeroTarjeta) {
		NumeroTarjeta = numeroTarjeta;
	}
}
