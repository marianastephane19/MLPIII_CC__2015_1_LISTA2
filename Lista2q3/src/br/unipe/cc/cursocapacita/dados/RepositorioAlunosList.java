package br.unipe.cc.cursocapacita.dados;

import java.util.ArrayList;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import br.unipe.cc.cursocapacita.modelo.Aluno;

public class RepositorioAlunosList implements IRepositorioAlunos {
	private List<Aluno> alunos;

	public RepositorioAlunosList(List<Aluno> alunos) {
		this.alunos = alunos;
	}

	@Override
	public boolean incluir(Aluno a) {
		if (a != null)
			return alunos.add(a);
		return false;
	}

	@Override
	public boolean remover(int matricula) {
		Aluno aluno = pesquisa(matricula);
		if (aluno != null)
			return alunos.remove(aluno);
		return false;
	}

	@Override
	public boolean remover(String nome) {
		Aluno aluno = pesquisa(nome);
		if (aluno != null)
			return alunos.remove(aluno);
		return false;
	}

	@Override
	public boolean contem(Aluno a) {
		if (a != null)
			return alunos.contains(a);
		return false;
	}

	@Override
	public Aluno pesquisa(int matricula) {
		for (Aluno aluno : alunos) {
			if (aluno.getMatriculaAluno() == matricula)
				return aluno;
		}
		return null;
	}

	@Override
	public Aluno pesquisa(String nome) {
		for (Aluno aluno : alunos) {
			if (aluno.getNomeAluno().equals(nome))
				return aluno;
		}
		return null;

	}

	@Override
	public Map<String, ArrayList<Aluno>> consultaSituacao() {
		Map<String, ArrayList<Aluno>> mapasSituacao = new HashMap<>();

		ArrayList<Aluno> aprovados = new ArrayList<>();
		ArrayList<Aluno> reprovados = new ArrayList<>();
		ArrayList<Aluno> reprovadosporfalta = new ArrayList<>();

		for (Aluno aluno : alunos) {
			if (aluno.aprovado())
				aprovados.add(aluno);
			if (aluno.reprovado())
				reprovados.add(aluno);
			if (aluno.reprovadoPorFalta())
				reprovadosporfalta.add(aluno);
		}

		mapasSituacao.put("aprovados", aprovados);
		mapasSituacao.put("reprovados", reprovados);
		mapasSituacao.put("faltas", reprovadosporfalta);

		return mapasSituacao;
	}

	@Override
	public void ordenadar() {
		Collections.sort(alunos);
	}

	@Override
	public Aluno[] relacaoDeAlunos() {

		return (Aluno[]) alunos.toArray();
	}

}
