public class Noteboock extends DispositivoTecnologico {
	private String resolucionDePantalla;
	private String tipoDeTeclado;
	private String bateria;

	public Noteboock(String marca, String ram, String almacenamiento, String procesador, String modelo, int añoDeFabricacion, double precio, int stock, String resolucionDePantalla, String tipoDeTeclado, String bateria) {
		super(marca, ram, almacenamiento, procesador, modelo, añoDeFabricacion, precio, stock);
		this.resolucionDePantalla = resolucionDePantalla;
		this.tipoDeTeclado = tipoDeTeclado;
		this.bateria = bateria;
	}

	public String getResolucionDePantalla() {
		return this.resolucionDePantalla;
	}

	public void setResolucionDePantalla(String resolucionDePantalla) {
		this.resolucionDePantalla = resolucionDePantalla;
	}

	public String getTipoDeTeclado() {
		return this.tipoDeTeclado;
	}

	public void setTipoDeTeclado(String tipoDeTeclado) {
		this.tipoDeTeclado = tipoDeTeclado;
	}

	public String getBateria() {
		return this.bateria;
	}

	public void setBateria(String bateria) {
		this.bateria = bateria;
	}
}