import java.util.ArrayList;
import java.util.List;

public class Mala extends Viagem{
    @Override
    public String toString() {
        return "Mala [cor=" + cor + ", tamanho=" + tamanho + "]";
    }
    private String cor;
    private String tamanho;
    private Roupa[] roupas;
    private Sapato[] sapatos;
    private Acessorio[] acessorios;
    private List<Itens> itensObrigatorios = new ArrayList<>();


    public Mala(String cor, String tamanho) {
        super(tamanho, tamanho, cor, tamanho, 0, 0, 0);
        this.cor = cor;
        this.tamanho = tamanho;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String imprimirMala() {
        for (int dia = 0; dia < dias_viagem; dia++) {
            
            if (roupas[dia] != null) {
                return "Roupa: " + roupas[dia].getNome();
            }
            if (sapatos[dia] != null) {
                return "Sapato: " + sapatos[dia].getNome();
            }
            if (acessorios[dia] != null) {
                return "Acessório: " + acessorios[dia].getNome();
            }
        }
        return "no";
    }

    public void addItensObrigatorios() {
        int meiasCount = 0;
        int chinelosCount = 0;
        int pulseirasCount = 0;

        for (int dia = 0; dia < dias_viagem; dia++) {
            if (roupas[dia] != null && roupas[dia].getNome().equals("Meias")) {
                meiasCount++;
            }

            if (sapatos[dia] != null && sapatos[dia].getNome().equals("Chinelos")) {
                chinelosCount++;
            }

            if (acessorios[dia] != null && acessorios[dia].getNome().equals("Pulseira")) {
                pulseirasCount++;
            }
        }

        for (int dia = 0; dia < dias_viagem; dia++) {
            if (meiasCount < dias_viagem) {
                Itens meias = new Roupa("Meias", "Meias", "", 0, false);
                roupas[dia] = (Roupa) meias;
                itensObrigatorios.add(meias);
                meiasCount++;
            }

            if (chinelosCount < dias_viagem) {
                Itens chinelos = new Sapato("Chinelos", "Chinelos", "", "", "", false);
                sapatos[dia] = (Sapato) chinelos;
                itensObrigatorios.add(chinelos);
                chinelosCount++;
            }

            if (pulseirasCount < dias_viagem) {
                Itens pulseira = new Acessorio("Pulseira", "Pulseira", "Social", "Metal","Punho");
                acessorios[dia] = (Acessorio) pulseira;
                itensObrigatorios.add(pulseira);
                pulseirasCount++;
            }
        }
    }
}
