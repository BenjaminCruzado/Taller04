public class ComputadorDeEscritorio extends DispositivoTecnologico {
	private String tarjetaDeVideo;
	private String fuenteDePoder;
	private String chasis;
	private String pantalla;

	public ComputadorDeEscritorio(String marca, String ram, String almacenamiento, String procesador, String modelo, int añoDeFabricacion, double precio, int stock, String tarjetaDeVideo, String fuenteDePoder, String chasis, String pantalla) {
		super(marca, ram, almacenamiento, procesador, modelo, añoDeFabricacion, precio, stock);
		this.tarjetaDeVideo = tarjetaDeVideo;
		this.fuenteDePoder = fuenteDePoder;
		this.chasis = chasis;
		this.pantalla = pantalla;
	}

	public String getTarjetaDeVideo() {
		return this.tarjetaDeVideo;
	}

	public void setTarjetaDeVideo(String tarjetaDeVideo) {
		this.tarjetaDeVideo = tarjetaDeVideo;
	}

	public String getFuenteDePoder() {
		return this.fuenteDePoder;
	}

	public void setFuenteDePoder(String fuenteDePoder) {
		this.fuenteDePoder = fuenteDePoder;
	}

	public String getChasis() {
		return this.chasis;
	}

	public void setChasis(String chasis) {
		this.chasis = chasis;
	}

	public String getPantalla() {
		return this.pantalla;
	}

	public void setPantalla(String pantalla) {
		this.pantalla = pantalla;
	}
}