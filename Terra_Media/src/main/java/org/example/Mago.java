package org.example;

public class Mago extends Habitante implements Cura, Feitico{
    //Atributos
    private String cor;

    //Construtores
    public Mago(String nome, int idade, float energia, String cor) {
        super(nome, idade, energia);
        this.cor = cor;
        //construtor sem arma
    }

    public Mago(String nome, int idade, float energia, Arma arma,String cor) {
        super(nome, idade, energia, arma);
        this.cor = cor;
        //construtor com arma
    }

    //Métodos
    @Override
    public void mostraInfo() {
        super.mostraInfo();
        System.out.println("Cor do mago: " + this.cor);
    }

    @Override
    public void lancarFeitico() {
        //decremento de energia em 10%
        this.energia -= this.energia * 0.1f;
        System.out.println(this.nome + " lançou um feitiço");
    }

    @Override
    public void curar() {
        //aumento da energia em 15%
        this.energia += this.energia * 0.15f;
    }
}
