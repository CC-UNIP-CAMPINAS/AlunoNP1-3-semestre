package model;

public class Aluno {
	private String id;
	private String nome;
	
	public Aluno(String aId, String aNome) {
		this.id = aId;
		this.nome = aNome;
	}

	public String getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	public String toString() {
		System.out.println("Nome: "+ this.getNome());
		System.out.println("Id: "+ this.getId());
		return "";
	}
}
