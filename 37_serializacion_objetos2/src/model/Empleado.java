package model;

public class Empleado{
	private String codigo;
	public Empleado() {}
	public Empleado(String codigo) {
		super();
		this.codigo = codigo;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}	
}
