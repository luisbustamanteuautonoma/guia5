package com.mycompany.guia5;

public class Funciones {

    public static void contarDigitos(int numero, int cantidad) {
        if (numero == 0) {
            System.out.println("La cantidad de digitos del numero es " + cantidad);
            return;
        }
        numero = numero / 10;
        contarDigitos(numero, cantidad + 1);
    }

    public static void sumarDigitos(int numero, int suma) {
        if (numero == 0) {
            System.out.println("La suma de los digitos del numero es " + suma);
            return;
        }
        int resto = numero % 10;
        numero = numero / 10;
        sumarDigitos(numero, suma + resto);

    }

    public static int mcd(int numero1, int numero2) {
        if (numero2 == 0) {
            return numero1;
        }
        return mcd(numero2, numero1 % numero2);
    }

    public static void invertirCadena(String palabra, int i) {
        if (i >= 0) {
            System.out.print(palabra.charAt(i));
            invertirCadena(palabra, i - 1);
        }
    }
}
