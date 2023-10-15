public class Biblioteca {
    
    private String nome;
    private String endereco;

    public boolean adiquirirLivro(Obra o){
        if (o instanceof Obra){
            return true;
        }else{
            return false;
        }
    }
    public void addBiblioteca(String nome, String end){
        this.nome = nome;
        this.endereco = end;
    }

}
