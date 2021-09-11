package br.com.aleocodigosembarreiras.aulaintrodutória;

import java.util.Scanner;

public class Estruturas_Controle_Decisão_Parte1 {
    static Scanner tc = new Scanner(System.in);

    public static void main(String[] args) {
        Estruturas_Controle_Decisão_Parte1 atividades = new Estruturas_Controle_Decisão_Parte1();
        // Menu para usuário escolher opção do exercício ao qual quer  startar
        int opcao;
        System.out.println("Quais  exercício deseja executar:");
        System.out.println("Para Exercício1   digite => 1 :");
        System.out.println("Para Exercício2   digite => 2 :");
        System.out.println("Para Exercício3   digite => 3 :");
        System.out.println("Para Exercício4   digite => 4 :");
        System.out.println("Para Exercício5   digite => 5 :");
        System.out.println("Para Exercício6   digite => 6 :");
        System.out.println("Para sair de menu digite => 7 :");
        opcao = tc.nextInt();

        //Foi criado estrutura de decisão com if, cada opção corresponde ao uma exercício que será iniciado
        if (opcao == 1) {
            System.out.println("Executando exercício1...");
            //tc.nextLine();
            atividades.Exercicio1_Parte1();
        }
        if (opcao == 2) {
            System.out.println("Executando exercício2...");
            //tc.nextLine();
            atividades.Exercicio2_Parte1();
        }
        if (opcao == 3) {
            System.out.println("Executando exercício3...");
            //tc.nextLine();
            atividades.Exercicio3_Parte1();
        }
        if (opcao == 4) {
            System.out.println("Executando exercício4...");
            //tc.nextLine();
            atividades.Exercicio4_Parte1();
        }
        if (opcao == 5) {
            System.out.println("Executando exercício5...");
            //tc.nextLine();
            atividades.Exercicio5_Parte1();
        }
        if (opcao == 6) {
            System.out.println("Executando exercício6...");
            //tc.nextLine();
            atividades.Exercicio6_Parte1();
        }
        if (opcao == 7) {
            System.out.println(" Menu finalizado !!");
        }
    }


    public void Exercicio1_Parte1() {
        int numero;
        System.out.println("Digite um número:");
        numero = tc.nextInt();

        // Laço vai ser iniciado com for, e if que são as estruturas de decisão vão verificar de acordo a condição
        // se número dividido por 2 seu resto for 0 será número par, caso contrário será impa
        for (int i = 0; i < numero; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " É um numero  par");
            } else {
                System.out.println(i + " É numero impa");
            }

        }

    }

    public void Exercicio2_Parte1() {
//            Elabore um algoritmo que dada a idade de um nadador classifique-o em uma das seguintes categorias:
//
//            Infantil A = 5 a 7 anos
//            Infantil B = 8 a 11 anos
//            Juvenil A = 12 a 13 anos
//            Juvenil B = 14 a 17 anos
//           Adultos = Maiores de 18 anos

        // Entra de dados
        System.out.println("Qual é sua idade:");
        int idade = tc.nextInt();


        // Estrutura de controle / decisão através dos if vão identificar as classificação conforme a
        // condição descrita que vai gerar um resultado booleano
        if (idade <= 7) {
            System.out.println("Nadador infantíl A ");

        }
        if (idade >= 8 && idade <= 11) {
            System.out.println("Nadador infantíl B ");
        }
        if (idade >= 12 && idade <= 13) {
            System.out.println("Nadador Juvenil A ");
        }
        if (idade >= 14 && idade <= 17) {
            System.out.println("Nadador Juvenil B ");
        }
        if (idade >= 18) {
            System.out.println("Nadador Adultos");
        }

    }

    public void Exercicio3_Parte1() {
        //Entrada de dados
        System.out.println("Digite o primeiro numero:");
        int numero1 = tc.nextInt();
        System.out.println("Digite o segundo numero:");
        int numero2 = tc.nextInt();

        // Estrutura de controle / decisão
        if (numero1 > numero2) {
            System.out.println(numero1 + " é maior que o " + numero2);
        } else {
            System.out.println(numero2 + " é maior que o " + numero1);
        }

    }

    public void Exercicio4_Parte1(){



            int maior = Integer.MIN_VALUE;
            int menor = Integer.MAX_VALUE;

            double somaNumeros = 0;
            int numeros;
            int contador = 4;


            for (int i = 1; i<=contador;i++){
                System.out.println("Digite o " +i+ "º número");
                numeros = tc.nextInt();

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
    public void Exercicio5_Parte1(){


        int PrimeiroNumero ;
        int SegundoNumero ;
        int opcao ;
        int subritacao = 0, divisao = 0, adicao=0,multiplicacao;

        System.out.println("1- Prescione para adição :");
        System.out.println("2- Prescione para multiplicação :");
        System.out.println("3- Prescione para divisão :");
        System.out.println("4- Prescione para subritação:");
        opcao = tc.nextInt();

        System.out.println("Informe o primeiro númeor");
        PrimeiroNumero = tc.nextInt();
        System.out.println("Informe o primeiro númeor");
        SegundoNumero = tc.nextInt();
        if (divisao==0) {
            System.out.println("0 não pode ser dividio, favor digitar número válido");
        }

        switch (opcao) {
            case 1: {
                adicao = PrimeiroNumero + SegundoNumero;
                System.out.println("Resultado da adição: " + adicao);
                break;
            }
            case 2: {

                divisao = PrimeiroNumero / SegundoNumero;
                System.out.println("Resultado da divisão: " + divisao);
                break;
            }
            case 3 : {
                multiplicacao = PrimeiroNumero * SegundoNumero;
                System.out.println("Resultado da mutiplicação" + multiplicacao);
                break;
            }
            default:
                System.out.println("Operador não exite, tente oprador váido por favor");
        }
    }

    public void Exercicio6_Parte1(){

        System.out.println(" Jogador 1 - Digite 0 para PEDRA, 1 para PAPEL ou 2 para TESOURA: ");
        var jogador1 = tc.nextInt();

        System.out.println("Jogador 2 - Digite 0 para PEDRA, 1 para PAPEL ou 2 para TESOURA: ");
        var jogador2 = tc.nextInt();

        if (jogador1 == jogador2)
            System.out.println("Empate");
        else if (jogador1 - jogador2 == -2 || jogador1 - jogador2 == 1)
            System.out.println("Jogador 1 venceu!");
        else
            System.out.println("Jogador 2 venceu!");


         tc.close();


    }

}




