package bytebank;

public class TestaGerente {

	public static void main(String[] args) {
//		Gerente g1 = new Gerente();
//		
//		g1.setNome("Antonia");
//		g1.setCpf("789456123-10");
//		g1.setSalario(5000.0);
//		
//		System.out.println(g1.getNome());
//		System.out.println(g1.getCpf());
//		System.out.println(g1.getSalario());
//		
//		g1.setSenha(1111);
//		boolean autenticou = g1.autentica(1111);
//		
//		System.out.println(autenticou);
//		
//		System.out.println(g1.getBonificacao());
//		
//		System.out.println(g1.getNome());
//        System.out.println(g1.getCpf());
//        System.out.println(g1.getSalario());
        
        Autenticavel referencia = new Cliente();

        Gerente g1 = new Gerente();
        g1.setNome("Marco");
        g1.setCpf("235568413");
        g1.setSalario(5000.0);

        System.out.println(g1.getNome());
        System.out.println(g1.getCpf());
        System.out.println(g1.getSalario());

	}

}
