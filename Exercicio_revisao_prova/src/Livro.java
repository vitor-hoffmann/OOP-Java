public class Livro extends Obra{

    private String autor;
    private String isbn;
    private int edicao;

    public void addLivro(String aut, String isbn, int edicao, String titulo, String editora){
        this.autor = aut;
        this.isbn = isbn;
        this.edicao = edicao;
        this.titulo = titulo;
        this.editora = editora;
    }
}
