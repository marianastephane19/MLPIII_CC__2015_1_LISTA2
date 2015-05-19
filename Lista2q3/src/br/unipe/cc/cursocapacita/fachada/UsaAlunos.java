package br.unipe.cc.cursocapacita.fachada;

import java.util.ArrayList;
import java.util.Map;

import br.unipe.cc.cursocapacita.dados.IRepositorioAlunos;
import br.unipe.cc.cursocapacita.dados.RepositorioAlunosArrayList;
import br.unipe.cc.cursocapacita.dados.RepositorioAlunosList;
import br.unipe.cc.cursocapacita.modelo.Aluno;

public class UsaAlunos {
	IRepositorioAlunos repositorioAlunos;

	public UsaAlunos() {
		repositorioAlunos = new RepositorioAlunosArrayList();
	}
	
	public boolean incluirAluno(Aluno aluno){
		return repositorioAlunos.incluir(aluno);
	}
	public boolean removerAluno(int matriculaAluno){
		return repositorioAlunos.remover(matriculaAluno);
	}
	public boolean removerAluno(String nomeAluno){
		return repositorioAlunos.remover(nomeAluno);
	}
	public boolean verificaAluno(int matriculaAluno){
		 return repositorioAlunos.contem(repositorioAlunos.pesquisa(matriculaAluno));
	}
	public ArrayList<Aluno> alunosReprovados(){
		return repositorioAlunos.consultaSituacao().get("reprovados"); 		 		
	}
	public ArrayList<Aluno> alunosAprovados(){
        return repositorioAlunos.consultaSituacao().get("aprovados"); 		
	}
	public ArrayList<Aluno> alunosReprovadosPorFalta(){
        return repositorioAlunos.consultaSituacao().get("faltas"); 		
	}
	public Aluno[] relacaoOrdenadaDeAlunos(){
		repositorioAlunos.ordenadar();
		return repositorioAlunos.relacaoDeAlunos();
		
	}
	
}
