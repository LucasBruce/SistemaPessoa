package br.com.bruce.hellow.model;

public class Pessoa {

	private int id;
	private String nome;
	private Integer idade;
	private Double altura;

	public Pessoa(int id, String nome, Integer idade, Double altura) {
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

}
