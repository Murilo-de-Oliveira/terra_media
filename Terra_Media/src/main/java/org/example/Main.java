package org.example;

public class Main {
    public static void main(String[] args) {
        //Criação dos personagens
        Arma arma1 = new Arma(
                "Picareta desgastada",
                false
        );
        Anao anao1 = new Anao(
                "Gimli",
                262,
                100,
                100,
                arma1,
                "Montanha Solitária"
        );
        Anao anao2 = new Anao(
                "Balin",
                180,
                100,
                80,
                "Khazad-dûm"
        );
        Arma arma2 = new Arma(
                "Arco recurvo",
                false
        );
        Elfo elfo1 = new Elfo(
                "Celebrimbor",
                947,
                100,
                arma2,
                "Eldamar"
        );
        Elfo elfo2 = new Elfo(
                "Galadriel",
                1040,
                100,
                "Rivendell"
        );
        Arma arma3 = new Arma(
                "Bastão desnecessariamente grande",
                true
        );
        Mago mago1 = new Mago(
                "Gandalf",
                100,
                100,
                arma3,
                "Cinzento"
        );
        Mago mago2 = new Mago(
                "Saruman",
                100,
                100,
                "Branco"
        );

        //Criação da classe terra média e adicionando personagem
        TerraMedia tm = new TerraMedia(anao1);

        //Uso dos métodos de adicionar e listar habitantes
        tm.addHabitante(elfo1);
        tm.addHabitante(mago1);
        tm.addHabitante(anao2);
        tm.addHabitante(elfo2);
        tm.addHabitante(mago2);
        tm.listarHabitantes();
    }
}