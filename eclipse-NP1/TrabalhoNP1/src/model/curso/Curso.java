package model.curso;

public abstract class Curso {
	private String nome;
	
	public double P1;
	public double P2;
	
	public Curso(String aNome) {
		this.nome = aNome;
	}
	
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	abstract public boolean isPassou();
	
	abstract public double getMedia();
	
	public double getNotaP1() {
		return P1;
	}
	
	public double getNotaP2() {
		return P2;
	}
	
	@Override
	public String toString() {
		System.out.println("Nome curso: "+ this.nome);
		System.out.println("Nota NP1: "+ this.getNotaP1());
		System.out.println("Nota NP2: "+ this.getNotaP2());
		System.out.println("Media: "+ this.getMedia());
		System.out.println("Passou: "+ this.isPassou()+"\n");
		return "";
	}
	
}
