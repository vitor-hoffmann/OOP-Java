public class Main {
    public static void main(String[] args){

        Biblioteca biblioteca = new Biblioteca("Biblioteca Central", "Centro");

        Obra[] obras = new Obra[100];
        obras[0] = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", "978-3-16-148410-0", 1, "HarperCollins");
        obras[1] = new Revista("Scientific American", 2023, 1, "Janeiro de 2023", "Scientific American", "Springer Nature");
        
        int i = 0;
        while(obras[i] != null){
            System.out.println(obras[i].toString());
            i++;
        }
    }
}