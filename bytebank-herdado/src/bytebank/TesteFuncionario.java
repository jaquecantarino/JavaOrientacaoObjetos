package bytebank;

public class TesteFuncionario {

	public static void main(String[] args) {
		
		Funcionario funcionario = new Gerente();
		
		funcionario.setNome("Jaque");
		funcionario.setCpf("123456789-10");
		funcionario.setSalario(1000.00);
		
		System.out.println(funcionario.getNome());
		System.out.println(funcionario.getBonificacao());
		
		Gerente g1 = new Gerente();
        g1.setNome("Marcos");
        g1.setSalario(5000.0);

        EditorVideo ev = new EditorVideo();
        ev.setSalario(2500.0);

        Designer d = new Designer();
        d.setSalario(2000.0);

        ControleBonificacao controle = new ControleBonificacao();
        controle.registra(g1);
        controle.registra(ev);
        controle.registra(d);

        System.out.println(controle.getSoma());
        
        Gerente nico = new Gerente();
        nico.setNome("Nico Steppat");
        nico.setCpf("223355646-9");
        nico.setSalario(2600.00);

        System.out.println(nico.getNome());
        System.out.println(nico.getBonificacao());

        //nico.salario = 300.0;
		

	}

}
