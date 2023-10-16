public class Lampada {

    private boolean ligada;
    private String voltagem;
    private double preco;
    private int intensidade;
    
    public Lampada(boolean ligada, String voltagem, double preco, int intensidade) {
        this.ligada = ligada;
        this.voltagem = voltagem;
        this.preco = preco;
        this.intensidade = intensidade;
    }
    public String verificarEstado(boolean ligada){
        if (ligada == true){
            return "Ligada";
        }
        else{
            return "Desigada";
        }
    }
    public boolean isLigada() {
        return ligada;
    }
    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }
    public String getVoltagem() {
        return voltagem;
    }
    public void setVoltagem(String voltagem) {
        this.voltagem = voltagem;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public int getIntensidade() {
        return intensidade;
    }
    public void setIntensidade(int intensidade) {
        this.intensidade = intensidade;
    }
    @Override
    public String toString() {
        return "Estado = " + verificarEstado(ligada) + "\nVoltagem = " + voltagem + "\nPreço = " + preco + "\nIntensidade = "
                + intensidade;
    }
    
}
