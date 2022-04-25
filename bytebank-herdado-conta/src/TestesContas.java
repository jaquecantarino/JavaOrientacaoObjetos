
public class TestesContas {

	public static void main(String[] args) {
		Conta conta = new Conta(1337, 23334);

		conta.deposita(200.0);

		System.out.println(conta.getSaldo());

		conta.setAgencia(570);

		System.out.println(conta.getAgencia());

		System.out.println("o total de contas é : " + Conta.getTotal());
		
		ContaCorrente cc = new ContaCorrente(111,111);
        cc.deposita(100.0);

        ContaPoupanca cp = new ContaPoupanca(222,222);
        cp.deposita(200.0);

        cc. transfere(10.0, cp);
        System.out.println("CC: " + cc.getSaldo());
        System.out.println("CP: " + cp.getSaldo());
	}

}
