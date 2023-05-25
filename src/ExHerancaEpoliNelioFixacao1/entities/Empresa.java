package ExHerancaEpoliNelioFixacao1.entities;

public class Empresa extends Contribuinte {

    private Integer numeroDeFuncionarios;

    public Empresa(Integer numeroDeFuncionarios) {
        this.numeroDeFuncionarios = numeroDeFuncionarios;
    }

    public Empresa(String name, Double anuallncome, Integer numeroDeFuncionarios) {
        super(name, anuallncome);
        this.numeroDeFuncionarios = numeroDeFuncionarios;
    }

    public Integer getNumeroDeFuncionarios() {
        return numeroDeFuncionarios;
    }

    public void setNumeroDeFuncionarios(Integer numeroDeFuncionarios) {
        this.numeroDeFuncionarios = numeroDeFuncionarios;
    }

    @Override
    public Double imposto() {
        if (numeroDeFuncionarios > 10){
            return getRendaAnual() * 0.14;
        } else {
            return getRendaAnual() * 0.16;
        }
    }
}
