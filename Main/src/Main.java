public class Main {
    public static void main(String[] args) {

        // 1. Realizar un programa que imprima en pantalla su nombre y su correo
        // electrónico
        Print p = new Print();
        System.out.println("nombre: " + p.nombre + "\n" + "Correo: " + p.correo + "\n");

        // 2. Realizar un programa que imprima los números del 1 al 10 utilizando
        // ciclos.

        System.out.println("Numeros del 1 al 10");
        for (int i = 1; i < 10; i++) {
            System.out.println(i);
        }

        System.out.println("\n");

        // 3. Realizar un programa que imprima los números pares del 2 al 10 utilizando
        // ciclos.

        int pares = 2;

        System.out.println("Numeros pares del 2 al 10");
        while (pares % 2 == 0 && pares <= 10) {
            System.out.println(pares);

            pares += 2;
        }
        System.out.println("\n");

        // 4. Realizar un programa que imprima la sumatoria de los números del 1 al 20
        // utilizando ciclos.

        System.out.println("Suma de numeros del 1 al 20");
        int suma = 0;
        for (int i = 1; i <= 20; i++) {
            System.out.print(suma + i + "\n");
            suma = suma + i;
        }
        System.out.println("\n");

        // 5. Realizar un programa que imprima las tablas de multiplicar del 2 al 10
        // utilizando ciclos anidados..

        int tabla = 2;

        for (int x = 1; x < 10; x++) {

            for (int i = 1; i <= 12; i++) {
                System.out.println(tabla * i);
            }
            System.out.println("\n");
            tabla += 1;
        }

    }
}
