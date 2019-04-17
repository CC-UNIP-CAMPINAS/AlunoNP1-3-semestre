package teste;

import model.*;
import model.curso.*;

public class TesteAluno {

	public static void main(String[] args) {

		// Teste01
		Cadastro cadastro = new Cadastro("123", "Ada Lovelace");
		System.out.println(cadastro);
		System.out.println();

		// Teste02
		CursoDeVerao cursoDeVerao01 = new CursoDeVerao("Algebra Linear");
		cadastro.add(cursoDeVerao01);
		cursoDeVerao01.setNotaP1(8.0);
		cursoDeVerao01.setNotaP2(9.0);
		System.out.println(cadastro);
		System.out.println();
		/*
		// Teste03
		CursoDeVerao cursoDeVerao02 = new CursoDeVerao("Analise");
		cadastro.add(cursoDeVerao02);
		cursoDeVerao02.setNotaP1(24.0);
		cursoDeVerao02.setNotaP2(-2.0);
		System.out.println(cadastro);
		System.out.println();

		// Teste04
		CursoDeVerao cursoDeVerao03 = new CursoDeVerao("Estatistica");
		cadastro.add(cursoDeVerao03);
		cursoDeVerao03.setNotaP1(2.0);
		cursoDeVerao03.setNotaP2(3.0);
		System.out.println(cadastro);
		System.out.println();
*/
		// Teste05
		CursoSuperior cursoSuperior01 = new CursoSuperior("Java");
		cadastro.add(cursoSuperior01);
		cursoSuperior01.setNotaP1(8.0);
		cursoSuperior01.setNotaP2(7.0);
		System.out.println(cadastro);
		System.out.println();
/*
		// Teste06
		CursoSuperior cursoSuperior02 = new CursoSuperior("C++");
		cadastro.add(cursoSuperior02);
		cursoSuperior02.setNotaP1(7.0);
		cursoSuperior02.setNotaP2(5.0);
		cursoSuperior02.setNotaReposicao(2.0);
		cursoSuperior02.setNotaExame(8.5);
		System.out.println(cadastro);
		System.out.println();

		// Teste07
		CursoDePos cursoDePos01 = new CursoDePos("I.A.");
		cadastro.add(cursoDePos01);
		cursoDePos01.setNotaP1(7.0);
		cursoDePos01.setNotaP2(4.0);
		System.out.println(cadastro);
		System.out.println();
		*/
		// Teste08
		CursoDePos cursoDePos02 = new CursoDePos("Redes");
		cadastro.add(cursoDePos02);
		cursoDePos02.setNotaP1(3.0);
		cursoDePos02.setNotaP2(6.0);
		cursoDePos02.setNotaReposicao(1.0);
		cursoDePos02.setNotaExame(9.0);
		System.out.println(cadastro);
		System.out.println();
/*
		// Teste09
		System.out.println("Cursos feito pelo Aluno " + cadastro.getAluno().getNome());
		for(Curso curso : cadastro.getHistorico()) {
			System.out.println(curso.getNome());
		}
		System.out.println();

		// Teste10
		System.out.println("Cursos em que foi aprovado o Aluno " + cadastro.getAluno().getNome());
		for(Curso curso : cadastro.getHistorico()) {
			if(curso.isAprovado()) {
				System.out.println(curso.getNome());
			}
		}
		System.out.println();
*/
	}

}
