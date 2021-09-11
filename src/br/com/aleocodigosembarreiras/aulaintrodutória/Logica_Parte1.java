package br.com.aleocodigosembarreiras.aulaintrodutória;

import java.util.Scanner;

class Logica_Parte1 {

    static  Scanner tc =new Scanner(System.in);
    public static void main(String[] args) {

       Logica_Parte1 teste = new Logica_Parte1();
        // Menu para usuário escolher opção do exercício ao qual quer  startar
        var opcao = 0;
        System.out.println("Quais  exercício deseja executar:");
        System.out.println("Para Exercício1   digite => 1 :");
        System.out.println("Para Exercício2   digite => 2 :");
        System.out.println("Para Exercício3   digite => 3 :");
        System.out.println("Para Exercício4   digite => 4 :");
        System.out.println("Para sair de menu digite => 5 :");
        opcao = tc.nextInt();

        //Foi criado estrutura de decisão com if, cada opção corresponde ao uma exercício que será iniciado
        if(opcao ==1){
             System.out.println("Executando exercício1...");
             //tc.nextLine();
             teste.Exercicio1();
        }if(opcao ==2){
            System.out.println("Executando exercício2...");
            //tc.nextLine();
            teste.Exercicio2();
        }if(opcao ==3){
            System.out.println("Executando exercício3...");
            //tc.nextLine();
            teste.Exercicio3();
        }if(opcao ==4){
            System.out.println("Executando exercício3...");
            //tc.nextLine();
            teste.Exercicio4();
        }
         if(opcao ==5){
            System.out.println(" Menu finalizado !!");
         }
        }


    public void Exercicio1(){
        /**
         *
         * Escreva um algoritmo que armazene o valor 99 em uma variável Y e o valor 11 em uma variável Z.
         * A seguir (utilizando apenas atribuições entre variáveis) troque os
         * seus conteúdos fazendo com que o valor que está em Y passe para Z e vice-versa. Ao final,
         * escrever os valores que ficaram armazenados nas variáveis.
         *
         */
        //Problema 1 do execício aula2 resolvido
        var y = 99;
        var z = 11;
        var aux =0;

        // Processo da troca dos valors das  variávies
        aux = y;
        y = z;
        z = aux ;


        System.out.println("Resultado da troca das variáveis:");
        System.out.println(" Valor da variáviel Z = 11, agora é: " + z  );
        System.out.println(" Valor da variáviel Y = 99, agora é: " + y );
    }
    public void Exercicio2 (){

        System.out.println("Informe um numero:");
        var n = tc.nextInt();
        System.out.println("O antecessor de "+ n + " é:");
        System.out.println(n-1);

    }
    public void Exercicio3(){
        /**
         * Solução para encontra a área do retângulo
         */


        //Entrada de dados
        System.out.println("Digite o valor da base do retâmgulo:");
        double bsae = tc.nextDouble();
        System.out.println("Digite o valor da altura retâmgulo: ");
        double altura = tc.nextDouble();

        //Cálculo para encontra área do retângulo
        double resultado= bsae * altura;

        System.out.println("Área do retângulo:" + resultado);
         tc.close();
    }
    public void Exercicio4 (){
        /**
         *
         * Escreva um algoritmo para ler o número total de eleitores de um município,
         * o número de votos brancos, nulos e válidos.
         * Calcular e escrever o percentual que cada um representa em relação ao total de eleitores.
         *
         */

        double totalEleitor;
        double votosBranco;
        double votosNulos;
        double votosValidos=0;

        // Entrada de dados
        System.out.println("Informe o número total de eleitores:");
        totalEleitor = tc.nextDouble();
          System.out.println("Informe o número votos em branco:");
          votosBranco = tc.nextDouble();
        System.out.println(" Informe o número votos em nulos:");
        votosNulos = tc.nextDouble();
        System.out.println(" Informe o número votos Válidos:");
        votosValidos = tc.nextDouble();

        // Execultando os cáculos para gera dados dos votos votos brancos, nulos e válidos.
        double porcetagemvotosBranco = (votosBranco*100)/totalEleitor;
        double porcetagemvotosNulos = (votosNulos*100)/totalEleitor;
        double porcetagemvotosValidos = (votosValidos*100)/totalEleitor;

        //Saída dos resultados
        System.out.println(" Pocetagem dos votos em banco:"+ porcetagemvotosBranco+"%");
        System.out.println(" Pocetagem dos votos nulos:"+ porcetagemvotosNulos+"%");
        System.out.println(" Pocetagem dos votos validosS:"+ porcetagemvotosValidos+"%");
        tc.close();
    }
}
