package br.com.bruce.hellow;

import java.util.ArrayList;
import java.util.Scanner;

import br.com.bruce.hellow.model.Pessoa;
import br.com.bruce.hellow.service.PessoaService;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int cont = 0;
		PessoaService pessoaService = new PessoaService(new ArrayList<>());

		do {
			pessoaService.telaMenu();
			cont = scan.nextInt();

			if (cont != 4) {
				if (cont == 1) {
					Pessoa pessoa = new Pessoa(0, null, 0, 0.0);

					System.out.println("Digite o id:");
					Integer id = scan.nextInt();
					pessoa.setId(id);
					System.out.println("Digite o nome:");
					String nome = scan.next();
					pessoa.setNome(nome);
					System.out.println("Digite a idade:");
					int idade = scan.nextInt();
					pessoa.setIdade(idade);
					System.out.println("Digite a altura:");
					double altura = scan.nextDouble();
					pessoa.setAltura(altura);

					pessoaService.adicionarPessoa(pessoa);
				} else if (cont == 2) {
					pessoaService.listaPessoa();

				} else if (cont == 3) {
					System.out.println("Digite o id para pesquisar:");
					Integer id = scan.nextInt();
					Pessoa pes = pessoaService.pesquisarPessoa(id);
					System.out.println();
					pessoaService.exibirPessoa(pes);
				}
			}
		} while (cont != 4);
	}
}
