import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String trabajador;
        double horasTrabajadas, horasPerdidas, horasExtra, bonos;

        char continuar = 's';

        //Usaremos el while para que el algoritmo corra cada vez que solicitemos nueva informacion de un trabajador.
        while (continuar == 's' || continuar == 'S') {
            System.out.println("Ingrese el nombre del trabajador:");
            trabajador = scanner.nextLine();

            System.out.println("Ingrese las horas trabajadas:");
            horasTrabajadas = scanner.nextDouble();

            System.out.println("Ingrese las horas trabajadas perdidas:");
            horasPerdidas = scanner.nextDouble();

            System.out.println("Ingrese las horas extra trabajadas:");
            horasExtra = scanner.nextDouble();

            System.out.println("Ingrese los ingresos por bonos:");
            bonos = scanner.nextDouble();

            // Aqui se calcula el valor final del sueldo en base a calculos matematicos
            double sueldoBase = horasTrabajadas * 7; // Suponiendo 7 soles por hora
            double descuentos = horasPerdidas * 7; // Suponiendo 7 soles de descuento por hora perdida, el precio es igual
            double sueldoTotal = sueldoBase + horasExtra * 10 + bonos - descuentos; //Las horas extra tienen un aumento, lo que hace que paguen 10 soles

            System.out.println("Boleta de " + trabajador);
            System.out.println("Horas trabajadas: " + horasTrabajadas);
            System.out.println("Horas perdidas: " + horasPerdidas);
            System.out.println("Horas extra: " + horasExtra);
            System.out.println("Bonos: S/" + bonos +" nuevos soles.");
            System.out.println("Sueldo total: S/ " + sueldoTotal+" nuevos soles.");

            System.out.println("\n¿Desea ingresar otro trabajador? (s/n):");
            continuar = scanner.next().charAt(0);
        }

        scanner.close();
    }
}