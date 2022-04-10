
public class Conta {
	/* atributos */
	/* campo ou propriedade */
	double saldo;
	int agencia;
	int numero;
	Cliente titular;

	/* criando ações para a nossa conta. */
	/* metodos */

	public void deposita(double valor) { /* void indica que não tem retorno */
		this.saldo += valor; /* this indica "desta" faz a referencia no objeto */
	}

	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}

	public boolean tranfere(double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		} else {
			return false;
		}

	}

}
