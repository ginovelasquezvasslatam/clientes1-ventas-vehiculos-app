package pe.com.arland.seguridad1.autenticacion.repository.mongodb;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import pe.com.arland.cliente1.registro.entity.ClienteEntity;
import pe.com.arland.cliente1.registro.entity.DireccionEntity;
import pe.com.arland.cliente1.registro.entity.TelefonoEntity;
import pe.com.arland.cliente1.registro.entity.UsuarioAplicacionEntity;
import pe.com.arland.seguridad1.autenticacion.repository.ClientesRepository;

public class ClientesRepositoryImpl implements ClientesRepository {

	@Override
	public ClienteEntity getClienteByPersonId(String tipoDocumento, String numeroDocumento) {

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
		
		ClienteEntity cliente ;
		
		if (tipoDocumento.equals("01") && numeroDocumento.equals("2010092874")) {

			direccion1 = new DireccionEntity(
					// String pais, String region, String provincia, String distrito,
					"PERU", "Lima", "Lima", "Pueblo Libre",
					// String tipoVia,String nombreVia, Integer numeroVia, String interiorVia,
					// String referencia
					"AV", "Bolivar", 123, "", "Cerca del Hospital Santa Rosa");
			listaDirecciones.add(direccion1);

			// String tipo, String area, Integer numero, String operador
			telefono1 = new TelefonoEntity("Celular", "01", 987876543, "Telefonica");
			listaTelefonos.add(telefono1);
			
			cliente = new ClienteEntity(
					// String nombrePrincipal, String nombresSecundarios, String apellidoPaterno,String apellidoMaterno,
					"Juan", "Jose", "Fabian", "Meza",
					// tipoDocumento, String numeroDocumento,String correoElectronico ,List<DireccionEntity> direcciones, List<TelefonoEntity> telefonos
					"01", "2010092874", "JJFabianMeza@gmail.com", listaDirecciones, listaTelefonos,	
					//String idCliente, String tipoCliente, Date fechaRegistro
					"CLI00271","VIP",new Date()
					);
			
			return cliente;
		}
		
		
		return null;
	}

}
