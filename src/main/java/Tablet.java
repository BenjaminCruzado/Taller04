import java.util.ArrayList;

public class Tablet extends DispositivoTecnologico {
	private String resolucionDePantalla;
	private ArrayList<String> accesorios;

	public Tablet(String marca, String ram, String almacenamiento, String procesador, String modelo, int añoDeFabricacion, double precio, int stock, String resolucionDePantalla) {
		super(marca, ram, almacenamiento, procesador, modelo, añoDeFabricacion, precio, stock);
		this.resolucionDePantalla = resolucionDePantalla;
		this.accesorios = null;
	}

	public String getResolucionDePantalla() {
		return this.resolucionDePantalla;
	}

	public void setResolucionDePantalla(String resolucionDePantalla) {
		this.resolucionDePantalla = resolucionDePantalla;
	}

	public ArrayList<String> getAccesorios() {
		return this.accesorios;
	}

	public void setAccesorios(ArrayList<String> accesorios) {
		this.accesorios = accesorios;
	}
}