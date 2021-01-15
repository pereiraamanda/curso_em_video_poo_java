
package aula07;

import java.util.Random;


public class Luta {
    //atributos
    private Lutador desafiado; //tipo abstrato; desafiado é uma instância(objeto) da classe Lutador
    private Lutador desafiante; //tipo abstrato; desafiante é uma instância(objeto) da classe Lutador
    private int rounds;
    private boolean aprovada;
    //getters e setters
    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
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
    
    //métodos
    public void marcarLuta(Lutador l1, Lutador l2){//recebe dois lutadores como parâmetro
        if(l1.getCategoria().equals(l2.getCategoria()) && l1 != l2){
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
        } else {
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }
    public void lutar(){
        if(this.aprovada){
            System.out.println("###DESAFIADO###");
            this.getDesafiado().apresentar();
            System.out.println("###DESAFIANTE###");
            this.getDesafiante().apresentar();
            
            Random aleatoria = new Random();//criando um objeto do tipo random
            int vencedor = aleatoria.nextInt(3);// gera três resultados (0,1,2)
            System.out.println("========Resultado da Luta========");
            switch (vencedor){
                case 0: //Empate
                    System.out.println("Empatou");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1: //Desafiado vence
                    System.out.println("Vitória do " + this.desafiado.getNome());
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 2: //Desafiante vence
                    System.out.println("Vitória do " + this.desafiante.getNome());
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                    break;
            }
            System.out.println("=================================");
        }
        else {
            System.out.println("Luta não pode acontecer");
        }
    }
}
