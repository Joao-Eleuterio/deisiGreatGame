package pt.ulusofona.lp2.deisiGreatGame;

public class Abismo {
    int id;
    String titulo;

    public Abismo(int id) {
        this.id = id;
        switch (id) {
            case 0 -> this.titulo = "Erro de sintaxe";
            case 1 -> this.titulo = "Erro de lógica";
            case 2 -> this.titulo = "Exception";
            case 3 -> this.titulo = "File Not Found Exception";
            case 4 -> this.titulo = "Crash (aka Rebentanço)";
            case 5 -> this.titulo = "Duplicated Code";
            case 6 -> this.titulo = "Efeitos secundários";
            case 7 -> this.titulo = "Blue Screen of Death";
            case 8 -> this.titulo = "Ciclo infinito";
            case 9 -> this.titulo = "Segmentation Fault";
        }
    }
}
