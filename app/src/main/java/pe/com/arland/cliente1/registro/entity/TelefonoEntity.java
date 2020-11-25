package pe.com.arland.cliente1.registro.entity;

public class TelefonoEntity {

	private String tipo;
	private String area;
	private Integer numero;
	private String operador;
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public String getOperador() {
		return operador;
	}
	public void setOperador(String operador) {
		this.operador = operador;
	}
	public TelefonoEntity(String tipo, String area, Integer numero, String operador) {
		super();
		this.tipo = tipo;
		this.area = area;
		this.numero = numero;
		this.operador = operador;
	}
	
	
	
}
