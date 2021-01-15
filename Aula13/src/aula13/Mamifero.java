
package aula13;

public class Mamifero extends Animal {//mamifero herda de animal
    //atributos 
    protected String corPelo;
    //sobrescrevendo
    @Override
    public void emitirSom() {
        System.out.println("Som de Mamífero");    
    }
    //getters e setters
    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
    
    
  
}
