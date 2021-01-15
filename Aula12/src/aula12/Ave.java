
package aula12;


public class Ave extends Animal {//Ave herda Animal
    //atributos
    private String corPena;
    //método
    public void fazerNinho(){
        System.out.println("Construindo um ninho");
    }
    //métodos abstratos;sobrescrevendo
    @Override
    public void locomover() {
        System.out.println("Voando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo fruta");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som da ave");
    }
    //getters e settters
    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }

  
}
