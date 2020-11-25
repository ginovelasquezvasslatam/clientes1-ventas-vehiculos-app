package pe.com.arland.cliente1.registro.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UsuarioAplicacionEntity extends PersonaBase{

	private String codUsuario;
	private String claveUsuario;
	private Date fechaRegistro;
	private String estado;
	
	public String getCodUsuario() {
		return codUsuario;
	}
	public void setCodUsuario(String codUsuario) {
		this.codUsuario = codUsuario;
	}
	public String getClaveUsuario() {
		return claveUsuario;
	}
	public void setClaveUsuario(String claveUsuario) {
		this.claveUsuario = claveUsuario;
	}
	public Date getFechaRegistro() {
		return fechaRegistro;
	}
	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public UsuarioAplicacionEntity(String nombrePrincipal, String nombresSecundarios, String apellidoPaterno,
			String apellidoMaterno, String tipoDocumento, String numeroDocumento, String correoElectronico,
			List<DireccionEntity> direcciones, List<TelefonoEntity> telefonos, String codUsuario, String claveUsuario,
			Date fechaRegistro, String estado) {
		super(nombrePrincipal, nombresSecundarios, apellidoPaterno, apellidoMaterno, tipoDocumento, numeroDocumento,
				correoElectronico, direcciones, telefonos);
		this.codUsuario = codUsuario;
		this.claveUsuario = claveUsuario;
		this.fechaRegistro = fechaRegistro;
		this.estado = estado;
	}

	
}
