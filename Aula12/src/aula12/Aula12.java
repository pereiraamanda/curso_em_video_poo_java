
package aula12;


public class Aula12 {

   
    public static void main(String[] args) {
        //instânciando
       Mamifero m = new Mamifero();
       Reptil r = new Reptil();
       Peixe p = new Peixe();
       Ave a = new Ave();
       //colocando informações
       m.setPeso(85.3f);
       m.setCorPelo("Marrom");
       m.setIdade(2);
       m.setMembros(4);
       //mostrando métodos
       m.locomover();
       m.alimentar();
       m.emitirSom();
       //colocando informações
       r.setPeso(20f);
       r.setIdade(3);
       r.setMembros(4);
       //mostrando métodos
       r.locomover();
       r.alimentar();
       r.emitirSom();
       //colocando informações
       p.setPeso(4);
       p.setIdade(1);
       p.setMembros(0);
       //mostrando métodos
       p.locomover();
       p.alimentar();
       p.emitirSom();
       //colocando informações
       a.setPeso(3.500f);
       a.setIdade(5);
       a.setMembros(2);
       //mostrando métodos
       a.locomover();
       a.alimentar();
       a.emitirSom();
       //instanciando
       Canguru c = new Canguru();
       Cachorro k = new Cachorro();
       //colocando informações
       c.setPeso(55.30f);
       c.setIdade(3);
       c.setMembros(4);
       c.locomover();
       c.emitirSom();
       c.usarBolsa();
       //colocando informações
       k.setPeso(55.30f);
       k.setIdade(3);
       k.setMembros(4);
       k.enterrarOsso();
       k.abanarRabo();
       k.locomover();
       k.emitirSom();
       
       
    }
    
}
