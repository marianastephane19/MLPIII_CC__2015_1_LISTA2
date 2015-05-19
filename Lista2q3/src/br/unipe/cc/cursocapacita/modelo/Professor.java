package br.unipe.cc.cursocapacita.modelo;

public class Professor {
	private String nomeProfessor;
	private int matriculaProfessor;
	private String especialidadeProfessor;
	public Professor(String nomeProfessor, int matriculaProfessor,
			String especialidadeProfessor) {
		this.nomeProfessor = nomeProfessor;
		this.matriculaProfessor = matriculaProfessor;
		this.especialidadeProfessor = especialidadeProfessor;
	}
	public String getNomeProfessor() {
		return nomeProfessor;
	}
	public void setNomeProfessor(String nomeProfessor) {
		this.nomeProfessor = nomeProfessor;
	}
	public int getMatriculaProfessor() {
		return matriculaProfessor;
	}
	public void setMatriculaProfessor(int matriculaProfessor) {
		this.matriculaProfessor = matriculaProfessor;
	}
	public String getEspecialidadeProfessor() {
		return especialidadeProfessor;
	}
	public void setEspecialidadeProfessor(String especialidadeProfessor) {
		this.especialidadeProfessor = especialidadeProfessor;
	}
	
	
}
