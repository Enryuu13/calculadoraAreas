package com.calculadora;

import java.util.Scanner;

public class Main {

    public static double calcularAreaCirculo(int radio) {
        return Math.PI * radio * radio;
    }

    public static double calcularAreaCuadrado(int lado) {
        return lado * lado;
    }

    public static double calcularAreaRectangulo(int base, int altura) {
        return base * altura;
    }

    public static double calcularAreaTriangulo(int base, int altura) {
        return (base * altura) / 2.0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Calcular área del círculo");
            System.out.println("2. Calcular área del cuadrado");
            System.out.println("3. Calcular área del rectángulo");
            System.out.println("4. Calcular área del triángulo");
            System.out.println("5. Salir");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el radio del círculo: ");
                    int radio = scanner.nextInt();
                    System.out.println("Área del círculo: " + calcularAreaCirculo(radio));
                    break;
                case 2:
                    System.out.print("Ingrese el lado del cuadrado: ");
                    int lado = scanner.nextInt();
                    System.out.println("Área del cuadrado: " + calcularAreaCuadrado(lado));
                    break;
                case 3:
                    System.out.print("Ingrese la base del rectángulo: ");
                    int baseRect = scanner.nextInt();
                    System.out.print("Ingrese la altura del rectángulo: ");
                    int alturaRect = scanner.nextInt();
                    System.out.println("Área del rectángulo: " + calcularAreaRectangulo(baseRect, alturaRect));
                    break;
                case 4:
                    System.out.print("Ingrese la base del triángulo: ");
                    int baseTri = scanner.nextInt();
                    System.out.print("Ingrese la altura del triángulo: ");
                    int alturaTri = scanner.nextInt();
                    System.out.println("Área del triángulo: " + calcularAreaTriangulo(baseTri, alturaTri));
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }

        } while (opcion != 5);

        scanner.close();
    }
}

