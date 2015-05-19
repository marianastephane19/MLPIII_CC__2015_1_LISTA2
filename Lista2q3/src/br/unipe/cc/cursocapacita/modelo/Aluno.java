package br.unipe.cc.cursocapacita.modelo;

public class Aluno implements Comparable<Aluno> {
	private String nomeAluno;
	private int matriculaAluno;
	private double media;
	private int numeroDeFaltas;

	public Aluno(String nomeAluno, int matriculaAluno, double media,
			int numeroDeFaltas) {
		super();
		this.nomeAluno = nomeAluno;
		this.matriculaAluno = matriculaAluno;
		this.media = media;
		this.numeroDeFaltas = numeroDeFaltas;
	}

	public int getMatriculaAluno() {
		return matriculaAluno;
	}

	public void setMatriculaAluno(int matriculaAluno) {
		this.matriculaAluno = matriculaAluno;
	}

	public String getNomeAluno() {
		return nomeAluno;
	}

	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}

	public double getMedia() {
		return media;
	}

	public void setMedia(double media) {
		this.media = media;
	}

	public boolean aprovado() {
		return media >= 7.00;
	}

	public boolean reprovado() {
		return media < 7.00;
	}

	public boolean reprovadoPorFalta() {
		return numeroDeFaltas > 15;
	}

	public int getNumeroDeFaltas() {
		return numeroDeFaltas;
	}

	public void setNumeroDeFaltas(int numeroDeFaltas) {
		this.numeroDeFaltas = numeroDeFaltas;
	}

	@Override
	public int compareTo(Aluno aluno) {
		if (this.getMatriculaAluno() > aluno.getMatriculaAluno())
			return 1;
		if (this.getMatriculaAluno() < aluno.getMatriculaAluno())
			return -1;
		return 0;
	}
@Override
public String toString() {
	// TODO Auto-generated method stub
	return this.matriculaAluno+" "+this.nomeAluno;
}
}
