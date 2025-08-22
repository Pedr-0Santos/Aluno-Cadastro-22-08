
public class Aluno {
 
	private int matricula;
	private double nota;
	private String nome;
	
	
	public Aluno(int matricula, double nota, String nome) {
		super();
		this.matricula = matricula;
		this.nota = nota;
		this.nome = nome;
	}
	public void setmatricula(int matricula) {
		this.matricula = matricula;
	}
	public void setnota(double nota) {
		this.nota = nota;
	}
	public void setnome(String nome) {
		this.nome = nome;
	}

	public int getmatricula() {
		return matricula;
	}
	public String getnome() {
		return nome;
	}
	public double getnota() {
		return nota;
	}
	
	
	
}
