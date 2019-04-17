package model.curso;

public class CursoDePos extends Curso{
	
	private double notaP1 = 0.0;
	private double notaP2 = 0.0;
	private double notaReposicao = 0.0;
	private double notaExame = 0.0;
	
	public CursoDePos(String aNome) {
		super(aNome);
		// TODO Auto-generated constructor stub
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
	
	public void setNotaReposicao(double nota) {
		if(nota>=10) {
			this.notaReposicao = 10;
		}else {
			if(nota<=0) 
				this.notaReposicao = 0;
			else
				this.notaReposicao = nota;
		}
	}
	
	public void setNotaExame(double nota) {
		if(nota>=10) {
			this.notaExame = 10;
		}else {
			if(nota<=0) 
				this.notaExame = 0;
			else
				this.notaExame = nota;
		}
	}
	
	public double getNotaP1() {
		return this.notaP1;
	}
	
	public double getNotaP2() {
		return this.notaP2;
	}
	
	public double getNotaReposicao() {
		return this.notaReposicao;
	}
	
	public double getNotaExame() {
		return this.notaExame;
	}
	/*
	@Override
	public double getMedia() {
		if(this.getNotaP1() > this.getNotaReposicao() && this.getNotaP2() > this.getNotaReposicao()) {
			double mediaCalculada = (this.getNotaP1() + this.getNotaP2()) / 2.0;
			if(mediaCalculada >= 5.0)
				return mediaCalculada;
			else {
				mediaCalculada = (mediaCalculada + this.notaExame) / 2.0;//o calculo da media tava sendo feito errado
				if(mediaCalculada>=5) {
					return 5;
				}
				else {
					return mediaCalculada;
				}
			}
		}else {
			if(this.getNotaP1() <= this.getNotaReposicao()) {
				
				double mediaCalculada = (this.getNotaReposicao() + this.getNotaP2()) / 2.0;
				
				if(mediaCalculada >= 5.0)
						return mediaCalculada;
				else {
					if ((mediaCalculada + this.notaExame) / 2.0 >= 5.0)//o calculo da media tava sendo feito errado
						return 5.0;
					return (mediaCalculada + this.notaExame) / 2.0;//o calculo da media tava sendo feito errado
				}
			}
			else {
				double mediaCalculada = (this.getNotaReposicao() + this.getNotaP1()) / 2.0;
				
				if(mediaCalculada >= 5.0) {
					return mediaCalculada;
				}
				else {
					if((mediaCalculada +this.notaExame)/2 >= 5.0)
						return 5.0;
					return (mediaCalculada + this.notaExame) / 2.0;//o calculo da media tava sendo feito errado
				}	
			}
		}
	}
	*/
	@Override
	public double getMedia() {
		double media = (getNotaP1()+getNotaP2())/2;
		if(getNotaReposicao()>=getNotaP1() || getNotaReposicao()>=getNotaP2()) {
			if(getNotaP1()>=getNotaP2()) {
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
					return 5;
				}
				else {
					return media;
				}
			}
		}
	}
	
	@Override
	public boolean isAprovado() {
		if(this.getMedia() >= 5.0)
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
		System.out.println("Nota reposição: " + this.getNotaReposicao());
		System.out.println("Nota exame: " + this.notaExame);
		return ""; 
	}
}
