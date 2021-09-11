package br.com.aleocodigosembarreiras.aleloclasseseobjetos;

import java.util.ArrayList;

/**
 * Crie uma classe Agenda que pode armazenar 10 pessoas e que seja capaz de realizar as seguintes operações:
 *
 * void armazenaPessoa(String nome, int anoNascimento, float altura);
 * void removePessoa(String nome);
 * int buscaPessoa(String nome); // informa em que posição da agenda está a pessoa
 * void imprimeAgenda(); // imprime os dados de todas as pessoas da agenda
 * void imprimePessoa(int index); // imprime os dados da pessoa que está na posição “
 */

class Agenda {


    Pessoa[] pessoas = new  Pessoa[5];

    String nomeDaAgenda;

    public Agenda(String nomeDaAgenda) {
        this.nomeDaAgenda = nomeDaAgenda;
    }

     private int verificarProximoIndiceVazio() {
        for (int i = 0; i < this.pessoas.length; i++) {
            if (this.pessoas[i] == null) {
                return i;
            }
        }
        return -1;
     }

    void armazenaPessoa(String nome, int dataNascimento, float altura){

        var indiceParaGravarAhNovaPessoa = this.verificarProximoIndiceVazio();

        if (indiceParaGravarAhNovaPessoa == -1) {
            System.out.printf("Você não pode armazenar mais do que 5 pessoas. A pessoa %s não foi adicionada.%n", nome);
            return;
        }

        var pessoa = new Pessoa();
        pessoa.nome = nome;
        pessoa.dataNascimento=dataNascimento;
        pessoa.altura = altura;
        this.pessoas[indiceParaGravarAhNovaPessoa] = pessoa;
    }
      int  pesquisarPessoa (String nome){

          for (int i = 0; i < this.pessoas.length; i++) {
              if (nome.equals(this.pessoas[i].nome)) {
                  return i;
              }
          }

          return -1;

    }
    void removePessoa(String nome){
        var RemoverPessoa = this.pesquisarPessoa(nome);
        if (RemoverPessoa > -1) {
            this.pessoas[RemoverPessoa] = null;
            System.out.printf("A pessoa %s foi removida com sucesso. %n", nome);
        } else {
            System.out.printf("Pessoa %s não encontrada. %n", nome);
        }

    }

    void imprimeAgenda() {
        for (int i = 0; i < this.pessoas.length; i++) {
            this.imprimePessoa(i);
        }
    }

    void imprimePessoa(int indice) {
        System.out.println(this.pessoas[indice]);
    }
}
