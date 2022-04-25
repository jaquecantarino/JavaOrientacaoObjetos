package bytebank;

public class Gerente extends Funcionario implements Autenticavel {

	private int senha;

	public double getBonificacao() {
		System.out.println("Chamando o m�todo de bonificacao do GERENTE");
		return super.getSalario();
	}

	@Override
	public void setSenha(int senha) {
		this.senha = senha;
	}

	@Override
	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}

	/**********************************************************************************************/
//	/* atributos extra */
//	private int senha; 
//	
//	/* construtor vazio */
//	public Gerente() {
//		
//	}
//	
//	/* metodo extra */
//	public boolean autentica(int senha) {
//		if(this.senha == senha) {
//			return true;
//		} else {
//			return false;
//		}
//	}
//	
//	/* metodo de utiliza��o */
//	@Override /* sobrecarga - reescrita */
////	public double getBonificacao() {
////		return getBonificacao() + super.getSalario(); /* tiramos o this por boa pratica, j� que �
////		 						um atributo da super classe, usamos o super*/
////	}
//	
//	public double getBonificacao() {
//        System.out.println("Chamando o m�todo de bonificacao do GERENTE");
//        return super.getSalario();
//    }
//
//	public int getSenha() {
//		return senha;
//	}
//
//	public void setSenha(int senha) {
//		this.senha = senha;
//	}

}
