package pe.com.arland.seguridad1.autenticacion.service.impl;

import pe.com.arland.cliente1.registro.entity.ClienteEntity;
import pe.com.arland.cliente1.registro.entity.UsuarioAplicacionEntity;
import pe.com.arland.seguridad1.autenticacion.repository.ClientesRepository;
import pe.com.arland.seguridad1.autenticacion.repository.UsuariosAplicacionRepository;
import pe.com.arland.seguridad1.autenticacion.repository.mongodb.ClientesRepositoryImpl;
import pe.com.arland.seguridad1.autenticacion.repository.mongodb.UsuariosAplicacionRepositoryImpl;
import pe.com.arland.seguridad1.autenticacion.service.AutenticacionService;

public class AutenticacionServiceImpl implements AutenticacionService {

	/*===========================================*/
	UsuariosAplicacionRepository usuarioDAO;
	ClientesRepository  clienteDAO;
	
	public UsuariosAplicacionRepository getUsuarioDAO() {
		return usuarioDAO;
	}

	public void setUsuarioDAO(UsuariosAplicacionRepository usuarioDAO) {
		this.usuarioDAO = usuarioDAO;
	}

	public ClientesRepository getClienteDAO() {
		return clienteDAO;
	}

	public void setClienteDAO(ClientesRepository clienteDAO) {
		this.clienteDAO = clienteDAO;
	}

	/*===========================================*/
	
	public AutenticacionServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public ClienteEntity obtenerClienteReferenciado(UsuarioAplicacionEntity usuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ClienteEntity recuperarCliente(String tipoDocumento, String NumeroDocumento) {
		ClienteEntity cliente;
		cliente = clienteDAO.getClienteByPersonId(tipoDocumento, NumeroDocumento);
		if (cliente!=null) {return cliente;}
		return null;
	}

	@Override
	public UsuarioAplicacionEntity validarUsuarioAplicacionporCodUsuario(String codUsuario, String Clave) {
		UsuarioAplicacionEntity usuario;
		usuario = usuarioDAO.getUsuarioAplicacionbByUserClave(codUsuario, Clave);
		if (usuario!=null) {
			return usuario;
		}
		return null;
	}

	@Override
	public UsuarioAplicacionEntity validarUsuarioAplicacionporCorreoUsuario(String codUsuario, String sdd) {
		// TODO Auto-generated method stub
		return null;
	}

}
