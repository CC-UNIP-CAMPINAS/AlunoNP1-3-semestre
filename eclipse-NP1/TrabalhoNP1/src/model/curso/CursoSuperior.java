package model.curso;

public class CursoSuperior extends Curso{
	public CursoSuperior(String aNome) {
		super(aNome);
	}

	private double p1;
	private double p2;
	private double notaReposicao;
	private double notaExame;
	
	public double getNotaReposicao() {
		return notaReposicao;
	}
	public void setNotaReposicao(double notaReposicao) {
		this.notaReposicao = notaReposicao;
	}
	public double getNotaExame() {
		return notaExame;
	}
	public void setNotaExame(double notaExame) {
		this.notaExame = notaExame;
	}
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
		double media = (getNotaP1()+getNotaP2())/2;
			if(getNotaReposicao()>getNotaP1() || getNotaReposicao()>getNotaP2()) {
				if(getNotaP1()>getNotaP2()) {
					media = (getNotaP1()+getNotaReposicao())/2;
					if(media >= 7){
						return media;
					}
					else {
						media = (media+this.getNotaExame())/2;
						return media;
					}
				}
				else {
					media = (getNotaP2()+getNotaReposicao())/2;
					if(media >= 7){
						return media;
					}
					else {
						media = (media+this.getNotaExame())/2;
						return media;
					}
				}
			}
			else {
				if(media >= 7) 
						return media;
					return media = (getNotaExame()+media)/2;
		}
	}
	
	@Override
	public boolean isPassou() {
		if(getMedia() >= 5) {
			return true;
		}
		else {
			return false;
		}
	}
	@Override
	public String toString() {
		System.out.println("Nome curso: "+ this.getNome());
		System.out.println("Nota NP1: "+ this.getNotaP1());
		System.out.println("Nota NP2: "+ this.getNotaP2());
		System.out.println("Nota exame: "+ this.getNotaExame());
		System.out.println("Nota Reposição: "+this.getNotaReposicao());
		System.out.println("Media: "+ this.getMedia());
		System.out.println("Passou: "+ this.isPassou());
		
		return "";
	}
}
