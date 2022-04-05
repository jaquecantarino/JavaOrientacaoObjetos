package bytebank;

public class TesteReferencia {

	public static void main(String[] args) {
		
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		
		System.out.println("saldo 1� conta: " + primeiraConta.saldo);
		
		/* temos duas referencias para o mesmo lugar, aqui n�o criamos uma conta nova,
		 * isso �, primeira e segunda conta s�o a mesma instancia, o mesmo endere�o de objeto 
		 * na memoria.*/
		Conta segundaConta = primeiraConta;
		
		System.out.println("2� saldo: " + segundaConta.saldo);
		/* Temos duas variaveis mas n�o dois objetos */
		
		segundaConta.saldo += 100;
		System.out.println("2� novo saldo: " + segundaConta.saldo);
		
		/* comprovando que ambas manuseam a mesma conta */
		System.out.println("Saldo 1� Conta: " + primeiraConta.saldo);
		
		/* Condi��o para validar se s�o a mesma conta */
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
