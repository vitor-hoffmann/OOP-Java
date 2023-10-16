public class ControleContasLuz {
	private String id;
	private ContaLuz[] contas;
	private int qtdContas = 0;
	
	public void acrescentarConta(ContaLuz c) {
		contas[qtdContas] = c;
		qtdContas++;
	}

	public ControleContasLuz(String id) {
		this.id = id;
		qtdContas = 0;
		contas = new ContaLuz[100];
	}
	public ContaLuz verificarMesMenorConsumo(){

        double menor = contas[0].getQtdKwgastos();
        ContaLuz c = contas[0];
        for(int i= 0; i < qtdContas; i++){
            if(contas[i].getQtdKwgastos() <= menor){
                menor = contas[i].getQtdKwgastos();
                c = contas[i];
            }
        }
        return c;
    }
	public ContaLuz verificarMesMaiorConsumo(){

        double maior = contas[0].getQtdKwgastos();
        ContaLuz c = contas[0];
        for(int i= 0; i < qtdContas; i++){
            if(contas[i].getQtdKwgastos() >= maior){
                maior = contas[i].getQtdKwgastos();
                c = contas[i];
            }
        }
        return c;
    }
	public double CalcularMediaConsumo() {
		double soma = 0;
		for (int i = 0; i < qtdContas; i++) {
			soma += contas[i].getValor();
		}
		
		return soma/qtdContas;
	}
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	public int getQtdContas() {
		return qtdContas;
	}
	public int getContas() {
		for (int i = 0; i < qtdContas; i++) {
			System.out.println(contas[i]);
		}
		return 0;
	}
	
}