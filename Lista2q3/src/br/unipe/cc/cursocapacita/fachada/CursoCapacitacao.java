package br.unipe.cc.cursocapacita.fachada;

import br.unipe.cc.cursocapacita.modelo.Aluno;
import br.unipe.cc.cursocapacita.modelo.Professor;

public class CursoCapacitacao {

	int numeroCurso;
	String descricaoCurso;
	Professor professorCurso;
	UsaAlunos alunos;

	public CursoCapacitacao(int numeroCurso, String descricaoCurso,
			Professor professorCurso, UsaAlunos alunos) {
		this.numeroCurso = numeroCurso;
		this.descricaoCurso = descricaoCurso;
		this.professorCurso = professorCurso;
		this.alunos = alunos;
	}

	public boolean incluirAluno(Aluno aluno) {
		return alunos.incluirAluno(aluno);
	}

	public boolean removeraluno(Aluno aluno) {
		return alunos.removerAluno(aluno.getMatriculaAluno());
	}

	public boolean alunoEstaMatriculado(int matriculaAluno) {
		return alunos.verificaAluno(matriculaAluno);
	}

	public Aluno[] relacaoAlunosAprovados() {
		return (Aluno[]) alunos.alunosAprovados().toArray();
	}

	public Aluno[] relacaoAlunosReprovados() {
		return (Aluno[]) alunos.alunosReprovados().toArray();
	}

	public Aluno[] relacaoAlunosReprovadosPorfaltas() {
		return (Aluno[]) alunos.alunosReprovadosPorFalta().toArray();
	}

	public Aluno[] relacaoOrdenadaDeAluno() {
		return alunos.relacaoOrdenadaDeAlunos();
	}
}
