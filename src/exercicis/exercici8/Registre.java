package exercicis.exercici8;

public class Registre {

    // Atributs
    String id;
    String nomComplet;
    String ciutat;

    // Constructor
    public Registre(String id, String nomComplet, String ciutat) {
        this.setId(id);
        this.setNomComplet(nomComplet);
        this.setCiutat(ciutat);
    }

    // Mètode per comprobar si es de Barcelona o no.
    public void esDeBarcelona() {
        // Comprovem si es de Barcelona.
        if (ciutat.equals("Barcelona")) {
            System.out.printf("L'usuari es de Barcelona.");
        } else {
            System.out.printf("No tenim cap usuari de Barcelona.");
        }
    }

    // Getters i Setters.
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNomComplet() {
        return nomComplet;
    }

    public void setNomComplet(String nomComplet) {
        this.nomComplet = nomComplet;
    }

    public String getCiutat() {
        return ciutat;
    }

    public void setCiutat(String ciutat) {
        this.ciutat = ciutat;
    }
}
