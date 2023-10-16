public class Main {
	public static void main(String[] args) {
		
		ContaLuz c1 = new ContaLuz("06/09/2023","06/09/2023", 18.0, 38.0);
		ContaLuz c2 = new ContaLuz("06/08/2023","07/08/2023", 18.5, 40.0);
		ContaLuz c3 = new ContaLuz("06/07/2023","10/07/2023", 19.0, 42.0);
		
		ControleContasLuz cc1 = new ControleContasLuz("Minha casa");
		
		cc1.acrescentarConta(c1);
		cc1.acrescentarConta(c2);
		cc1.acrescentarConta(c3);
		
		double media = cc1.CalcularMediaConsumo();
		String menor = cc1.verificarMesMenorConsumo().getDtLeitura();
		String maior = cc1.verificarMesMaiorConsumo().getDtLeitura();
		
		System.out.println("Mês de maior consumo: "+maior);
		System.out.println("Mês de menor consumo: "+menor);
		System.out.println("Media de consumo: "+media);
		System.out.println("Quantidade de contas cadastradas: "+cc1.getQtdContas());
		
	}
}
