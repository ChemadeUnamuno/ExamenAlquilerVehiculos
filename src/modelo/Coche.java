package modelo;

public class Coche extends Vehiculo {
	
	//Atributos
	public enum TipoCoche {
		utilitario,
		berlina,
		mono,
		suv
	}
	
	
	protected int iPlazas;
	protected int iPuertas;
	protected float fVolumenMaletero;
	protected TipoCoche tipo;
	
	
	public Coche(String matricula, String modelo, String marca, float kmRecorridos, float precioDia, String tipoMotor,
			int iPlazas, int iPuertas, float fVolumenMaletero, TipoCoche tipo) {
		super(matricula, modelo, marca, kmRecorridos, precioDia, tipoMotor);
		this.iPlazas = iPlazas;
		this.iPuertas = iPuertas;
		this.fVolumenMaletero = fVolumenMaletero;
		this.tipo = tipo;
	}
	
	public int getiPlazas() {
		return iPlazas;
	}
	
	public void setiPlazas(int iPlazas) {
		this.iPlazas = iPlazas;
	}
	public int getiPuertas() {
		return iPuertas;
	}
	public void setiPuertas(int iPuertas) {
		this.iPuertas = iPuertas;
	}
	public float getfVolumenMaletero() {
		return fVolumenMaletero;
	}
	public void setfVolumenMaletero(float fVolumenMaletero) {
		this.fVolumenMaletero = fVolumenMaletero;
	}
	public TipoCoche getTipo() {
		return tipo;
	}
	public void setTipo(TipoCoche tipo) {
		this.tipo = tipo;
	}
	
	
	

}
