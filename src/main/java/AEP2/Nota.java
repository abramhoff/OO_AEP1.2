package AEP2;

import java.util.ArrayList;
import java.util.List;

public class Nota {
	private double nota;
	private Avalia��o avalia��o;
	private Turma turma;
	private Aluno aluno;
	
	public Nota(double nota) {
		if(this.nota < 0 || this.nota > 10) {
			this.nota = nota;
		}
	}
	
	public double getNota() {
		return nota;
	}
	
	public Avalia��o getAvalia��o() {
		return this.avalia��o;
	}
	
	public void setAvalia��o(Avalia��o avalia��o) {
		this.avalia��o = avalia��o;
		this.avalia��o.adicionarNota(this);
	}
	
}
