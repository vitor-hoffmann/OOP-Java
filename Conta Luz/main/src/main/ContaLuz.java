public class ContaLuz {

	private String dtLeitura;
	private String dtPagamento;
	private double qtdKwgastos;
	private double valor;
	
	public ContaLuz(String dtLeitura, String dtPagamento, double qtdKwgastos, double valor) {
		super();
		this.dtLeitura = dtLeitura;
		this.dtPagamento = dtPagamento;
		this.qtdKwgastos = qtdKwgastos;
		this.valor = valor;
	}

	public String getDtLeitura() {
		return dtLeitura;
	}

	public void setDtLeitura(String dtLeitura) {
		this.dtLeitura = dtLeitura;
	}

	public String getDtPagamento() {
		return dtPagamento;
	}

	public void setDtPagamento(String dtPagamento) {
		this.dtPagamento = dtPagamento;
	}

	public double getQtdKwgastos() {
		return qtdKwgastos;
	}

	public void setQtdKwgastos(double qtdKwgastos) {
		this.qtdKwgastos = qtdKwgastos;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
}