package AEP2;

import java.util.ArrayList;
import java.util.List;

public class Turma {
	private String nome;
	private List<Aluno> alunos = new ArrayList<Aluno>();
	private List<Avaliação> avaliações = new ArrayList<Avaliação>();
	
	public Turma (String nome) {
		if(nome == null || nome.trim().length() == 0) {
			throw new RuntimeException("Nome da turma não pode ser nulo!");
		}
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void adicionarAluno(Aluno aluno) {
		if(!this.alunos.contains(aluno)) {
			this.alunos.add(aluno);
			aluno.setTurma(this);
		}
	}
	
	public List<Aluno> getAlunos(){
		return alunos;
	}

	public List<Avaliação> getAvaliações() {
		return avaliações;
	}
 
}
