package br.com.aleocodigosembarreiras.aleloclasseseobjetos;

public class Elevador {
    /**
     *
     * Crie uma classe denominada Elevador para armazenar as informações de um elevador dentro de um prédio.
     * A classe deve armazenar o andar atual (térreo = 0), total de andares no prédio (desconsiderando o térreo),
     * capacidade do elevador e quantas pessoas estão presentes nele.
     * A classe deve também disponibilizar os seguintes métodos:
     *
     */
    Integer andarAtual = 0;

    Integer totalDeAndares;

    Integer capacidade;

    Integer ocupcaoAtual = 0;

    public Elevador(Integer totalDeAndares, Integer capacidade) {
        this.totalDeAndares = totalDeAndares;
        this.capacidade = capacidade;
    }

    void entrar() {
        if (this.ocupcaoAtual < this.capacidade) {
            this.ocupcaoAtual++;
        } else {
            System.out.println("Elevador na capacidade máxima. Vá de escada.");
        }
    }

    void sair() {
        if (this.ocupcaoAtual > 0) {
            this.ocupcaoAtual--;
        }
    }

    void subir() {
        if (this.andarAtual < this.totalDeAndares) {
            this.andarAtual++;
        }
    }

    void descer() {
        if (this.andarAtual > 0) {
            this.andarAtual--;
        }
    }

    @Override
    public String toString() {
        return "Elevador{" +
                "andarAtual=" + andarAtual +
                ", totalDeAndares=" + totalDeAndares +
                ", capacidade=" + capacidade +
                ", ocupcaoAtual=" + ocupcaoAtual +
                '}';
    }


}
