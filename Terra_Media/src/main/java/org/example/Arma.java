package org.example;

public class Arma {
    //Atributos
    private String nomeArma;
    private boolean magica;

    //Construtor
    public Arma(String nomeArma, boolean magica) {
        this.nomeArma = nomeArma;
        this.magica = magica;
    }

    //Getter
    public boolean isMagica() {
        return magica;
    }

    //Método
    public void mostraInfo(){
        System.out.println("Nome da arma: " + this.nomeArma);
        System.out.print("Tipo de arma: ");
        //Mostra se arma é mágica ou não baseado no getter
        if(isMagica()){
            System.out.println("Arma mágica");
        }
        else{
            System.out.println("Arma comum");
        }
    }
}
