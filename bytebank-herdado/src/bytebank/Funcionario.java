package bytebank;

public abstract class Funcionario { /* funcionario é um conceito, logo não pode ser instanciada, apenas seus filhos */
	/* atributos */
	
	private String nome;
	private String cpf;
	private double salario;
	// protected double salario; /* publico para os filhos/subclasse, 
	//								escondido para outras classes */
	
    private int senha;
	
	/* construtor vazio */
	public Funcionario() {
		
	}
	
	/* metodo de utilização */
	/*public double getBonificacao() {
		return this.salario*0.05;
	}*/
	
	public abstract double getBonificacao();{
		
	}

    public boolean autentica(int senha) {
        if(this.senha == senha) {
            return true;
        } else {
            return false;
        }
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
	
    public void setSenha(int senha) {
        this.senha = senha;
    }
	
	

}
