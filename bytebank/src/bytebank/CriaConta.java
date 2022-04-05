package bytebank;

public class CriaConta {

	public static void main(String[] args) {
		/* Instanciando o objeto */
		Conta primeiraConta = new Conta();
		/* tipo de variavel(objeto) - nomeDaVariavel = instancia do objeto */
		
		primeiraConta.saldo = 200; /* dando valor aos atribuitos do objeto */

		System.out.println(primeiraConta.saldo); /* mostrando informação - fazendo acesso*/
		
		primeiraConta.saldo += 100; /* manuseando os valores atribuidos */
		System.out.println(primeiraConta.saldo);
		
		Conta segundaConta = new Conta();
		segundaConta.saldo=50;
		
		System.out.println("1ª conta tem: "+primeiraConta.saldo);
		System.out.println("2ª conta tem: "+segundaConta.saldo);
		
		/* Quando instanciamos um objeto, por padrão, o java zera seus atributos, logo,
		 * se tentarmos imprimir um dado que ainda não recebeu valor o default será 0 */
		System.out.println(primeiraConta.agencia);
		System.out.println(primeiraConta.numero);
		/* podemos atribuir valor lá na classe, caso a regra de negocio diga que o valor default
		 * é diferente de zero, assim, caso não seja definido, usará o valor atribuido na Classe. */
	}

}
