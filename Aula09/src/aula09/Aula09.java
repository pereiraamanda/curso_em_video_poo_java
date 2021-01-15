
package aula09;

public class Aula09 {

  
    public static void main(String[] args) {
        //instânciando pessoa
        Pessoa[] p = new Pessoa [2]; //criando vetor de 3 pessoas
        //instânciando livro
        Livro[] l = new Livro [3]; //criando vetor de 4 livros
        
        //passando informação para o construtor de Pessoa
        p[0] = new Pessoa("Amanda", 25, "Feminino");
        p[1] = new Pessoa("Cristiano", 31, "Masculino");
        
        //passando informação para o construtor de Livro
        l[0] = new Livro("Harry Potter", "JK", 400, p[0]);
        l[1] = new Livro("Senhor dos anéis", "Token", 500, p[1]);
        l[2] = new Livro("Vingadores", "Stan Lee", 600, p[0]);
        
        //abrindo o livro
        l[0].abrir();
        l[0].folhear(10);
        l[0].avancarPag();
        
        //mostrando os detalhes
        System.out.println(l[0].detalhes());
        System.out.println(l[1].detalhes());
        
    }
    
}
