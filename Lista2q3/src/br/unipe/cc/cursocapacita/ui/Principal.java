package br.unipe.cc.cursocapacita.ui;

import br.unipe.cc.cursocapacita.fachada.CursoCapacitacao;
import br.unipe.cc.cursocapacita.fachada.UsaAlunos;
import br.unipe.cc.cursocapacita.modelo.Professor;

public class Principal {
	private CursoCapacitacao curso;

	public static void main(String[] args) {
		Principal p = new Principal();

		p.curso = new CursoCapacitacao(001, "Computaçao", new Professor(
				"Matheus", 122115, "Programador"), new UsaAlunos());

		
		
		
		
	}
}
