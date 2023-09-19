public class Cliente {

    private String nome;
    private String dt_cadastro;
    private String telefone;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDt_cadastro() {
        return dt_cadastro;
    }
    public void setDt_cadastro(String dt_cadastro) {
        this.dt_cadastro = dt_cadastro;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Cliente(String nome, String telefone, String data){
        this.nome = nome;
        this.telefone = telefone;
        this.dt_cadastro = data;
    }
    @Override
    public String toString() {
        return " Cliente [nome=" + nome + ", dt_cadastro=" + dt_cadastro + ", telefone=" + telefone + "]";
    }

    
}
