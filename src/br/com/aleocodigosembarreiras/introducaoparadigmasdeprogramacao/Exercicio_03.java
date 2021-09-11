package br.com.aleocodigosembarreiras.introducaoparadigmasdeprogramacao;

import java.util.Scanner;

public class Exercicio_03 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int contadorNumerosPares = 0;

        System.out.println("Informe a quantidade de numeros a serem listados.");
        int quantidadeNumerosSeraAddNaLista = teclado.nextInt();




        int numeros[] = new int[quantidadeNumerosSeraAddNaLista];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite o " + (i + 1) + "° numero: \n");
            numeros[i] = teclado.nextInt();

            if (numeros[i] % 2 == 0) {
                contadorNumerosPares++;

            }

        }

        System.out.printf( "Foi encontarado %d números pares",contadorNumerosPares);
    }

 }

