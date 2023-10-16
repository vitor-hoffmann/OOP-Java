public class Revista extends Obra{

    private String issn;
    private int ano;
    private int numero;
    private String data;

    public Revista(String issn, int ano, int num, String data, String titulo, String editora){
        super(titulo, editora, data, titulo, editora);
        this.issn = issn;
        this.ano = ano;
        this.numero = num;
        this.data = data;
        this.titulo = titulo;
        this.editora = editora;
    }

    public String getIssn() {
        return issn;
    }

    public int getAno() {
        return ano;
    }

    public int getNumero() {
        return numero;
    }

    public String getData() {
        return data;
    }
    @Override
    public String toString() {
        return "Revista: Titulo: " + titulo + ", Data: " + data + ", Ano: " + ano + ", Autor: " + editora;
    }

}
