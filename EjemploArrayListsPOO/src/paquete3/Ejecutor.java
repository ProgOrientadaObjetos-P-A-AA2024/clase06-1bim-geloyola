package paquete3;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejecutor {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ArrayList<Computador> computadoras = new ArrayList<>();

        int compu;
        String marcaCompu;
        String marcaPro;
        String marcaMe;
        double costoPro;
        double costoMe;

        System.out.println("Ingrese la cantidad de computadoras vendidas:");
        compu = leer.nextInt();

        System.out.println("--------------------");

        leer.nextLine();

        for (int i = 0; i < compu; i++) {
            System.out.println("Marca de la computadora: ");
            marcaCompu = leer.nextLine();
            System.out.println("Marca del procesador: ");
            marcaPro = leer.nextLine();
            System.out.println("Costo del procesador: ");
            costoPro = leer.nextDouble();
            System.out.println("Marca de la memoria: ");
            marcaMe = leer.nextLine();
            System.out.println("Costo de la memoria; ");
            costoMe = leer.nextDouble();

            Memoria memo1 = new Memoria(marcaMe, costoMe);
            Procesador pro1 = new Procesador(marcaPro, costoPro);

            Computador com = new Computador(marcaCompu, pro1, memo1);
            com.obtenerCalcularCostoComputador();
            computadoras.add(com);

            leer.nextLine();

            Venta venta1 = new Venta();
            venta1.establecerComputadoras(computadoras);
            venta1.calcularValorVenta();

            System.out.printf(" %s\n ", venta1);
        }
    }
}
