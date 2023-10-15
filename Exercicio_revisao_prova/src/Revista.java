public class Revista extends Obra{


    private String issn;
    private int ano;
    private int numero;
    private String data;

    public void addRevista(String issn, int ano, int num, String data, String titulo, String editora){
        this.issn = issn;
        this.ano = ano;
        this.numero = num;
        this.data = data;
        this.titulo = titulo;
        this.editora = editora;
    }
    
}
