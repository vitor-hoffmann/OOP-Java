public class Roupa extends Itens {
    @Override
    public String toString() {
        return "Roupa [temp_minr=" + temp_minr + ", res_agua=" + res_agua + "]";
    }
    private double temp_minr;
    private boolean res_agua;
    public Roupa(String nome, String descrição, String foto, double temp_minr, boolean res_agua) {
        super(nome, descrição, foto);
        this.temp_minr = temp_minr;
        this.res_agua = res_agua;
    }
    public void setTemp_minr(double temp_minr) {
        this.temp_minr = temp_minr;
    }
    public void setRes_agua(boolean res_agua) {
        this.res_agua = res_agua;
    }
    public double getTemp_minr() {
        return temp_minr;
    }
    public boolean isRes_agua() {
        return res_agua;
    }
   
}
