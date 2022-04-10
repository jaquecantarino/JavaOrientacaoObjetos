package bytebank;

public class TesteFuncionario {

	public static void main(String[] args) {
		
		Funcionario funcionario = new Funcionario();
		
		funcionario.setNome("Jaque");
		funcionario.setCpf("123456789-10");
		funcionario.setSalario(1000.00);
		
		System.out.println(funcionario.getNome());
		System.out.println(funcionario.getBonificacao());

	}

}
