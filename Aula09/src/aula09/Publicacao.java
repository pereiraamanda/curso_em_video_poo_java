
package aula09;


public interface Publicacao {
    //lista de métodos abstratos
   public abstract void abrir();
   public abstract void fechar();
   public abstract void folhear(int p);
   public abstract void avancarPag();
   public abstract void voltarPag();
}
