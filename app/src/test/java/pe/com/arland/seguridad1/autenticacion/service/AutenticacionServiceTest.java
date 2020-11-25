package pe.com.arland.seguridad1.autenticacion.service;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import pe.com.arland.cliente1.registro.entity.ClienteEntity;
import pe.com.arland.cliente1.registro.entity.UsuarioAplicacionEntity;
import pe.com.arland.seguridad1.autenticacion.repository.mongodb.ClientesRepositoryImpl;
import pe.com.arland.seguridad1.autenticacion.repository.mongodb.UsuariosAplicacionRepositoryImpl;
import pe.com.arland.seguridad1.autenticacion.service.impl.AutenticacionServiceImpl;

@DisplayName("SERVICIO DE AUTENTICACION")
class AutenticacionServiceTest {

	private static AutenticacionServiceImpl autenticacionService;
	private static String tipoDoc1, tipoDoc2;
	private static String numDoc1, numDoc2;
	
	@DisplayName("CONFIGURACION ENTORNO")
    @BeforeAll
    static void setupAll() {
    	System.out.println("*********************************************************");
    	System.out.println("*****************ETAPA BEFORE ALL************************");
    	System.out.println("Configuración inicial para iniciar los test...");
    	System.out.println("*********************************************************");
    	System.out.println();
    	autenticacionService = new AutenticacionServiceImpl();
    	autenticacionService.setClienteDAO(new ClientesRepositoryImpl());
    	autenticacionService.setUsuarioDAO(new UsuariosAplicacionRepositoryImpl());
    	//Existe
    	tipoDoc1 = "01";
    	numDoc1 = "2010092874";
    	
    	//No existe
    	tipoDoc2 = "DNI";
    	numDoc2 = "2010092874";
    }
	
	@Tag("General")
	@DisplayName("VALIDACION GENERAL")
	@Test
	void recuperarClienteExisteTest() {
		assertNotNull(tipoDoc1, "Tipo de doc es nulo");
		assertNotNull(numDoc1, "Numero de doc es nulo");
		if(tipoDoc1.isEmpty() || numDoc1.isEmpty()) {
			fail("Tipo de documento o numero de documento no validos");
		}
		
    	UsuarioAplicacionEntity usuarioAplicacionEntity = autenticacionService.validarUsuarioAplicacionporCodUsuario("USR2002", "pwdUSR2002");
		assertNotNull(usuarioAplicacionEntity,"Usuario existente: "+usuarioAplicacionEntity.getNombrePrincipal());
		
		
		ClienteEntity clienteEntity = autenticacionService.recuperarCliente(
				usuarioAplicacionEntity.getTipoDocumento(), 
				usuarioAplicacionEntity.getNumeroDocumento());
		assertNotNull(clienteEntity);
		System.out.println("Cliente existente: "+clienteEntity.getNombrePrincipal());
		
		//Ejemplo ASSERT ALL comprobar que se registraron efectivamente iguales
		assertAll("Nombre del grupo : Verificar Explicitamente a un valor",
				() -> assertEquals(clienteEntity.getNombrePrincipal(), usuarioAplicacionEntity.getNombrePrincipal()),
				() -> assertEquals(clienteEntity.getApellidoPaterno(), usuarioAplicacionEntity.getApellidoPaterno()),
				() -> assertEquals(clienteEntity.getApellidoMaterno(), usuarioAplicacionEntity.getApellidoMaterno()),
				() -> assertEquals(clienteEntity.getTipoDocumento(), usuarioAplicacionEntity.getTipoDocumento()),
				() -> assertEquals(clienteEntity.getNumeroDocumento(), usuarioAplicacionEntity.getNumeroDocumento()));
	}
    
    @DisplayName("RECUPERAR CLIENTE - NO EXISTE")
	@Test
	void recuperarClienteNoExisteTest() {
		assertNotNull(tipoDoc2, "Tipo de doc es nulo");
		assertNotNull(numDoc2, "Numero de doc es nulo");
		if(tipoDoc2.isEmpty() || numDoc2.isEmpty()) {
			fail("Tipo de documento o numero de documento no validos");
		}
		ClienteEntity cliente = autenticacionService.recuperarCliente(tipoDoc2, numDoc2);
		assertNull(cliente);
		System.out.println("Cliente no existe");
	}
    
    @DisplayName("VALIDAR USUARIO POR COD USUARIO - EXISTE")
	@Test
	void validarUsuarioAplicacionExiste() {
    	UsuarioAplicacionEntity usuario = autenticacionService.validarUsuarioAplicacionporCodUsuario("USR2001", "clave");
		assertNotNull(usuario,"Usuario existente: "+usuario.getNombrePrincipal());
		System.out.println("Usuario existente: "+usuario.getNombrePrincipal());
	}
    
    @Tag("Individual")
    @DisplayName("VALIDAR USUARIO POR COD USUARIO - NO EXISTE")
	@Test
	void validarUsuarioAplicacionNoExiste() {
    	UsuarioAplicacionEntity usuario = autenticacionService.validarUsuarioAplicacionporCodUsuario("ABC1234", "clave");
		assertNull(usuario, "Usuario no existe");
		System.out.println("Usuario no existe");
	}

}
