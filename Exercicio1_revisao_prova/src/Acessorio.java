public class Acessorio extends Itens{
    @Override
    public String toString() {
        return "Acessorio [tipo=" + tipo + ", reg_corpo=" + reg_corpo + "]";
    }
    private String tipo;
    private String reg_corpo;
    public Acessorio(String nome, String descrição, String foto, String tipo, String reg_corpo) {
        super(nome, descrição, foto);
        this.tipo = tipo;
        this.reg_corpo = reg_corpo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public void setReg_corpo(String reg_corpo) {
        this.reg_corpo = reg_corpo;
    }
    public String getTipo() {
        return tipo;
    }
    public String getReg_corpo() {
        return reg_corpo;
    }
    

}
