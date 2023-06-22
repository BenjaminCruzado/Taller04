import java.util.ArrayList;

public class Tienda {
	private String direccion;
	private ArrayList<DispositivoTecnologico> producto;
	private ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	private ArrayList<DispositivoTecnologico> dispositivos_tecnologicos = new ArrayList<DispositivoTecnologico>();

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public ArrayList<DispositivoTecnologico> getProducto() {
		throw new UnsupportedOperationException();
	}

	public void setProducto(ArrayList<DispositivoTecnologico> producto) {
		throw new UnsupportedOperationException();
	}

	public void agregarCliente(Cliente cliente) {
		throw new UnsupportedOperationException();
	}

	public void agregarDispositivo(DispositivoTecnologico dispositivo) {
		throw new UnsupportedOperationException();
	}

	public void obtenerInformacionDeDispositivo(DispositivoTecnologico dispositivo) {
		throw new UnsupportedOperationException();
	}

	public void buscarDispositivoPorMarca(String marca) {
		throw new UnsupportedOperationException();
	}

	public void buscarDispositivoPorModeloYTipo(String modelo, String tipo) {
		throw new UnsupportedOperationException();
	}

	public Tienda(String direccion) {
		throw new UnsupportedOperationException();
	}
}