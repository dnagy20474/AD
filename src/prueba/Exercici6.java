package prueba;

import java.util.*;

public class Exercici6 {

    // Declarem un Scanner per tota sa clase.
    static Scanner teclat = new Scanner(System.in);

    // Creem un ArrayList per els números decimals.
    static ArrayList<Double> numDecimals = new ArrayList();

    static void main() {

        // Cridem el mètode de mostrarMenu().
        mostrarMenu();

    }

    // Creem el mètode mostrarMenu()
    public static void mostrarMenu() {
        // Mostrem el menú amb les opcions.
        System.out.println(" --- GESTOR DE DESPESES ---");

        System.out.println("1. Despeses. (L’usuari pot introduir  un número indeterminat de despeses. " + "\n" +
                "Cal calcular el total de les despeses)");
        System.out.println("2. Pressupost.( Demana un valor que anomenarem pressupost. " +  "\n" +
                "Comprovar si estem en perill (Alerta). " +  "\n" +
                "Mostra el missatge pertinent.)");
        System.out.println("0. Sortir");

        // Demanem a l'usuari quina opció tria.
        System.out.printf("Selecciona una opció: ");
        int opcio = teclat.nextInt();

        // Condicions segons l'opció escollida.
        if (opcio == 1) {
            calcularTotal(); // Cridem el mètode calcularTotal() segons l'opció 1.
        }
    }

    // Creem el mètode calcularTotal per l'opció 1.
    public static double calcularTotal() {
        // Declarem una variable pel num de vegades.
        int numVegades = 0;

        // Demanem a l'usuari quantes vegades vol introduir el número.
        System.out.printf("¿Quantes vegades vols introduir els números? " +
                "(Mínim 3 vegades). ");
        numVegades = teclat.nextInt(); // Afegim l'input a la variable.

        // Demanem a l'usuari mínim 3 números decimals.
        do {
            // Condició per a mínim de vegades.
            if (numVegades < 3) {
                System.out.println("Tens que introduir almenys 3 números decimals.");
            }

            System.out.printf("Introdueix números decimals: ");
            numDecimals.add(teclat.nextDouble()); // Guardem
        } while (numVegades > 3);

        double suma = 0; // Declarem una variable per les sumes.

        // Recorrem l'ArrayList i anem sumant 1 en 1.
        for (int i = 0; i < numDecimals.size(); i++) {
            suma += numDecimals.get(i);
        }

        System.out.printf("El total gastat és: %\n €", suma);

        return suma; // Retornem suma.
    }
}