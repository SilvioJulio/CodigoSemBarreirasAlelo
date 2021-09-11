package br.com.aleocodigosembarreiras.aleloclasseseobjetos;

import java.time.LocalDate;


public class Pessoa {

      public String nome;
      public Integer dataNascimento;
      public double altura;



    void imprimirDados(){
        this.nome=nome;
        this.dataNascimento=dataNascimento;
        this.altura=altura;

    }
    void quantosAnosTereiNesseAno() {

        var ano = LocalDate.now().getYear();
        System.out.printf("Sua idade nesse ano será: %d",ano - this.dataNascimento);
    }

    @Override
    public String toString() {
        return "Dados da pessoa {" +
                "Nome:'" + nome + '\'' +
                ", DataNascimento:" + dataNascimento +
                ", Altura:" + altura +
                '}';
    }
}
