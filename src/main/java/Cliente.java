public class Cliente {
	private String nombre;
	private String apellido;
	private String correo;
	private String numeroDeCelular;
	private String estadoCivil;
	private String ciudad;
	private Tienda tienda;
	public Cliente(String nombre, String apellido, String correo, String numeroDeCelular, String estadoCivil, String ciudad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.correo = correo;
		this.numeroDeCelular = numeroDeCelular;
		this.estadoCivil = estadoCivil;
		this.ciudad = ciudad;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return this.apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCorreo() {
		return this.correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getNumeroDeCelular() {
		return this.numeroDeCelular;
	}

	public void setNumeroDeCelular(String numeroDeCelular) {
		this.numeroDeCelular = numeroDeCelular;
	}

	public String getEdtadoCivil() {
		return this.estadoCivil;
	}

	public void setEdtadoCivil(String edtadoCivil) {
		this.estadoCivil = edtadoCivil;
	}

	public String getCiudad() {
		return this.ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

}