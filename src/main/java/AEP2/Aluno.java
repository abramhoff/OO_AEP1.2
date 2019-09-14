package AEP2;

public class Aluno {
	private String idDoAluno;
	private String nomeDoAluno;
	private double notaDoAluno;
	private Turma turma;
	private Avaliação avaliação;
	private Nota nota;
	
	public Aluno(String idDoAluno, String nomeDoAluno, double notaDoAluno) {
		this.idDoAluno = idDoAluno;
		this.nomeDoAluno = nomeDoAluno;
		this.notaDoAluno = notaDoAluno;
	}
	
	public String getIdDoAluno() {
		return idDoAluno;
	}
	
	public String getNomeDoAluno() {
		return nomeDoAluno;
	}
	
	public double getNotaDoAluno() {
		return notaDoAluno;
	}
	
	public Turma getTurma() {
		return this.turma;
	}
	
	public void setTurma(Turma turma) {
		this.turma = turma;
		this.turma.adicionarAluno(this);
	}
	
	public String getAvaliação() {
		return (avaliação.getAprovado()) ? "aprovado": "reprovado";
	}
	
	public void setAvaliação(Avaliação avaliação) {
		this.avaliação = avaliação;
		//this.avaliação.avaliarAlunos(this);
	}
	
}
