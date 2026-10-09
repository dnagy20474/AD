package exercicis.exercici9;

public class Caixer {

    // Atribut de la clase.
    private String[] productesRebuts;
    private String CODI_PRODUCTE;
    private String PREU;

    // Mètodes de la clase.
    public void processarRegistre() {

    }

    // Constructor de la clase.
    public Caixer() {

    }

    // Mètode toString().
    @Override
    public String toString() {
        return "Caixer{}";
    }

    // Getter i Setter.
    public String[] getProductesRebuts() {
        return productesRebuts;
    }

    public void setProductesRebuts(String[] productesRebuts) {
        this.productesRebuts = productesRebuts;
    }
}