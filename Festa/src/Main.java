public class Main {
    public static void main(String[] args) throws Exception {
        
        Cliente vitor = new Cliente("Vitor", "12345678", "13/08/2003");
        Tema circo = new Tema("boneco, toalha, castelo", 500, "verde");
        Festa festa = new Festa("14:00", "20:00", "20/09/2022", circo, vitor);
        System.out.println(festa.calcularValorFinal(12));
    }
}
