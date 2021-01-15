// objeto
package aula02;


public class Aula02 {

   
    public static void main(String[] args) {
       // instanciando c1
       Caneta c1 = new Caneta(); // classe ~ objeto c1
       c1.cor = "Azul";
       c1.ponta = 0.5f; // f diz que é float
       c1.tampar(); // c1 chamou o método tampar
       c1.status(); // referencia a método
       c1.rabiscar();
       
       // instanciando c2
       Caneta c2 = new Caneta();
       c2.modelo = "Hostnet";
       c2.cor = "Preta";
       c2.destampar();
       c2.status();
       c2.rabiscar();
    }
    
}
