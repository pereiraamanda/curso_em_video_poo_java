// objeto
package aula02;


public class Aula02 {

   
    public static void main(String[] args) {
       // instanciando c1
       Caneta c1 = new Caneta(); // classe ~ objeto c1
       c1.modelo = "BIC CRISTAL"; // como modelo é uma String pública eu posso fazer isso
       c1.cor = "AZUL"; // como modelo é uma String pública eu posso fazer isso
       //c1.ponta = 0.5f; não é possível pois ponta é privado;
       c1.carga = 80; // É possivel mexer no atributo protegido, por ele estar dentro de uma classe que utiliza a classe caneta
       //c1.tampada = false; não é possível mexer por ela estar privada
       c1.tampar();
       c1.status();
       c1.rabiscar();
       
    }
    
}
