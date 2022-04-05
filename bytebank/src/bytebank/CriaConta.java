package bytebank;

public class CriaConta {

	public static void main(String[] args) {
		/* Instanciando o objeto */
		Conta primeiraConta = new Conta();
		/* tipo de variavel(objeto) - nomeDaVariavel = instancia do objeto */
		
		primeiraConta.saldo = 200; /* dando valor aos atribuitos do objeto */

		System.out.println(primeiraConta.saldo); /* mostrando informa��o - fazendo acesso*/
		
		primeiraConta.saldo += 100; /* manuseando os valores atribuidos */
		System.out.println(primeiraConta.saldo);
		
		Conta segundaConta = new Conta();
		segundaConta.saldo=50;
		
		System.out.println("1� conta tem: "+primeiraConta.saldo);
		System.out.println("2� conta tem: "+segundaConta.saldo);
		
		/* Quando instanciamos um objeto, por padr�o, o java zera seus atributos, logo,
		 * se tentarmos imprimir um dado que ainda n�o recebeu valor o default ser� 0 */
		System.out.println(primeiraConta.agencia);
		System.out.println(primeiraConta.numero);
		/* podemos atribuir valor l� na classe, caso a regra de negocio diga que o valor default
		 * � diferente de zero, assim, caso n�o seja definido, usar� o valor atribuido na Classe. */
	}

}
