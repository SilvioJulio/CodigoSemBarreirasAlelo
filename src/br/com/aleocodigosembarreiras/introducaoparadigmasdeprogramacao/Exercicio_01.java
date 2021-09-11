package br.com.aleocodigosembarreiras.introducaoparadigmasdeprogramacao;

import java.util.ArrayList;
import java.util.Scanner;


public class Exercicio_01 {
    /**
     * Escreva um algoritmo que leia números insira em um array e
     * após mostre os números informados na tela.
     */
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        ArrayList numeros = new ArrayList<Integer>();

        var prosesguirProgrma = true;

        while (prosesguirProgrma){
            System.out.println("Digite um número:");
            numeros.add(teclado.nextInt());


            System.out.println("Deseja adicionar mais um número? [s], [n]");
            if (teclado.next().charAt(0) == 'n') {
                prosesguirProgrma = false;
            }
        }

        System.out.println(numeros);
        teclado.close();
        }


    }


