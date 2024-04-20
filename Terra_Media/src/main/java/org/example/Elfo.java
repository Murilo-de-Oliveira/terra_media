package org.example;

public class Elfo extends Habitante implements Cura{
    //Atributo
    private String tribo;

    //Construtores
    public Elfo(String nome, int idade, float energia, String tribo) {
        super(nome, idade, energia);
        this.tribo = tribo;
        //construtor sem arma
    }

    public Elfo(String nome, int idade, float energia, Arma arma, String tribo) {
        super(nome, idade, energia, arma);
        this.tribo = tribo;
        //construtor com arma
    }

    //Métodos
    @Override
    public void mostraInfo() {
        super.mostraInfo();
        System.out.println("Tribo do elfo: " + this.tribo);
    }
    public void viajar(){
        System.out.println(this.nome + " está viajando...");
    }
    @Override
    public void curar() {
        //redução de energia em 10%
        this.energia += this.energia * 0.15f;
    }
}
