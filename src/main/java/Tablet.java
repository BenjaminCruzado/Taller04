import java.util.ArrayList;

public class Tablet extends DispositivoTecnologico {
	private String resolucionDePantalla;
	private ArrayList<String> accesorios;

	public String getResolucionDePantalla() {
		return this.resolucionDePantalla;
	}

	public void setResolucionDePantalla(String resolucionDePantalla) {
		this.resolucionDePantalla = resolucionDePantalla;
	}

	public ArrayList<String> getAccesorios() {
		throw new UnsupportedOperationException();
	}

	public void setAccesorios(ArrayList<String> accesorios) {
		throw new UnsupportedOperationException();
	}
}