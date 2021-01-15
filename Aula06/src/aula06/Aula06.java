
package aula06;

public class Aula06 {

    public static void main(String[] args) {
       ControleRemoto c = new ControleRemoto();
       //Não posso usar nenhum get ou set pois eles estão privados
       //só posso usar os métodos disponíveis na interface
       c.ligar(); //mandando ligar
       c.maisVolume();//mandando aumentar o volume
       c.menosVolume();
       c.play();//mandando dar play
       c.abrirMenu();//mandando abrir o menu
       c.fecharMenu();//mandando fechar o menu
       
       
    }
    
}
