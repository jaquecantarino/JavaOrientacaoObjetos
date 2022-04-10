package bytebank;

public class Funcionario {
	/* atributos */
	
	private String nome;
	private String cpf;
	private double salario;
	// protected double salario; /* publico para os filhos/subclasse, 
	//								escondido para outras classes */
	
	/* construtor vazio */
	public Funcionario() {
		
	}
	
	/* metodo de utilização */
	public double getBonificacao() {
		return this.salario*0.1;
	}
	
	/* gets e sets para manipular os dados. */
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	

}
