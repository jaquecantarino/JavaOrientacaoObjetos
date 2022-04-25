package bytebank;

public class TesteReferencias {

	public static void main(String[] args) {
		
		//Funcionario g1 = new Gerente(); // referencia do tipo funcionario e novo gerente, não funciona as especificações do gerente.
		/* polimorfismo, é a forma de acessar o mesmo objeto de dois jeitos diferentes. */
		/* No polimorfismo podemos usar o objeto generico e ele servir para todas as subclasses */
		
		Gerente g1 = new Gerente();
		
		g1.setNome("Maria");
		g1.setSalario(5000.0);
		
		Funcionario f = new Designer();
		f.setSalario(2000.0);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);
		controle.registra(f);
		
		System.out.println(controle.getSoma());
		

	}

}
