import java.util.ArrayList;
import java.util.Scanner;

public class Tienda {
	private String direccion;
	private ArrayList<DispositivoTecnologico> producto;
	private ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	private ArrayList<DispositivoTecnologico> dispositivosTecnologicos = new ArrayList<DispositivoTecnologico>();
	public Tienda(String direccion) {
		this.direccion = direccion;
		this.producto = new ArrayList<>();
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public ArrayList<DispositivoTecnologico> getProducto() {
		return this.producto;
	}

	public void setProducto(ArrayList<DispositivoTecnologico> producto) {
		this.producto = producto;
	}

	public void agregarCliente(Cliente cliente) {
		clientes.add(cliente);
	}
	public void agregarNoteboock(Noteboock notboock){
		dispositivosTecnologicos.add(notboock);
	}
	public void agregarTablet(Tablet tablet){
		dispositivosTecnologicos.add(tablet);
	}
	public void agregarComputadorDeEscritorio(ComputadorDeEscritorio computadorDeEscritorio){
		dispositivosTecnologicos.add(computadorDeEscritorio);
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

}