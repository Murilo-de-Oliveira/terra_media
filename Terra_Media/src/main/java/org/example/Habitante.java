package org.example;

abstract class Habitante {
    //Atributos
    public static int contador;
    protected int id;
    protected String nome;
    protected int idade;
    protected float energia;
    protected Arma arma;

    //Construtores
    public Habitante(String nome, int idade, float energia) {
        contador++; //incrementando contador da classe
        this.id = contador;
        this.nome = nome;
        this.idade = idade;
        this.energia = energia;
        //construtor sem arma
    }
    public Habitante(String nome, int idade, float energia, Arma arma) {
        contador++; //incrementando contador da classe
        this.id = contador;
        this.nome = nome;
        this.idade = idade;
        this.energia = energia;
        this.arma = arma;
        //construtor com arma
    }

    public Arma getArma() {
        return arma;
    }

    public void atacar(){
        this.arma.mostraInfo(); //mostra info da arma
        //se arma for mágica
        if(this.arma.isMagica() && this.energia >= 20){
            this.energia -= 20;
            System.out.println("Ataque realizado com arma mágica!");
        }
        //se arma for comum
        else if(!this.arma.isMagica() && this.energia >= 10){
            this.energia -= 10;
            System.out.println("Ataque realizado com arma comum!");
        }
    }
    public void mostraInfo(){
        System.out.println("Id: " + this.id);
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade + " anos");
        System.out.println("Energia: " + this.energia);
        //se tiver arma, mostra info da arma
        if(arma != null){
            this.arma.mostraInfo();
        }
    }
}
