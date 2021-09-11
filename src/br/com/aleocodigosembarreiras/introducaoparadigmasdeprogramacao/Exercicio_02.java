package br.com.aleocodigosembarreiras.introducaoparadigmasdeprogramacao;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio_02 {

    public static void main(String[] args) {


        Scanner teclado = new Scanner(System.in);

        int[] numeros = new int[8];
        int totalNumerosNegativos = 0;

        ArrayList<Integer> numeroNegativos = new ArrayList<Integer>();

        for (int i = 0; i < numeros.length; i++) {

            // Dentro do loop o usuário pode continuar digitando números inteiros ou negativos
            // Caso queira encerrar o programa digita [0]
            System.out.println("Digite números inteiros ou negativos:");
            System.out.println("Caso deseje encerrar o progrma digita => [0]");

            System.out.print("-> ");
            numeros[i] = teclado.nextInt();
            // É feito a verificação se numero digitado é negtivo
            if (numeros[i] < 0) {
                numeroNegativos.add(numeros[i]);
              // Contador que add números negativos   
                totalNumerosNegativos++;

            }
            // Nesse estrutura de decisão, quando usuário digita zero é encerrado o programa
            if (numeros[i] == 0) {
                // mostrando os números
                System.out.printf("Foi digitados %d números negativos\n", totalNumerosNegativos);
                break;
            }

        }

    }

}