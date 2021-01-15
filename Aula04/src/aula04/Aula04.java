
package aula04;


public class Aula04 {

 
    public static void main(String[] args) {
        //criando um objeto
        Caneta c1 = new Caneta ("Bic", 0.5f, false, "azul"); // atributos seguem a ordem de parâmetros do construtor
        c1.status();
        
        Caneta c2 = new Caneta ("Nic", 0.3f, true, "vermelho"); // atributos seguem a ordem de parâmetros do construtor
        c2.status();
    }
    
}


