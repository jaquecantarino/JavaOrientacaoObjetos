
public class TestaBanco {

	public static void main(String[] args) {
		
		Cliente ana = new Cliente();
		ana.nome = "Ana";
		ana.cpf = "123.456.789-00";
		ana.profissao = "dev";
		
		Conta conta = new Conta();
		conta.deposita(100);
		
		conta.titular=ana;
		System.out.println(conta.titular.nome);

	}

}
