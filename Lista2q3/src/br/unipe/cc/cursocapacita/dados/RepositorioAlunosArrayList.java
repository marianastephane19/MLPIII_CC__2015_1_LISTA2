package br.unipe.cc.cursocapacita.dados;

import java.util.ArrayList;
import java.util.List;

import br.unipe.cc.cursocapacita.modelo.Aluno;

public class RepositorioAlunosArrayList extends RepositorioAlunosList {

	public RepositorioAlunosArrayList() {
		super(new ArrayList<Aluno>());
	}

}
