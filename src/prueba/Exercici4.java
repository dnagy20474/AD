package prueba;

import java.util.*;

public class Exercici4 {

    static void main() {

        // Variable de Scanner.
        Scanner teclat = new Scanner(System.in);

        // Variable per l'opció.
        int opcio = 0;

        // Menú del programa.
        do {
            // Mostrem les opcións del menú a l'usuari.
            System.out.println("1.- Llegir un missatge. ");
            System.out.println("2.- Mostra el missatge per pantalla.");
            System.out.println("3.- Sortir" + "\n");

            System.out.printf("Selecciona una opció: ");
            opcio = teclat.nextInt();

            System.out.println(); // Salt de línia.
        } while (opcio != 3);

    }
}
