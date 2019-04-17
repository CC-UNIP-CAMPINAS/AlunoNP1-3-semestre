package model;

import java.util.ArrayList;
import java.util.Iterator;

import model.curso.Curso;
import model.curso.CursoDePos;
import model.curso.CursoDeVerao;
import model.curso.CursoSuperior;

public class Historico implements Iterable<Curso> {
	
	ArrayList<Curso> cursos = new ArrayList<Curso>();
	
	public void add(Curso curso) {
		cursos.add(curso);
	}
	
	@Override
	public Iterator<Curso> iterator() {
		// TODO Auto-generated method stub
		return  cursos.iterator();
	}
	
	@Override
	public String toString() {
		
		for(Curso curso : cursos) {
			if(curso instanceof CursoDeVerao) {
				System.out.println(curso);
				/*System.out.println("Nome curso: " + curso.getNome());
				System.out.println("NotaP1: " + curso.getNotaP1());
				System.out.println("NotaP2: " + curso.getNotaP2());
				System.out.println("Media: " + curso.getMedia());
				System.out.println("Aprovado: " + curso.isAprovado());*/
			}
			
			if(curso instanceof CursoSuperior) {
				System.out.println(((CursoSuperior) curso).toString());
				//System.out.println("Nota reposição: " + ((CursoSuperior) curso).getNotaReposicao());
				//System.out.println("Nota exame: " + ((CursoSuperior) curso).getNotaExame());
			}
			if(curso instanceof CursoDePos) {
				System.out.println(((CursoDePos) curso).toString());
				//System.out.println("Nota reposição: " + ((CursoDePos) curso).getNotaReposicao());
				//System.out.println("Nota exame: " + ((CursoDePos) curso).getNotaExame());
			}
			System.out.print("");//Mudei para print para não pular linha
		}
		return ""; 
	}

}
