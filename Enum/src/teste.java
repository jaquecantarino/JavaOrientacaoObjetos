
public class teste {

	public static void main(String[] args) {
		
		Prioridade pMin = Prioridade.MIN;
		Prioridade pMax = Prioridade.MAX;
		
//nome do valor fixo em Enum
		System.out.println(pMin.name());
		System.out.println(pMax.name());
	
//posição do valor na lista de Enums		
		System.out.println(pMin.ordinal());
		System.out.println(pMax.ordinal());

//valores associados do Enum usado.
		System.out.println(pMin.getValor());
		System.out.println(pMax.getValor());
	}

}
