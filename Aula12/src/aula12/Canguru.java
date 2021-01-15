
package aula12;


public class Canguru extends Mamifero {//Canguro herda de Mamifero
    //métodos
    public void usarBolsa(){
        System.out.println("Usando bolsa");
    }
    //sobrepondo
    @Override
    public void locomover() {
        System.out.println("Saltando");
    }
  
}
