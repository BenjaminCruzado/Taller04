public abstract class DispositivoTecnologico {
	private String marca;
	private String ram;
	private String almacenamiento;
	private String procesador;
	private String modelo;
	private int añoDeFabricacion;
	private double precio;
	private int stock;
	private Tienda tienda;
	public DispositivoTecnologico(String marca, String ram, String almacenamiento, String procesador, String modelo, int añoDeFabricacion, double precio, int stock) {
		this.marca = marca;
		this.ram = ram;
		this.almacenamiento = almacenamiento;
		this.procesador = procesador;
		this.modelo = modelo;
		this.añoDeFabricacion = añoDeFabricacion;
		this.precio = precio;
		this.stock = stock;
	}

	public String getMarca() {
		return this.marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getRam() {
		return this.ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	public String getAlmacenamiento() {
		return this.almacenamiento;
	}

	public void setAlmacenamiento(String almacenamiento) {
		this.almacenamiento = almacenamiento;
	}

	public String getProcesador() {
		return this.procesador;
	}

	public void setProcesador(String procesador) {
		this.procesador = procesador;
	}

	public String getModelo() {
		return this.modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAñoDeFabricacion() {
		return this.añoDeFabricacion;
	}

	public void setAñoDeFabricacion(int añoDeFabricacion) {
		this.añoDeFabricacion = añoDeFabricacion;
	}

	public double getPrecio() {
		return this.precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getStock() {
		return this.stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
}