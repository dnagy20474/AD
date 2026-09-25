package prueba;

import java.util.*;

public class Exercici3 {

    // Declarem es programa fora del main, per a poder emprar-lo a tota sa clase.
    static Scanner sc = new Scanner(System.in);

    static void main() {

        // Variables del exercici.
        double preuBillet = 0.0;
        double dinersEstalviats = 0.0;

        // Demanem al usuari datos:
        System.out.printf("¿Quant costa el bitllet? ");
        preuBillet = sc.nextDouble();

        System.out.printf("¿Quants diners tens estalviats? ");
        dinersEstalviats = sc.nextDouble();

        // Cridem el métode per a comprobar que no sigui menor o igual a 0.

        if (!majorAZero(preuBillet, dinersEstalviats)) {
            sc.close();
        }
        // Condicions per comprar el billet.
        if (dinersEstalviats >= preuBillet) {
            System.out.printf("Bon viatge! Pots comprar el bitllet");
        } else {
            // Calculem la resta que ens queda per poder comprar el billet.
            double resta = preuBillet - dinersEstalviats;

            System.out.printf("No tens prou diners. Et falten " + resta + "€ para poder viatjar.");

            System.out.println(); // espai de línea.
            // Mostrem el resultat específic que ens demana l'enunciat.
            System.out.printf("Valor %.2f €  \n", resta);
        }
    }

    // Creem métode per comprobar que sigui major a 0.
    private static boolean majorAZero(double preuBillet, double dinersEstalviats) {
        if (dinersEstalviats <= 0) {
            System.out.println("Tens que intruduir un valor positiu, major a 0!");
        }
        return false;
    }
}
