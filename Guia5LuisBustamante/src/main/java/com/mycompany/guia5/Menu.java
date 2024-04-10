package com.mycompany.guia5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    static Scanner scanner = new Scanner(System.in);

    public static void menu() {
        int op = 0;

        do {
            System.out.println("=====================");
            System.out.println("Guia 5");
            System.out.println("=====================");
            System.out.println("1. Contar digitos");
            System.out.println("2. Suma de digitos");
            System.out.println("3. Maximo Comun Divisor");
            System.out.println("4. Invertir cadena");
            System.out.println("5. Cerrar programa");
            System.out.println("Digite su opcion:");
            op = scanner.nextInt();
            try {
                switch (op) {
                    case 1:
                        System.out.println("========Contar digitos========");
                        System.out.println("Ingrese numero: ");
                        int numeroa = scanner.nextInt();
                        Funciones.contarDigitos(numeroa, 0);
                        break;
                    case 2:
                        System.out.println("========Suma de digitos========");
                        System.out.println("Ingrese numero: ");
                        int numerob = scanner.nextInt();
                        Funciones.sumarDigitos(numerob, 0);
                        break;
                    case 3:
                        System.out.println("========Maximo Comun Divisor========");
                        System.out.println("Ingrese numero: ");
                        int numeroc = scanner.nextInt();
                        System.out.println("Ingrese otro numero: ");
                        int numerod = scanner.nextInt();
                        int mcd = Funciones.mcd(numeroc, numerod);
                        System.out.println("El maximo comun divisor de los numeros es " + mcd);
                        break;
                    case 4:
                        System.out.println("========Invertir cadena========");
                        scanner.nextLine();
                        System.out.println("Ingrese la cadena a invertir: ");
                        String palabra = scanner.nextLine();
                        System.out.println("La cadena invertida es: ");
                        Funciones.invertirCadena(palabra, palabra.length() - 1);  
                        System.out.println("");
                        break;
                    case 5:
                        break;
                    default:
                        System.out.println("Opcion invalida. Ingrese nuevamente");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Opcion invalida. Ingrese nuevamente");
                scanner.nextLine();
            }
        } while (op != 5);

        System.out.println("Hasta pronto");
    }
}
