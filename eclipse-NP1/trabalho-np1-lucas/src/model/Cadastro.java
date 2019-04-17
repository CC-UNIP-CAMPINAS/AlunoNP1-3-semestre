package model;

import model.curso.Curso;

public class Cadastro {
	
	private Aluno aluno;
	private Historico historico;
	
	public Cadastro(String aId, String aNome) {
		aluno = new Aluno(aId, aNome);
		historico = new Historico();
	}
	
	public Aluno getAluno() {
		return aluno;
	}
	
	public Historico getHistorico() {
		return historico;
		
	}
	
	public void add(Curso curso) {
		this.historico.cursos.add(curso);
	}
	
	@Override
	public String toString() {
		this.aluno.toString();
		this.historico.toString();
		System.out.print("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");//Adicionei para diferenciar cada teste
		return "";
	}
}
