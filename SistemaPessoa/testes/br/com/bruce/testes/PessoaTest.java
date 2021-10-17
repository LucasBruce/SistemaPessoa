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

public class PessoaTest {

	private Pessoa pessoa;
	private int id = 1;
	private String nome = "lucas";
	private int idade = 25;
	private double altura = 1.68;
	

	//Criando o cenário de teste
	@Before
	public void setUp() {
		//Instanciando pessoa
		pessoa = new Pessoa(0, null, 0, 0.0);
		
	}
	//Testando o método set que atribui o id para nossa variavel id
	@Test
	public void testSetId() {
		
		//Execução
		pessoa.setId(id);
		
		//Verificação
		assertThat(pessoa.getId(), is(id));
		
	}
	//Testando o método set que atribui o nome para nossa variavel nome
		@Test
		public void testSetNome() {
			
			//Execução
			pessoa.setNome(nome);
			
			//Verificação
			assertThat(pessoa.getNome(), is(nome));
			
		}
		//Testando o método set que atribui a idade para nossa variavel idade
		@Test
		public void testSetIdade() {
			
			//Execução
			pessoa.setIdade(idade);
			
			//Verificação
			assertThat(pessoa.getIdade(), is(idade));
			
		}
		//Testando o método set que atribui a altura para nossa variavel altura
		@Test
		public void testSetAltura() {
			
			//Execução
			pessoa.setAltura(altura);
			
			//Verificação
			assertThat(pessoa.getAltura(), is(altura));
			
		}
}
