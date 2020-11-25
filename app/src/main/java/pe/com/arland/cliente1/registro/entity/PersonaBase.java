package pe.com.arland.cliente1.registro.entity;

import java.util.ArrayList;
import java.util.List;

public abstract class PersonaBase {
	private String nombrePrincipal;
	private String nombresSecundarios;
	private String apellidoPaterno;
	private String apellidoMaterno;
	private String tipoDocumento;
	private String numeroDocumento;
    private String correoElectronico;	
	
	private List<DireccionEntity> direcciones = new ArrayList<DireccionEntity>();
	private List<TelefonoEntity> telefonos = new ArrayList<TelefonoEntity>();
	
	public String getNombrePrincipal() {
		return nombrePrincipal;
	}
	public void setNombrePrincipal(String nombrePrincipal) {
		this.nombrePrincipal = nombrePrincipal;
	}
	public String getNombresSecundarios() {
		return nombresSecundarios;
	}
	public void setNombresSecundarios(String nombresSecundarios) {
		this.nombresSecundarios = nombresSecundarios;
	}
	public String getApellidoPaterno() {
		return apellidoPaterno;
	}
	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}
	public String getApellidoMaterno() {
		return apellidoMaterno;
	}
	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}
	public String getTipoDocumento() {
		return tipoDocumento;
	}
	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}
	public String getNumeroDocumento() {
		return numeroDocumento;
	}
	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}
	public String getCorreoElectronico() {
		return correoElectronico;
	}
	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}
	public List<DireccionEntity> getDirecciones() {
		return direcciones;
	}
	public void setDirecciones(List<DireccionEntity> direcciones) {
		this.direcciones = direcciones;
	}
	public List<TelefonoEntity> getTelefonos() {
		return telefonos;
	}
	public void setTelefonos(List<TelefonoEntity> telefonos) {
		this.telefonos = telefonos;
	}
	public PersonaBase(String nombrePrincipal, String nombresSecundarios, String apellidoPaterno,
			String apellidoMaterno, String tipoDocumento, String numeroDocumento, String correoElectronico,
			List<DireccionEntity> direcciones, List<TelefonoEntity> telefonos) {
		super();
		
		List<DireccionEntity> direccionestmp = new ArrayList<>();
		direccionestmp.addAll(direcciones);

		List<TelefonoEntity> telefonostmp = new ArrayList<>();
		telefonostmp.addAll(telefonos);
		
		this.nombrePrincipal = nombrePrincipal;
		this.nombresSecundarios = nombresSecundarios;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
		this.tipoDocumento = tipoDocumento;
		this.numeroDocumento = numeroDocumento;
		this.correoElectronico = correoElectronico;
		this.direcciones = direcciones;
		this.telefonos = telefonos;
	}

	
	
}
