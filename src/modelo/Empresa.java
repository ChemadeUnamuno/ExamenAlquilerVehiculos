package modelo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Empresa {
	
	private List<Vehiculo> misVehiculos;
	private List<Reserva> misReservas;
	private Map<String,Cliente> misClientes;

	public Empresa() {
		
		this.misVehiculos = new ArrayList<>();
		this.misReservas = new ArrayList<>();
		this.misClientes = new HashMap<>();
	}

	public boolean addVehiculo(Vehiculo v) {
		if(v!=null) {
			if(buscarVehiculo(v.getMatricula()) == null) {
				misVehiculos.add(v);
				return true;
			}
		}
		return false;
	}
	
	public Vehiculo buscarVehiculo(String matricula) {
		for (Vehiculo v:misVehiculos) {
			if(matricula.equals(v.getMatricula())) {
				return v;
			}
		}
		return null;
	}
	
	public Reserva buscarReserva(String matricula,String dni) {
		for (Reserva r:misReservas) {
			if(matricula.equals(r.getMatricula())) {
				if(dni.equals(r.getDni())) {
					return r;
				}
			}
		}
		return null;
	}
	
	public boolean addCliente(Cliente c) {
		if(c!=null) {
			if(!misClientes.containsKey(c.getDni())) {
				misClientes.put(c.getDni(), c);
				return true;
			}
		}
		return false;
	}
	
	public boolean alquilarVehiculo(Reserva r) {
		if(r!=null) {
			if(misClientes.containsKey(r.getDni())) {
				Vehiculo v = buscarVehiculo(r.getMatricula());
				if(v != null) {
					misReservas.add(r);
					v.setAlquilado();
					return true;
				}
			}
		}
		return false;
	}
	
	public float devolverVehiculo(Reserva r, float KM, int dias) {
		if(r!=null) {
			if(buscarReserva(r.getMatricula(),r.getDni()) != null) {
				misReservas.remove(r);
				return buscarVehiculo(r.getMatricula()).calcularPrecioACobrar(r, KM, dias);
			}
		}
		return 0f;
	}
	
	public List<Vehiculo> listaCoches(int plazas, String tipoMotor) {
		List<Vehiculo> misV = new ArrayList<>();
		for (Vehiculo v:misVehiculos) {
			if(v instanceof Coche) {
				if( ((Coche) v).getiPlazas() >= plazas && ((Coche) v).getTipoMotor().equals(tipoMotor)) {
					misV.add(v);
				}
			}
		}
		return misV;
	}
	
	public List<Vehiculo> listaFurgones(float carga, int plazas) {
		List<Vehiculo> misV = new ArrayList<>();
		for (Vehiculo v:misVehiculos) {
			if(v instanceof Furgon) {
				if( ((Furgon) v).getPlazas() >= plazas && ((Furgon) v).getCargaMaxima() >= carga) {
					misV.add(v);
				}
			}
		}
		return misV;
	}
	
	public List<Vehiculo> listaCamiones(float carga, float longitud) {
		List<Vehiculo> misV = new ArrayList<>();
		for (Vehiculo v:misVehiculos) {
			if(v instanceof Camion) {
				if( ((Camion) v).getPesoMaximo() >= carga && ((Camion) v).getLongitudMaxima() >= longitud) {
					misV.add(v);
				}
			}
		}
		return misV;
	}

}
