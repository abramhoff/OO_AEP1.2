package AEP2;

public class App {
	
	
	public static void main(String[] args) {
		Aluno a1 = new Aluno("A1", "Leonardo", 4.0d);
		Aluno a2 = new Aluno("A2", "Joao", 2.0d);
		Aluno a3 = new Aluno("A3", "Erick", 8.0d);
		Aluno a4 = new Aluno("A4", "Rodrigo", 2.0d);
		
		Turma t1 = new Turma("esoft1");
		t1.adicionarAluno(a1);
		t1.adicionarAluno(a2);
	    t1.adicionarAluno(a3);
		t1.adicionarAluno(a4);
		
		Avalia��o av1 = new Avalia��o("Matem�tica", a1);
		Avalia��o av2 = new Avalia��o("Matem�tica", a2);
		Avalia��o av3 = new Avalia��o("Matem�tica", a3);
		Avalia��o av4 = new Avalia��o("Matem�tica", a4);
		 av1.avaliarAlunos();
	 	 av2.avaliarAlunos();
		 av3.avaliarAlunos();
		 av4.avaliarAlunos();
		 
		 
		imprimirAlunoDaTurmaNoConsole(t1);
		
	}
	
	private static void imprimirAlunoDaTurmaNoConsole(Turma turma) {
		System.out.println("Alunos da turma: " + turma.getNome());
		for(Aluno aluno : turma.getAlunos()) {
			System.out.println(aluno.getNomeDoAluno() + " " + aluno.getNotaDoAluno() + " " + aluno.getAvalia��o());
		}
	}
 
}
