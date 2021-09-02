package br.com.alelo.codigo.sem.barreiras;

import java.util.Scanner;

public class Estrutura_Controle_Repeticao_Parte1 {
    public static void main(String[] args) {
        Estrutura_Controle_Repeticao_Parte1 teste = new Estrutura_Controle_Repeticao_Parte1();
        //teste.Exercicio2_Parte2();
         teste.Exercicio1_Parte1();

    }
    public void Exercicio1_Parte1(){
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        Scanner tc = new Scanner(System.in);

        double somaNumeros = 0;
        int contador=1;
        int numeros = 0;
        
        while (contador <=3) {

            System.out.println("Digite o " + contador + "º número");
            numeros = tc.nextInt();
            contador++;
        }
        for (int i = 1; i<=3;i++){


            if (numeros > maior) {
                maior = numeros;
            }

            if (numeros < menor) {
                menor = numeros;
            }
            if (numeros > maior) {
                maior = numeros;
            }

            if (numeros < menor) {
                menor = numeros;
            }

            somaNumeros = somaNumeros + numeros;

        }
        // Saída dos dados com resultados
        System.out.println("Maior número " + maior);
        System.out.println("Menor número " + menor);
        System.out.println("Média " + somaNumeros / 3);
        tc.close();



    }
    public void Exercicio2_Parte2(){
        // Estrutura de repetição que calcule o fatorial de um número.

            int fatorial = 1;
            int numero = 9;
            for (int i = 1; i <= numero; i++) {
                fatorial = fatorial * i;

            }
            System.out.print(fatorial);
        }

    }

