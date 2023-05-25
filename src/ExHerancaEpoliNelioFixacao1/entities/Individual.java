package ExHerancaEpoliNelioFixacao1.entities;

public class Individual extends Contribuinte {
    private Double gastosComSaude;

    public Individual(Double gastosComSaude) {
        this.gastosComSaude = gastosComSaude;
    }

    public Individual(String name, Double anuallncome, Double gastosComSaude) {
        super(name, anuallncome);
        this.gastosComSaude = gastosComSaude;
    }

    public Double getGastosComSaude() {
        return gastosComSaude;
    }

    public void setGastosComSaude(Double gastosComSaude) {
        this.gastosComSaude = gastosComSaude;
    }

    @Override
    public Double imposto() {
        if (getRendaAnual() < 20000.00){
            return getRendaAnual() * 0.15 - gastosComSaude * 0.5;
        } else {
            return getRendaAnual() * 0.25 - gastosComSaude * 0.5;
        }
    }
}
