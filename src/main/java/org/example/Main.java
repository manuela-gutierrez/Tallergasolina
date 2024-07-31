package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leerTeclado= new Scanner(System.in);
        //DECLARANDO

        String nombreConductor;
        double distancia;
        double consumoCombustibleX100KM;
        double precioCombustibleLitro=17000;
        double totalCombustible;
        double totalPrecio;

        //ENTRADAS DE VARIABLES
        System.out.print("Digite su nombre: ");
        nombreConductor= leerTeclado.nextLine();

        System.out.print("Digite la distancia del viaje en km");
        distancia= leerTeclado.nextDouble();

        System.out.print("Digitar cuanto combustible consumio en litros ");
        consumoCombustibleX100KM=leerTeclado.nextDouble();

        //OPERACIONES
        totalCombustible= (distancia/100)*consumoCombustibleX100KM;
        totalPrecio= distancia*precioCombustibleLitro;

        //IMPRIMIR RESULTADOS

        System.out.println("El consumo total de combustible es "+totalCombustible);
        System.out.println("El precio a pagar es "+totalPrecio);


















    }
}