public class Viagem {
    
    @Override
    public String toString() {
        return "Viagem [cidade=" + cidade + ", pais=" + pais + ", dt_chegada=" + dt_chegada + ", dt_saida=" + dt_saida
                + ", temp_max=" + temp_max + ", temp_min=" + temp_min + ", dias_viagem=" + dias_viagem + "]";
    }
    private String cidade;
    private String pais;
    private String dt_chegada;
    private String dt_saida;
    private double temp_max;
    private double temp_min;
    protected int dias_viagem;

    public void setDias_viagem(int dias_viagem) {
        this.dias_viagem = dias_viagem;
    }

    public Viagem(String cidade, String pais, String dt_chegada, String dt_saida, double temp_max, double temp_min, int dias_viagem) {
        this.cidade = cidade;
        this.pais = pais;
        this.dt_chegada = dt_chegada;
        this.dt_saida = dt_saida;
        this.temp_max = temp_max;
        this.temp_min = temp_min;
        this.dias_viagem = dias_viagem;
    }
    
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public void setPais(String pais) {
        this.pais = pais;
    }
    public void setDt_chegada(String dt_chegada) {
        this.dt_chegada = dt_chegada;
    }
    public void setDt_saida(String dt_saida) {
        this.dt_saida = dt_saida;
    }
    public void setTemp_max(double temp_max) {
        this.temp_max = temp_max;
    }
    public void setTemp_min(double temp_min) {
        this.temp_min = temp_min;
    }
}
