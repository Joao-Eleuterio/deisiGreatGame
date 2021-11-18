package pt.ulusofona.lp2.deisiGreatGame;

public class Ferramenta {
    int id;
    String titulo;

    public Ferramenta(int id) {
        this.id = id;
        switch (id) {
            case 0 -> this.titulo = "Herança";
            case 1 -> this.titulo = "Programação funcional ";
            case 2 -> this.titulo = "Testes unitários";
            case 3 -> this.titulo = "Tratamento de Excepções";
            case 4 -> this.titulo = "IDE";
            case 5 -> this.titulo = "Ajuda Do Professor";
        }
    }
}
