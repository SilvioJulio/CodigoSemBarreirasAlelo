package br.com.aleocodigosembarreiras.aleloclasseseobjetos;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        var pessoa = new Pessoa();
        pessoa.nome ="Silvio Julio";
        pessoa.altura= 1.8;
        pessoa.dataNascimento=1983;
        System.out.println(pessoa);
        pessoa.quantosAnosTereiNesseAno();
        pessoa.imprimirDados();



    }
}
