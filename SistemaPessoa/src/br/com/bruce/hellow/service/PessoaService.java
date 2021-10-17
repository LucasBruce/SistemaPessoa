package br.com.bruce.hellow.service;

import java.util.ArrayList;
import java.util.List;

import br.com.bruce.hellow.model.Pessoa;

public class PessoaService {

	private List<Pessoa> pessoas = new ArrayList<>();

	public PessoaService(List<Pessoa> pessoas) {
		this.pessoas = pessoas;
	}
	
	public Pessoa adicionarPessoa(Pessoa pessoa) {
		pessoas.add(pessoa);
		return pessoa;
	}

	public List<Pessoa> lista() {
		return this.pessoas;
	}

	public List<Pessoa> listaPessoa() {

		List<Pessoa> pessoas = lista();
		for (Pessoa pessoaLista : pessoas) {
			System.out.println("Id:" + pessoaLista.getId());
			System.out.println("Nome:" + pessoaLista.getNome());
			System.out.println("Idade:" + pessoaLista.getIdade());
			System.out.println("Altura:" + pessoaLista.getAltura());
			System.out.println();
		}
		return pessoas;
	}

	public void telaMenu() {
		System.out.println("Digite <1> para adicionar pessoa");
		System.out.println("Digite <2> para listar pessoas");
		System.out.println("Digite <3> para pesquisar pessoa");
		System.out.println("Digite <4> para sair");
	}

	public Pessoa pesquisarPessoa(int id) {
		Pessoa p = new Pessoa(0, null, 0, 0.0);
		List<Pessoa> pessoas = lista();
		for (Pessoa pessoa : pessoas) {
			if (pessoa.getId() == id) {
				p = pessoa;
			}

		}
		return p;

	}
	
	public void limpar() {
		this.pessoas.clear();
	}
	
	public Pessoa exibirPessoa(Pessoa pessoa) {
		System.out.println("Id:"+pessoa.getId());
		System.out.println("Nome:"+pessoa.getNome());
		System.out.println("Idade:"+pessoa.getIdade());
		System.out.println("Altura:"+pessoa.getAltura());
		
		return pessoa;
	}
}
