package main;

public class ContaCorrente extends Conta {
	
	@Override
	public deposita(double valor) {
		this.saldo += valor - 1;
	}

}
