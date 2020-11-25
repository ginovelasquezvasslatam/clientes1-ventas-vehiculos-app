package pe.com.arland.seguridad1.autenticacion.repository;

import pe.com.arland.cliente1.registro.entity.UsuarioAplicacionEntity;

public interface UsuariosAplicacionRepository {
	UsuarioAplicacionEntity getUsuarioAplicacionbByUserClave(String codigoUsuario, String clave);
	UsuarioAplicacionEntity getUsuarioAplicacionbByCorreoClave(String correoElectronico , String clave);
	
}
