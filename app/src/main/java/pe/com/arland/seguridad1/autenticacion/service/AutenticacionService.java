package pe.com.arland.seguridad1.autenticacion.service;

import pe.com.arland.cliente1.registro.entity.ClienteEntity;
import pe.com.arland.cliente1.registro.entity.UsuarioAplicacionEntity;

public interface AutenticacionService {
	ClienteEntity obtenerClienteReferenciado(UsuarioAplicacionEntity usuario);
	ClienteEntity recuperarCliente(String tipoDocumento,String NumeroDocumento);
	UsuarioAplicacionEntity validarUsuarioAplicacionporCodUsuario(String codUsuario,String Clave);
	UsuarioAplicacionEntity validarUsuarioAplicacionporCorreoUsuario(String codUsuario,String sdd);
}
