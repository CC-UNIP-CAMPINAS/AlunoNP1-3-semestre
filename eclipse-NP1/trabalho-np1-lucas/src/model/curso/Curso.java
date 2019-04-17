package model.curso;

public abstract class Curso {
	
	private String nome;
	
	public double notaP1;
	public double notaP2;
	
	public Curso(String aNome) {
		this.nome = aNome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public abstract boolean isAprovado();
	
	public abstract double getMedia();
	
	public double getNotaP1() {
		return notaP1;
	}
	
	public double getNotaP2() {
		return notaP2;
	}
	
	
	@Override
	public String toString() {
		System.out.println("Nome curso: " + this.getNome());
		System.out.println("NotaP1: " + this.getNotaP1());
		System.out.println("NotaP2: " + this.getNotaP2());
		System.out.println("Media: " + this.getMedia());
		System.out.print("Aprovado: " + this.isAprovado());//Alterei Para print comum para não pular linha
		return ""; 
	}
}
