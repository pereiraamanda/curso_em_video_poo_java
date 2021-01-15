
package aula12;

public class Peixe extends Animal {//Peixe herda de Animal
    //atributos
    private String corEscama;
    //método
    public void soltarBolha(){
        System.out.println("Soltou uma bolha");
    }
    //métodos abstratos; sobrescrendo
    @Override
    public void locomover() {
        System.out.println("Nadando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo substâncias");
    }

    @Override
    public void emitirSom() {
        System.out.println("Peixe não faz som");
    }
    //getters e setters
    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
   
}
