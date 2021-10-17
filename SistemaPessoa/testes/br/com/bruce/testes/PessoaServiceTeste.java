package br.com.bruce.testes;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import br.com.bruce.hellow.model.Pessoa;
import br.com.bruce.hellow.service.PessoaService;

public class PessoaServiceTeste {

	PessoaService pessoaService;
	Pessoa pessoa, pessoa1;
	int id = 1, id1 = 2;
	
	
	//Ponto inicial montagem do cenário de teste
	@Before
	public void setUp() {
				
		//Criando pessoas 
		pessoa = new Pessoa(id ,"lucas", 25, 1.68);
		pessoa1 = new Pessoa(id1 ,"matheus", 26, 1.80);
		
		//Inserindo pessoa na lista de pessoas
		List<Pessoa> pessoas = new ArrayList<>();
		pessoas.add(pessoa);
		pessoas.add(pessoa1);
		pessoaService = new PessoaService(pessoas);
		
	
	}
	
	//Limpando a lista de pessoas removendo tudo logo após teste
	@After
	public void teaDown() {    
	 pessoaService.limpar();
	}
	
	//Teste de pesquisa de pessoas a partir do ID
	@Test
	public void testPesquisarPessoa() {
		    
		   //Execução
			Pessoa pessoa = pessoaService.pesquisarPessoa(1);
			
			//Verificação
			assertThat(pessoa.getId(), is(id));
			assertThat(pessoa.getNome(), is("lucas"));
			assertThat(pessoa.getIdade(), is(25));
			assertThat(pessoa.getAltura(), is(1.68));
			
		
		
	}
	
	//Testando método exibir pessoa passando uma instancia de pessoa
	@Test
	public void testExibirPessoa() {
		//Execução
	Pessoa p = pessoaService.exibirPessoa(pessoa);
		
		//Verificação
		assertThat(p.getId(), is(id));
	}
	
	/*
	 * Testando método adicionar pessoa, passamos uma instacia de pessoa e o metodo
	 * adiciona na nossa lista
	 */
	 @Test
     public void testAdicionarPessoa() {
    	 
		 //Execução
		 Pessoa pessoa = pessoaService.adicionarPessoa(pessoa1);
		 
		 //Verificação
		 assertThat(pessoa.getId(), is(id1));
    	 
     }
	 
	 //Testando o método listar cuja função é retorna a listar de pessoas
	 @Test
	 public void testListar() {
		 
		 //Execução
		 List<Pessoa> pessoas = pessoaService.lista();
		 boolean verificacao = pessoas.contains(pessoa);
		 
		 //Verificação
		 assertThat(verificacao, is(true));
	 }
	 
	 //Testando o método listar pessoas que lista todas as pessoas
	 @Test
	 public void testListarPessoa() {
		 
		 //Execução 
		List<Pessoa> pessoas = pessoaService.listaPessoa();
		boolean verificacao = pessoas.contains(pessoa);
		
		//Verificação
		assertThat(verificacao, is(true));
		
		
	 }

}
