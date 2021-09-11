package br.com.aleocodigosembarreiras.introducaoparadigmasdeprogramacao;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio_04 {

    //Escreva um algoritmo que leia números, insira em um array e após mostre o maior valor.

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);



        ArrayList<Integer> listaNumeros = new ArrayList<Integer>();

        var numeroMaior=0;
        var tamanho=0;
        var contador=0;

        System.out.println("Informe o tamanho do seu ArrayList:");
        tamanho = teclado.nextInt();

        for ( contador = 0; contador < tamanho; contador++) {
            listaNumeros.add(teclado.nextInt());
            System.out.printf("Digite o %d° número:\n",contador+1);

        }
        numeroMaior = listaNumeros.get(0);

        // Será verificado o número maior na lista dos números
        for (int i = 0; i < listaNumeros.size(); i++) {

            if (listaNumeros.get(i) > numeroMaior) {
                numeroMaior = listaNumeros.get(i);
            }
        }
        // Saída do resultado
        System.out.printf("Numero %d é maior:", numeroMaior);
        teclado.close();
    }

}
