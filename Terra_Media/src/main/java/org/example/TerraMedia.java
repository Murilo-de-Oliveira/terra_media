package org.example;

public class TerraMedia {
    //Array de habitantes
    private Habitante[] herois = new Habitante[10];

    //Construtor
    public TerraMedia(Habitante heroi) {
        this.herois[0] = heroi;
    }

    //Métodos
    public void addHabitante(Habitante habitante){
        //for percorre o array
        for(int i = 0; i < herois.length; i++){
            //se for nulo, adiciona o habitante
            if(herois[i] == null){
                herois[i] = habitante;
                break;
            }
        }
    }

    public void listarHabitantes(){
        //percorre o array de habitantes
        for(Habitante habitante : herois){
            //se habitante for nulo, não mostra
            if(habitante != null){
                //switch de habitantes e execução de métodos
                switch (habitante) {
                    //se classe for anão
                    case Anao anao -> anao.minerar();
                    //se classe for elfo
                    case Elfo elfo -> {
                        elfo.viajar();
                        elfo.curar();
                    }
                    //se classe for mago
                    case Mago mago -> {
                        mago.curar();
                        mago.lancarFeitico();
                    }
                    //caso a classe não exista
                    default -> {
                        System.out.println("Habitante inválido");
                    }
                }
                //se tiver arma, ataca
                if(habitante.getArma() != null){
                    habitante.atacar();
                }
                habitante.mostraInfo();
                System.out.println("-----------------");
            }
        }
    }
}
