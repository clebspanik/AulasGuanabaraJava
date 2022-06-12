package AulasGuanabara.Aula4;

import java.util.Random;

public class Luta {

    // Atributos

    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    // Métodos Públicos

    public void marcarLuta(Lutador l0, Lutador l1) {
        if (l0.getCategoria().equals(l0.getCategoria())
                && l0 != l1) {
            this.aprovada = true;
            this.desafiado = l0;
            this.desafiante = l1;
        } else {
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }

    public void lutar() {
        if (this.aprovada) {
            System.out.println(" DESAFIADO ");
            this.desafiante.apresentar();
            System.out.println(" DESAFIANTE ");
            this.desafiante.apresentar();

            Random aleatorio = new Random();

            int vencedor = aleatorio.nextInt(3);
            switch (vencedor) {
                case 0:// empate
                    System.out.println(" Empatou ");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1:// Desafiado vence;
                    System.out.println(" Vitória do " + this.desafiado.getNome());
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 2:// DEsafiante vence;
                    System.out.println(" Vitória do " + this.desafiante.getNome());
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                    break;
            }

        } else {
            System.out.println("A luta não pode acontecer");
        }
    }

    // Métodos Especiais

    public Lutador getDesafiado() {
        return this.desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return this.desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return this.rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return this.aprovada;
    }

    public boolean getAprovada() {
        return this.aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

}
