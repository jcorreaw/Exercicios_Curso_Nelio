package ExHerancaEpoliNelioFixacao1.entities;

public abstract class Contribuinte {
    private String nome;
    private Double rendaAnual;

    public Contribuinte(){
    }

    public Contribuinte(String name, Double anuallncome) {
        this.nome = name;
        this.rendaAnual = anuallncome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getRendaAnual() {
        return rendaAnual;
    }

    public void setRendaAnual(Double rendaAnual) {
        this.rendaAnual = rendaAnual;
    }

    public abstract Double imposto();

}
