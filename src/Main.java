import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

/*
@autor Iván Yanni Borgez Bautista
@email borgezyanni@gmail.com
@descripción práctica de conjuntos 2
*/

public class Main {

    public static void main(String[] args) {
        int a = 0;

        SortedSet<Integer> conjuntoA = new TreeSet<>();
        SortedSet<Integer> conjuntoB = new TreeSet<>();
        SortedSet<Integer> conjuntoC = new TreeSet<>();

        while (a < 1000) {
            a++;
            conjuntoA.add(a);

            if (a % 3 == 0) {
                conjuntoB.add(a);
            }

            if (a % 5 == 0) {
                conjuntoC.add(a);
            }

        }

        Iterator valoresConjuntoA = conjuntoA.iterator();
        System.out.println("Los elementos del conjunto A son: ");
        while (valoresConjuntoA.hasNext()) {
            System.out.println(valoresConjuntoA.next());
        }

        System.out.println();

        Iterator valoresConjuntoB = conjuntoB.iterator();
        System.out.println("Los elementos del conjunto B son: ");
        while (valoresConjuntoB.hasNext()) {
            System.out.println(valoresConjuntoB.next());
        }

        System.out.println();

        Iterator valoresConjuntoC = conjuntoC.iterator();
        System.out.println("Los elementos del conjunto C son: ");
        while (valoresConjuntoC.hasNext()) {
            System.out.println(valoresConjuntoC.next());
        }

        int tamañoA = conjuntoA.size();
        int tamañoB = conjuntoB.size();
        int tamañoC = conjuntoC.size();

        System.out.println();

        System.out.println("El conjunto A tiene " + tamañoA + " elementos.");
        System.out.println("El conjunto B tiene " + tamañoB + " elementos.");
        System.out.println("El conjunto C tiene " + tamañoC + " elementos.");

        conjuntoB.addAll(conjuntoC);
        System.out.println("Los elementos de la union del conjunto B y C son: " + conjuntoB);
        System.out.println("La union del conjunto B y C tiene " + conjuntoB.size() + " elementos.");
    }
}