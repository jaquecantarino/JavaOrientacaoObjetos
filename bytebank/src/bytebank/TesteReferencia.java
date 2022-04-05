package bytebank;

public class TesteReferencia {

	public static void main(String[] args) {
		
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		
		System.out.println("saldo 1ª conta: " + primeiraConta.saldo);
		
		/* temos duas referencias para o mesmo lugar, aqui não criamos uma conta nova,
		 * isso é, primeira e segunda conta são a mesma instancia, o mesmo endereço de objeto 
		 * na memoria.*/
		Conta segundaConta = primeiraConta;
		
		System.out.println("2ª saldo: " + segundaConta.saldo);
		/* Temos duas variaveis mas não dois objetos */
		
		segundaConta.saldo += 100;
		System.out.println("2ª novo saldo: " + segundaConta.saldo);
		
		/* comprovando que ambas manuseam a mesma conta */
		System.out.println("Saldo 1ª Conta: " + primeiraConta.saldo);
		
		/* Condição para validar se são a mesma conta */
		if(primeiraConta == segundaConta) {
			System.out.println("Mesma conta!");
		} else {
			System.out.println("Contas diferentes!");
		}
		
		
		/* MOSTRANDO AS REFEENCIAS */
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
	}

}
