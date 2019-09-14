package AEP2;

import java.util.ArrayList;
import java.util.List;

public class Avaliação {
//	private double notaDoAluno
	private String matéria;
	private boolean aprovado = true;
	private Aluno aluno;
	private Nota nota;
	private List<Nota> notas = new ArrayList<Nota>();
	private Turma turma;
	
	public Avaliação(String matéria, Aluno aluno) {
		this.matéria = matéria;
		this.aluno = aluno;
		aluno.setAvaliação(this);
	}
	
	public String getMatéria() {
		return matéria;
	}
	
	public void avaliarAlunos() {
		  
		if(this.aluno.getNotaDoAluno() < 6.0d) {
			this.aprovado = false;
		}
		 
	}
	
	public List<Nota> getNota(){
		return notas;
	}
	
	public void adicionarNota(Nota nota) {
		if(!this.notas.contains(nota)) {
			this.notas.add(nota);
			nota.setAvaliação(this);
		}
	}
	
	public Aluno getAluno() {
		return aluno;
	}
	
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
		this.aluno.getAvaliação();
	}
	
		
	public boolean getAprovado() {
		return this.aprovado;
	}
 
	
}
