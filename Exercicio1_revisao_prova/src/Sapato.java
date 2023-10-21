public class Sapato extends Itens{
    @Override
    public String toString() {
        return "Sapato [cor=" + cor + ", tipo=" + tipo + ", res_agua=" + res_agua + "]";
    }
    private String cor;
    private String tipo;
    private boolean res_agua;
    public Sapato(String nome, String descrição, String foto, String cor, String tipo, boolean res_agua) {
        super(nome, descrição, foto);
        this.cor = cor;
        this.tipo = tipo;
        this.res_agua = res_agua;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public void setRes_agua(boolean res_agua) {
        this.res_agua = res_agua;
    }
    public String getCor() {
        return cor;
    }
    public String getTipo() {
        return tipo;
    }
    public boolean isRes_agua() {
        return res_agua;
    }
    
}
