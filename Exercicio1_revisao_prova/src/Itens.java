public class Itens {

    protected String nome;
    protected String descrição; 
    protected String foto;
    
    public String getNome() {
        return nome;
    }
    public String getDescrição() {
        return descrição;
    }
    public String getFoto() {
        return foto;
    }
    public Itens(String nome, String descrição, String foto) {
        this.nome = nome;
        this.descrição = descrição;
        this.foto = foto;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }
    public void setFoto(String foto) {
        this.foto = foto;
    }
}