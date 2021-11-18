package pt.ulusofona.lp2.deisiGreatGame;
import java.util.ArrayList;
import java.util.Collections;

public class Programmer {
    String nome = "";
    ArrayList<String> linguagens;
    int id = 0;
    pt.ulusofona.lp2.deisiGreatGame.ProgrammerColor cor;
    int posicao;

    public Programmer(String nome, ArrayList<String> linguagens, int id, pt.ulusofona.lp2.deisiGreatGame.ProgrammerColor cor) {
        this.nome = nome;
        this.linguagens = linguagens;
        this.id = id;
        this.cor = cor;
        this.posicao = 1;
    }


    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.nome == null ? "" : this.nome;
    }

    public pt.ulusofona.lp2.deisiGreatGame.ProgrammerColor getColor() {
        return cor;
    }

    public int getPosicao() {
        return this.posicao;
    }

    public String toString() {
        StringBuilder txtLinguagens = new StringBuilder();
        Collections.sort(this.linguagens);
        for (int i = 0; i < this.linguagens.size(); i++) {
            if (i == 0) {
                txtLinguagens.append(this.linguagens.get(i));
            } else {
                txtLinguagens.append("; ").append(this.linguagens.get(i));
            }
        }
        return this.id + " | " + this.nome + " | " + this.posicao + " | " + txtLinguagens + " | Em Jogo";
    }
}