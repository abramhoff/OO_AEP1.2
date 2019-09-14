package AEP2;

import java.util.ArrayList;
import java.util.List;

public class Nota {
	private double nota;
	private Avaliação avaliação;
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
	
	public Avaliação getAvaliação() {
		return this.avaliação;
	}
	
	public void setAvaliação(Avaliação avaliação) {
		this.avaliação = avaliação;
		this.avaliação.adicionarNota(this);
	}
	
}
