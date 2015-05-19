package br.unipe.cc.cursocapacita.dados;

import java.util.ArrayList;
import java.util.Map;

import br.unipe.cc.cursocapacita.modelo.Aluno;

public interface IRepositorioAlunos {
              boolean incluir(Aluno aluno);
              boolean remover(int matriculaAluno);
              boolean remover(String nomeAluno);
              boolean contem(Aluno aluno);
              Aluno pesquisa(int matricula);
              Aluno pesquisa(String nome);
              Map<String, ArrayList<Aluno>>  consultaSituacao();
              void ordenadar();
              Aluno[] relacaoDeAlunos();
}


