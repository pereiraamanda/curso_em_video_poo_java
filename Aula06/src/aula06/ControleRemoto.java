
package aula06;

public class ControleRemoto implements Controlador {
    //atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;
    //método construtor
    public ControleRemoto() {
        this.volume = 50; //volume no 50 é a configuração de fábrica 
        this.ligado = true; //desligado é a configuração de fábrica
        this.tocando = false; //não está tocando é a configuração de fábrica
    }
    //métodos getters e setters
    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean getLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean getTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }
    //métodos abstratos
    @Override
    public void ligar() {
        this.setLigado(true); //colocando verdadeiro em ligado -> está ligado
    }

    @Override
    public void desligar() {
        this.setLigado(false); //colocando falso em ligado -> está desligado
    }

    @Override
    public void abrirMenu() {
        if(this.getLigado()== true){
        System.out.println("-----MENU-----");
        System.out.println("Está ligado? " + this.getLigado()); //pega valor de ligado e mostra
        System.out.println("Está tocando? " + this.getTocando()); //pega valor de tocando e mostra
        System.out.print("Volume: " + this.getVolume()); //pega valor de volume e mostra; apaga o ln do println para fazer o for
        for(int i = 0; i< this.getVolume(); i+=10){ //enquanto i for menor que volume aumento 10 em volume
            System.out.print("|");//barra de volume
        }
        System.out.println("");
        } else {
            System.out.println("Impossível abrir menu");
        }
    }

    @Override
    public void fecharMenu() {
        if(this.getLigado()){
        System.out.println("Fechando menu...");
        }
    }

    @Override
    public void maisVolume() {
        if(this.getLigado() == true){ //pego valor de getLigado e verifico se é verdadeiro
            this.setVolume(this.getVolume() + 5);//coloco novo valor em ligado
        } else {
            System.out.println("Impossível aumentar volume");
        }
    }

    @Override
    public void menosVolume() {
        if(this.getLigado() == true){ //pego valor de getLigado e verifico se é verdadeiro
            this.setVolume(this.getVolume() - 5);//coloco novo valor em ligado
        } else {
            System.out.println("Impossível diminuir volume");
        }
    }

    @Override
    public void ligarMudo() {
        if(this.getLigado() == true && this.getVolume() >=0){ //pego valor de getLigado e verifico se é verdadeiro; pego valor de getVolume e verifico se é maior ou igual a 0
            this.setVolume(0);//coloco novo valor em volume
        }
    }

    @Override
    public void desligarMudo() {
        if(this.getLigado() == true && this.getVolume() == 0){ //pego valor de getLigado e verifico se é verdadeiro; pego valor de getVolume e verico se é igual a 0
            this.setVolume(50);//coloco novo valor em volume
        }
    }

    @Override
    public void play() {
        if(this.getLigado() == true && this.getTocando() == false){//pego valor em getLigado e verifico se é verdadeiro; pego valor em getTocando e verifico se é falso;
            this.setTocando(true);//colocando setTocando como verdadeiro
            System.out.println("Não consegui reproduzir");
        }
    }

    @Override
    public void pause() {
        if(this.getLigado() == true && this.getTocando() == true){//pego valor em getLigado e verifico se é verdadeiro; pego valor de getTocando e verifico se é verdadeiro;
            this.setTocando(false);
            System.out.println("Não consegui pausar");
        }
    }
   
    
    
    
    
}
