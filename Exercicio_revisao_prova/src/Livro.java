public class Livro extends Obra{

    private String autor;
    private String isbn;
    private int edicao;

    public Livro(String aut, String isbn, String titulo,int edicao, String editora){
        super(titulo, editora, isbn, titulo, editora);
        this.autor = aut;
        this.isbn = isbn;
        this.edicao = edicao;
        this.titulo = titulo;
        this.editora = editora;
    }

    public String getAutor() {
        return autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getEdicao() {
        return edicao;
    }

    @Override
    public String toString() {
        return "Livro: Titulo: " + titulo + ", Edicao: " + edicao + ", Autor: " + isbn + ", Editora: " + editora;
    }

}
