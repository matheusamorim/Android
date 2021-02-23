package lutador;
import  java.util.Random;

public class Lutas implements  LutasInterface {
    private Lutador desafiador;
    private Lutador desafiado;
    private int rounds;
    private boolean aprovada;
    Random gerador =  new Random();

    public Lutador getDesafiador() {
        return desafiador;
    }

    public void setDesafiador(Lutador desafiador) {
        this.desafiador = desafiador;
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }


    @Override
    public void marcarLuta(Lutador l1, Lutador l2) {
        if(l1.getCategoria() == l2.getCategoria() && l1 != l2){
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiador = l2;
        }

    }

    @Override
    public void lutar() {
        if(aprovada){
            this.desafiado.apresenta(desafiado);
            this.desafiador.apresenta(desafiador);
            int venc = gerador.nextInt(3);
            switch (venc){
                case 0:
                    System.out.println("Empate");
                    this.desafiador.empatarLuta();
                    this.desafiado.empatarLuta();
                    break;
                case 1:
                    System.out.println("Desafiado Ganha a luta " + this.desafiado.getNome());
                    this.desafiado.ganhaLuta();
                    this.desafiador.perdeLuta();
                    break;
                case 2:
                    System.out.println("Desafiador Ganha luta " + this.desafiador.getNome());
                    this.desafiador.ganhaLuta();
                    this.desafiado.perdeLuta();
                    break;
            }

        }else{
            System.out.println("Luta não pode acontencer");
        }

    }
}
