package model.curso;

public class CursoDePos extends Curso {
	
	public CursoDePos(String aNome) {
		super(aNome);
	}

	private double p1;
	private double p2;
	private double notaReposicao;
	private double notaExame;
	
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
	
	@Override
	public double getMedia() {
		double media = (getNotaP1()+getNotaP2())/2;
		if(getNotaReposicao()>getNotaP1() || getNotaReposicao()>getNotaP2()) {
			if(getNotaP1()>getNotaP2()) {
				media = (getNotaP1()+getNotaReposicao())/2;
				if(media >= 5){
					return media;
				}
				else {
					media = (media+this.getNotaExame())/2;
					if(media>=5) {
						return 5;
					}
					else {
						return media;
					}
				}
			}
			else {
				media = (getNotaP2()+getNotaReposicao())/2;
				if(media >= 5){
					return media;
				}
				else {
					media = (media+this.getNotaExame())/2;
					if(media>=5) {
						return 5;
					}
					else {
						return media;
					}
				}
			}
		}
		else {
			if(media >= 5) {
				return media;
			}
			else {
				media = (media+getNotaExame())/2;
				if(media>=5) {
					return media;
				}
				else {
					return media;
				}
			}
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
		System.out.println("Nome curso: : " + this.getNome());
		System.out.println("NotaP1: " + this.getNotaP1());
		System.out.println("NotaP2: " + this.getNotaP2());
		System.out.println("Media: " + this.getMedia());
		System.out.println("Aprovado: " + this.isPassou());
		System.out.println("Nota reposição: " + this.getNotaReposicao());
		System.out.println("Nota exame: " + this.notaExame);
		return "";
	}
}
