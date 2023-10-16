public class Tema {
    
    private String itens;
    private double valor_aluguel;
    private String cor_toalha;

    public Tema(String itens, double valor_aluguel, String cor_toalha) {
        this.itens = itens;
        this.valor_aluguel = valor_aluguel;
        this.cor_toalha = cor_toalha;
    }
    public String getItens() {
        return itens;
    }
    public void setItens(String itens) {
        this.itens = itens;
    }
    public double getValor_aluguel() {
        return valor_aluguel;
    }
    public void setValor_aluguel(double valor_aluguel) {
        this.valor_aluguel = valor_aluguel;
    }
    public String getCor_toalha() {
        return cor_toalha;
    }
    public void setCor_toalha(String cor_toalha) {
        this.cor_toalha = cor_toalha;
    }
    @Override
    public String toString() {
        return " Tema [itens=" + itens + ", valor_aluguel=" + valor_aluguel + ", cor_toalha=" + cor_toalha + "]";
    }
    
}
