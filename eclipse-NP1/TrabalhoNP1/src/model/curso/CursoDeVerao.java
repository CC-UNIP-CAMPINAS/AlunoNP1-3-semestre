package model.curso;

public class CursoDeVerao extends Curso {

	public CursoDeVerao(String aNome) {
		super(aNome);
	}

	private double p1;
	private double p2;
	
	public double getNotaP1() {
		return p1;
	}
	public void setNotaP1(double p1) {
		this.p1 = p1;
	}
	public double getNotaP2() {
		return p2;
	}
	public void setNotaP2(double p2) {
		this.p2 = p2;
	}
	
	@Override
	public double getMedia() {
		return (getNotaP1()+getNotaP2())/2;
	}
	
	@Override
	public boolean isPassou() {
		if (getMedia()>=7) {
			return true;
		}
		else {
			return false;
		}
	}
	
	@Override
	public String toString() {
		System.out.println("Nome do curso: "+this.getNome());
		System.out.println("Nota NP1: "+ this.getNotaP1());
		System.out.println("Nota NP2: "+ this.getNotaP2());
		System.out.println("Media: "+ this.getMedia());
		System.out.println("Passou: "+ this.isPassou());
		
		return "";
	}
}
