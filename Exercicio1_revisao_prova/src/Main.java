public class Main {
    public static void main(String[] args) throws Exception {
        Viagem viagem = new Viagem("Gama", "Brasil", "21/10/2023", "25/10/2023", 32, 20, 4);
        Mala minhmala = new Mala("Azul", "G");
        System.out.println(minhmala);
        minhmala.addItensObrigatorios();
        System.out.println(minhmala.imprimirMala());
    }
}
