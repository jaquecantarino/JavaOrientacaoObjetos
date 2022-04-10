package bytebank;

public class TestaMetodo {

	public static void main(String[] args) {
		Conta conta = new Conta();
		
		conta.saldo=100;
		
		conta.deposita(50);
		
		System.out.println(conta.saldo);
		
		boolean conseguiuRetirar = conta.saca(20);
		System.out.println(conta.saldo);
		System.out.println(conseguiuRetirar);
		
		Conta conta2 = new Conta();
		conta2.deposita(1000);
		
		boolean sucessoTransferencia = conta2.tranfere(300, conta);
		if(sucessoTransferencia){
			System.out.println("Transferencia com sucesso.");
		} else {
			System.out.println("faltou dinheiro!");
		}
		System.out.println(conta2.saldo);
		System.out.println(conta.saldo);
		
		conta.titular="Ana Maria";
		System.out.println(conta.titular);

	}

}
