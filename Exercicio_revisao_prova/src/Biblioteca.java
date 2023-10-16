public class Biblioteca{
    
    private String nome;
    private String endereco;

    public boolean adiquirirLivro(Obra o){
        if (o instanceof Obra){
            return true;
        }else{
            return false;
        }
    }
    public Biblioteca(String nome, String end){
        super();
        this.nome = nome;
        this.endereco = end;
    }

    public String getNome() {
        return nome;
    }
    public String getEndereco() {
        return endereco;
    }
}
