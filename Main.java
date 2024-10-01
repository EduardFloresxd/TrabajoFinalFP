import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] trabajador = new String[2]; // Arreglo para recolectar la informacion de 10 trabajadores
        double[] horasTrabajadas = new double[2];
        double[] horasPerdidas = new double[2];
        double[] horasExtra = new double[2];
        double[] bonos = new double[2];

        char continuar = 's';

        while (continuar == 's' || continuar == 'S') {

            for (int i = 0; i < trabajador.length; i++) {
                System.out.println("Ingrese el nombre del trabajador " + (i+1) + ":");
                trabajador[i] = scanner.nextLine();

                System.out.println("Ingrese las horas trabajadas:");
                horasTrabajadas[i] = scanner.nextDouble();
                scanner.nextLine(); // Consume el salto de línea

                System.out.println("Ingrese las horas de trabajo perdidas:");
                horasPerdidas[i] = scanner.nextDouble();
                scanner.nextLine(); // Consume el salto de línea

                System.out.println("Ingrese las horas extra trabajadas:");
                horasExtra[i] = scanner.nextDouble();
                scanner.nextLine(); // Consume el salto de línea

                System.out.println("Ingrese los ingresos por bonos:");
                bonos[i] = scanner.nextDouble();
                scanner.nextLine(); // Consume el salto de línea

                System.out.println(" ");
            }

            for (int i = 0; i < trabajador.length; i++) {

                double sueldoBase = horasTrabajadas[i] * 7; // Suponiendo 7 soles por hora
                double descuentos = horasPerdidas[i] * 7; // Suponiendo 7 soles de descuento por hora perdida, el precio es igual
                double pagoHorasExtra = horasExtra[i] * 10; // Calculamos cuanto le deben pagar por hora extra
                double sueldoTotal = sueldoBase + pagoHorasExtra + bonos[i] - descuentos; //Las horas extra tienen un aumento, lo que hace que paguen 10 soles

                System.out.println("-----------------------------------------------");
                System.out.println("|   Boleta de " + trabajador[i]);
                System.out.println("|   Horas trabajadas: " + horasTrabajadas[i]);
                System.out.println("|   Horas perdidas: " + horasPerdidas[i]);
                System.out.println("|   Horas extra: " + horasExtra[i]);
                System.out.println("|   Bonos: S/" + bonos[i] +" nuevos soles.");
                System.out.println("|   Sueldo total: S/ " + sueldoTotal+" nuevos soles.");
                System.out.println("-----------------------------------------------");
                System.out.println(" ");


            }

            System.out.println("\n¿Desea calcular las boletas de otros 10 trabajadores? (s/n):");
            continuar = scanner.next().charAt(0);
            scanner.nextLine(); // Consume el salto de línea restante
        }

        scanner.close();
    }
}