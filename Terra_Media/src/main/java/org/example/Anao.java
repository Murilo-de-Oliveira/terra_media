package org.example;

public class Anao extends Habitante implements Mineracao{
    //Atributos
    private float altura;
    private String reino;

    //Construtores
    public Anao(String nome, int idade, float energia, float altura, String reino) {
        super(nome, idade, energia);
        this.altura = altura;
        this.reino = reino;
        //construtor sem arma
    }

    public Anao(String nome, int idade, float energia, float altura, Arma arma,String reino) {
        super(nome, idade, energia, arma);
        this.altura = altura;
        this.reino = reino;
        //construtor com arma
    }

    //Métodos
    @Override
    public void mostraInfo() {
        super.mostraInfo();
        System.out.println("Altura do anão: " + this.altura + " cm");
        System.out.println("Reino do anão: " + this.reino);
    }

    @Override
    public void minerar() {
        System.out.println(this.nome + " está minerando...");
    }
}
