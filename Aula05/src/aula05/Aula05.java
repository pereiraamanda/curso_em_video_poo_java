
package aula05;

public class Aula05 {

    
    public static void main(String[] args) {
        Conta c1 = new Conta();
        c1.setNumConta(1111);
        c1.setDono("Maria");
        c1.abrirConta("CC");
        c1.depositar(500);
        c1.sacar(700);
        c1.fecharConta();
        
        Conta c2 = new Conta();
        c2.setNumConta(2222);
        c2.setDono("João");
        c2.abrirConta("CP");
        c2.depositar(350);
        c2.sacar(300);
        c2.fecharConta();
        
        c1.estadoAtual();
        c2.estadoAtual();
    }
    
}
