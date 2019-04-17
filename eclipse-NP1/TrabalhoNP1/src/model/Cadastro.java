package model;

import model.curso.Curso;

public class Cadastro {
	private Aluno aluno;
	private Historico historico;
	
	public Cadastro(String id, String nome) {
		this.aluno = new Aluno(id, nome);
		this.historico = new Historico();
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
		System.out.println("Id: "+ this.aluno.getId());
		System.out.println("Nome: "+ this.aluno.getNome());
		
		return this.historico.toString();
	}

}
