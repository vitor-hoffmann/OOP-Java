public abstract class Obra{

    protected String titulo;
    protected String editora;

    public Obra(String tit, String ed, String isbn, String edicao, String autor) {
        this.titulo = tit;
        this.editora = ed;
    }
    //@Override
    //public String toString() {
        //return "Titulo: " + titulo + ", Editora: " + editora + ", Autor: " + autor;
    //}
}