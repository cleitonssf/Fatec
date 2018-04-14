package br.emprestimo.testeUnitario;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import br.emprestimo.modelo.Livro;

public class UC06CadastrarLivro {
    public static Livro livro;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		livro = ObtemLivro.comDadosValidos();
		//livro = new Livro();
		//livro.setIsbn("121212");
		//livro.setTitulo("Engenharia de Software");
		//livro.setAutor("Pressman");
	}    

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		
	}

	@Test(expected=RuntimeException.class)
	public void  CT01UC06CadastrarLivro_com_isbn_invalido_branco() {
		livro.setIsbn("");
		//fail("Not yet implemented");
	}

	@Test
	public void CT04UC01CadastrarLivro_com_isbn_invalido(){
		try{
			livro.setIsbn("");
					fail ("deveria lançar uma exceção");
		} catch(RuntimeException e){
			assertEquals("ISBN inválido", e.getMessage());
		}
	}
	
	@Test
	public void CT05UC01CadastrarLivro_com_titulo_invalido(){
		try{
			livro.setTitulo("");
					fail ("deveria lançar uma exceção");
		} catch(RuntimeException e){
			assertEquals("Título inválido", e.getMessage());
		}
	}
	
	@Test
	public void CT04UC01CadastrarLivro_com_autor_invalido(){
		try{
			livro.setAutor("");
					fail ("deveria lançar uma exceção");
		} catch(RuntimeException e){
			assertEquals("Autor inválido", e.getMessage());
		}
	}
	
	@Test(expected=RuntimeException.class)
	public void  CT02UC06CadastrarLivro_com_titulo_invalido_branco() {
		livro.setTitulo(null);
	}
	
	@Test(expected=RuntimeException.class)
	public void  CT03UC06CadastrarLivro_com_isbn_invalido_branco() {
		livro.setIsbn(null);
	}
	
	@Test(expected=RuntimeException.class)
	public void  CT02UC06CadastrarLivro_com_autor_invalido_branco() {
		livro.setAutor(null);
	}
	
	@Test(expected=RuntimeException.class)
	public void  CT01UC06CadastrarLivro_com_titulo_invalido_branco() {
		livro.setTitulo("");
		//fail("Not yet implemented");
	}
	
	@Test(expected=RuntimeException.class)
	public void  CT01UC06CadastrarLivro_com_autor_invalido_branco() {
		livro.setAutor("");
		//fail("Not yet implemented");
	}
				
		@Test
		public void CT03UC06CadastrarLivro_com_isbn_valido(){
			assertEquals("121212", livro.getIsbn());
			//livro.setIsbn("111111");
		}
		
		@Test
		public void CT03UC06CadastrarLivro_com_autor_valido(){
			assertEquals("Pressman", livro.getAutor());
			//livro.setIsbn("111111");
		}
	
		@Test
		public void CT03UC06CadastrarLivro_com_titulo_valido(){
			assertEquals("Engenharia de Software", livro.getTitulo());
			//livro.setIsbn("111111");
		}
		
	
		
		
		//fail("Not yet implemented");
	}

