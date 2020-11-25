package pe.com.arland.cliente1.registro.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ClienteEntity  extends PersonaBase {
	
	private String idCliente;
	private String tipoCliente;
	private Date fechaRegistro;
	public String getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(String idCliente) {
		this.idCliente = idCliente;
	}
	public String getTipoCliente() {
		return tipoCliente;
	}
	public void setTipoCliente(String tipoCliente) {
		this.tipoCliente = tipoCliente;
	}
	public Date getFechaRegistro() {
		return fechaRegistro;
	}
	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}
	public ClienteEntity(String nombrePrincipal, String nombresSecundarios, String apellidoPaterno,
			String apellidoMaterno, String tipoDocumento, String numeroDocumento, String correoElectronico,
			List<DireccionEntity> direcciones, List<TelefonoEntity> telefonos, String idCliente, String tipoCliente,
			Date fechaRegistro) {
		super(nombrePrincipal, nombresSecundarios, apellidoPaterno, apellidoMaterno, tipoDocumento, numeroDocumento,
				correoElectronico, direcciones, telefonos);
		this.idCliente = idCliente;
		this.tipoCliente = tipoCliente;
		this.fechaRegistro = fechaRegistro;
	}
	

	

}
