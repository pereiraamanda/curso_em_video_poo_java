
package aula12;


public class Cachorro extends Mamifero {//Cachorro herda de Mamifero
    //métodos
    public void enterrarOsso(){
        System.out.println("Enterrando osso");
    }
    public void abanarRabo(){
        System.out.println("Abanando o rabo");
    }
    //métodos abstratos
    @Override
    public void emitirSom() {
        System.out.println("AU AU AU");
    }
}
