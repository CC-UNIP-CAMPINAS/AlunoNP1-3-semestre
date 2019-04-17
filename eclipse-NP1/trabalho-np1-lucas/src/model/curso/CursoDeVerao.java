package model.curso;

public class CursoDeVerao extends Curso {

	private double notaP1 = 0.0;
	private double notaP2 = 0.0;
	
	public CursoDeVerao(String aNome) {
		super(aNome);
	}
	
	public void setNotaP1(double nota) {
		if(nota>=10) {
			this.notaP1 = 10;
		}else {
			if(nota<=0) 
				this.notaP1 = 0;
			else
				this.notaP1 = nota;
		}
	}
	
	public void setNotaP2(double nota) {
		if(nota>=10) {
			this.notaP2 = 10;
		}else {
			if(nota<=0) 
				this.notaP2 = 0;
			else
				this.notaP2 = nota;
		}
	}
	
	public double getNotaP1() {
		return this.notaP1;
	}
	
	public double getNotaP2() {
		return this.notaP2;
	}
	
	@Override
	public double getMedia() {
		return (this.notaP1 + this.notaP2) / 2.0;
	}
	
	@Override
	public boolean isAprovado() {
		if(this.getMedia() >= 7)
			return true;
		return false;
	}
	
	@Override
	public String toString() {
		System.out.println(super.toString());
		/*System.out.println("Nome curso: : " + this.getNome());
		System.out.println("NotaP1: " + this.getNotaP1());
		System.out.println("NotaP2: " + this.getNotaP2());
		System.out.println("Media: " + this.getMedia());
		System.out.println("Aprovado: " + this.isAprovado());*/
		return ""; 
	}
}
