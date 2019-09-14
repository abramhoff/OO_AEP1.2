package AEP2;

import java.util.ArrayList;
import java.util.List;

public class Avalia��o {
//	private double notaDoAluno
	private String mat�ria;
	private boolean aprovado = true;
	private Aluno aluno;
	private Nota nota;
	private List<Nota> notas = new ArrayList<Nota>();
	private Turma turma;
	
	public Avalia��o(String mat�ria, Aluno aluno) {
		this.mat�ria = mat�ria;
		this.aluno = aluno;
		aluno.setAvalia��o(this);
	}
	
	public String getMat�ria() {
		return mat�ria;
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
			nota.setAvalia��o(this);
		}
	}
	
	public Aluno getAluno() {
		return aluno;
	}
	
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
		this.aluno.getAvalia��o();
	}
	
		
	public boolean getAprovado() {
		return this.aprovado;
	}
 
	
}
