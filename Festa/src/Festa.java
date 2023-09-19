public class Festa {
    
    private String hr_inicio;
    private String hr_termino;
    private String dt_festa;
    private Tema tema;
    private Cliente cliente;
    
    public Festa(String hr_inicio, String hr_termino, String dt_festa, Tema tema, Cliente cliente) {
        this.hr_inicio = hr_inicio;
        this.hr_termino = hr_termino;
        this.dt_festa = dt_festa;
        this.tema = tema;
        this.cliente = cliente;
    }
    
    public Tema getTema() {
        return tema;
    }
    public void setTema(Tema tema) {
        this.tema = tema;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public String getHr_inicio() {
        return hr_inicio;
    }
    public void setHr_inicio(String hr_inicio) {
        this.hr_inicio = hr_inicio;
    }
    public String getHr_termino() {
        return hr_termino;
    }
    public void setHr_termino(String hr_termino) {
        this.hr_termino = hr_termino;
    }
    public String getDt_festa() {
        return dt_festa;
    }
    public void setDt_festa(String dt_festa) {
        this.dt_festa = dt_festa;
    }

    @Override
    public String toString() {
        return "Festa [hr_inicio=" + hr_inicio + ", hr_termino=" + hr_termino + ", dt_festa=" + dt_festa
                + tema  + cliente + "]";
    }
    public double calcularValorFinal(int anos_cliente){
        if (anos_cliente >= 10){
            
            
            return tema.getValor_aluguel() * 0.9;
        } 
        else{
            return tema.getValor_aluguel();
        }
    }

}