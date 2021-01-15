
package aula07;


public class Aula07 {

    public static void main(String[] args) {
        /*forma burra
        Lutador l1 = new Lutador("Pretty boy", "França", 31, 1.75f, 68.9f, 11, 2, 1);
        l1.status();
        Lutador l2 = new Lutador("Putscript", "Brasil", 29, 1.68f, 57.8f, 14, 2, 3);
        Lutador l3 = new Lutador("Snapshadow", "EUA", 35, 1.65f, 80.9f, 12, 2, 1);
        Lutador l4 = new Lutador("Dead Code", "Austrália", 28, 1.93f, 81.6f, 13, 0, 2);
        Lutador l5 = new Lutador("Ufocobol", "Brasil", 37, 1.70f, 119.3f, 5, 4, 3);
        Lutador l6 = new Lutador("Nerdaard", "EUA", 30, 1.81f, 105.7f, 12, 2, 4);*/
     
        //forma sábia
        Lutador l[] = new Lutador[6]; // declarando vetor de 6 posições
        
        l[0] = new Lutador("Pretty boy", "França", 31, 1.75f, 68.9f, 11, 2, 1);
   
        l[1] = new Lutador("Putscript", "Brasil", 29, 1.68f, 57.8f, 14, 2, 3);
        
        l[2] = new Lutador("Snapshadow", "EUA", 35, 1.65f, 80.9f, 12, 2, 1);
        
        l[3] = new Lutador("Dead Code", "Austrália", 28, 1.93f, 81.6f, 13, 0, 2);
        
        l[4] = new Lutador("Ufocobol", "Brasil", 37, 1.70f, 119.3f, 5, 4, 3);
        
        l[5]= new Lutador("Nerdaard", "EUA", 30, 1.81f, 105.7f, 12, 2, 4);
        
        Luta UEC01 = new Luta(); //criar um objeto do tipo luta
        UEC01.marcarLuta(l[0], l[1]);//marcando a luta
        UEC01.lutar();//lutando
        l[0].status();//mostrando status
        l[1].status();//mostrando status
        
                
        

    }
}