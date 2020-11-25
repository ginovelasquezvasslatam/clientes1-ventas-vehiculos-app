package pe.com.arland.seguridad1.autenticacion.repository.mongodb;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import pe.com.arland.cliente1.registro.entity.DireccionEntity;
import pe.com.arland.cliente1.registro.entity.TelefonoEntity;
import pe.com.arland.cliente1.registro.entity.UsuarioAplicacionEntity;
import pe.com.arland.seguridad1.autenticacion.repository.UsuariosAplicacionRepository;

public class UsuariosAplicacionRepositoryImpl implements UsuariosAplicacionRepository {

	/**
	 * Retorna los datos de un usuario cuando se consulta a este por codUsuario y
	 * clave
	 * 
	 * @param codUsuario codigo de usuario '0001'
	 * @param Clave      Contraseña del usuario
	 * @return UsuarioAplicacion por codUsuario y Clave
	 */
	@Override
	public UsuarioAplicacionEntity getUsuarioAplicacionbByUserClave(String codigoUsuario, String clave) {
		// ---------------------------------------------------------------
		// Atributos
		// ----------------------------------------------------------------

		List<DireccionEntity> listaDirecciones = new ArrayList<DireccionEntity>();
		List<TelefonoEntity> listaTelefonos = new ArrayList<TelefonoEntity>();

		DireccionEntity direccion1;
		TelefonoEntity telefono1;
		
		/* CATALOGOS : 
		 * TIPO DOCUMENTO : 01-DNI 02-PASAPORTE
		 * ESTADO : 01-ACTIVO 02-CANCELADO
		 */

		UsuarioAplicacionEntity usuario = null;

		// ---------------------------------------------------------------
		// Metodos / Proceso
		// ----------------------------------------------------------------

		if (codigoUsuario.equals("USR2001")) {

			direccion1 = new DireccionEntity(
					// String pais, String region, String provincia, String distrito,
					"PERU", "Lima", "Lima", "San Miguel",
					// String tipoVia,String nombreVia, Integer numeroVia, String interiorVia,
					// String referencia
					"AV", "Proceres", 234, "207", "Cuadra 16 Av. Fauccett");
			listaDirecciones.add(direccion1);

			// String tipo, String area, Integer numero, String operador
			telefono1 = new TelefonoEntity("Celular", "01", 987877111, "Claro");
			listaTelefonos.add(telefono1);

			usuario = new UsuarioAplicacionEntity(
					// String nombrePrincipal, String nombresSecundarios, String
					// apellidoPaterno,String apellidoMaterno,
					"Luis ", "Alberto", "Flores", "Romero",
					// tipoDocumento, String numeroDocumento,String correoElectronico
					"01", "736365353", "Luis.Flores.Romero@gmail.com", listaDirecciones, listaTelefonos,
					// String codUsuario,String claveUsuario, Date fechaRegistro, String estado
					"USR2001", "p@ssw0rd", new Date(), "01");

			direccion1 = new DireccionEntity(
					// String pais, String region, String provincia, String distrito,
					"PERU", "Lima", "Lima", "San Miguel",
					// String tipoVia,String nombreVia, Integer numeroVia, String interiorVia,
					// String referencia
					"AV", "Proceres", 234, "207", "Cuadra 16 Av. Fauccett");
			listaDirecciones.add(direccion1);

			// String tipo, String area, Integer numero, String operador
			telefono1 = new TelefonoEntity("Celular", "01", 987877111, "Claro");
			listaTelefonos.add(telefono1);
		}

		if (codigoUsuario.equals("USR2002")) {

			direccion1 = new DireccionEntity(
					// String pais, String region, String provincia, String distrito,
					"PERU", "Lima", "Lima", "Pueblo Libre",
					// String tipoVia,String nombreVia, Integer numeroVia, String interiorVia,
					// String referencia
					"AV", "Bolivar", 345, "DPTO 606", "Cerca del Hospital Santa Rosa");
			listaDirecciones.add(direccion1);

			// String tipo, String area, Integer numero, String operador
			telefono1 = new TelefonoEntity("Celular", "01", 987876543, "Telefonica");
			listaTelefonos.add(telefono1);

			usuario = new UsuarioAplicacionEntity(
					// String nombrePrincipal, String nombresSecundarios, String
					// apellidoPaterno,String apellidoMaterno,
					"Juan", "Jose", "Fabian", "Meza",
					// tipoDocumento, String numeroDocumento,String correoElectronico
					"01", "2010092874", "JJFabianMeza@gmail.com", listaDirecciones, listaTelefonos,
					// String codUsuario,String claveUsuario, Date fechaRegistro, String estado
					"USR2002", "p@ssw0rd", new Date(), "01");

		}

		if (codigoUsuario.equals("USR2003")) {

			direccion1 = new DireccionEntity(
					// String pais, String region, String provincia, String distrito,
					"PERU", "Arequipa", "Arequipa", "Camana",
					// String tipoVia,String nombreVia, Integer numeroVia, String interiorVia,
					// String referencia
					"AV", "Lima", 121, "", "Cerca del Coliseo San Agustin");
			listaDirecciones.add(direccion1);

			// String tipo, String area, Integer numero, String operador
			telefono1 = new TelefonoEntity("Celular", "074", 902611201, "Telefonica");
			listaTelefonos.add(telefono1);

			usuario = new UsuarioAplicacionEntity(
					// String nombrePrincipal, String nombresSecundarios, String
					// apellidoPaterno,String apellidoMaterno,
					"Juan", "Jose", "Garcia", "Lopez",
					// tipoDocumento, String numeroDocumento,String correoElectronico
					"01", "017364643", "JJGarciaLopez@gmail.com", listaDirecciones, listaTelefonos,
					// String codUsuario,String claveUsuario, Date fechaRegistro, String estado
					"USR2003", "p@ssw0rd", new Date(), "01");

		}
		
		
		
		
		if (codigoUsuario.equals("USR2005")) {

			direccion1 = new DireccionEntity(
					// String pais, String region, String provincia, String distrito,
					"PERU", "Lima", "Lima", "Pueblo Libre",
					// String tipoVia,String nombreVia, Integer numeroVia, String interiorVia,
					// String referencia
					"AV", "Bolivar", 345, "DPTO 606", "Cerca del Hospital Santa Rosa");
			listaDirecciones.add(direccion1);

			// String tipo, String area, Integer numero, String operador
			telefono1 = new TelefonoEntity("Celular", "01", 909876765, "Telefonica");
			listaTelefonos.add(telefono1);

			usuario = new UsuarioAplicacionEntity(
					// String nombrePrincipal, String nombresSecundarios, String
					// apellidoPaterno,String apellidoMaterno,
					"Irene", "Dalia", "Robles", "Talavera",
					// tipoDocumento, String numeroDocumento,String correoElectronico
					"01", "40367383", "Irene.Robles.1992@gmail.com", listaDirecciones, listaTelefonos,
					// String codUsuario,String claveUsuario, Date fechaRegistro, String estado
					"USR2002", "p@ssw0rd", new Date(), "01");

		}

		return usuario;
	}

	@Override
	public UsuarioAplicacionEntity getUsuarioAplicacionbByCorreoClave(String correoElectronico, String clave) {
		// TODO Auto-generated method stub
		return null;
	}

}
