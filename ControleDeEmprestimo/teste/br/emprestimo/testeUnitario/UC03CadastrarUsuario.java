package br.emprestimo.testeUnitario;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Test;

import br.emprestimo.modelo.Usuario;

public class UC03CadastrarUsuario {
	public static Usuario usuario;

	@AfterClass
	public static void setUpBeforeClass() throws Exception {
		usuario = new Usuario();
		usuario.setRa("111111");
		usuario.setNome("José da Silva");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception{
	}
	


	@Test(expected=RuntimeException.class)
	public void  CT03UC06CadastrarUsuario_com_Ra_invalido_branco() {
		usuario.setRa(null);
	}
	
	@Test(expected=RuntimeException.class)
	public void  CT03UC07CadastrarUsuario_com_Ra_invalido_branco() {
		usuario.setRa("");;
	}
	
	@Test(expected=RuntimeException.class)
	public void  CT03UC06CadastrarUsuario_com_Nome_invalido_branco() {
		usuario.setNome(null);
	}
	
	@Test(expected=RuntimeException.class)
	public void  CT03UC08CadastrarUsuario_com_Nome_invalido_branco() {
		usuario.setNome("");
	}
	
	@Test(expected=RuntimeException.class)
	public void  CT03UC09CadastrarUsuario_com_Nome_invalido_branco() {
	  Usuario resultadoEsperado = new Usuario();
			  resultadoEsperado.setRa("111111");
	          assertTrue(resultadoEsperado.equals(usuario));
	}
}
