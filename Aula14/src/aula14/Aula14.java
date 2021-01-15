
package aula14;

public class Aula14 {

    public static void main(String[] args) {
        //criando um vetor de Vídeo
        Video v[] = new Video [3];
        v[0] = new Video("Harry Potter");
        v[1] = new Video("Senhor dos Anéis");
        v[2] = new Video("Guerra nas Estrelas");
        /*mostrando na tela
        System.out.println(v[0].toString());*/
        
        //criando um vetor de Gafanhoto
        Gafanhoto g[] = new Gafanhoto[2];
        g[0]= new Gafanhoto("Amanda", 25, "F", "j.pereira");
        g[1]= new Gafanhoto("Cristiano", 31, "M", "c.oliveira");
        /*mostrando na tela
        System.out.println(g[0].toString());*/
        
        //criando vetor de Visualizacao
        Visualizacao vis[] = new Visualizacao[5];
        vis[0] = new Visualizacao(g[0], v[0]);
        vis[0].avaliar();
        System.out.println(vis[0].toString());
        vis[1] = new Visualizacao(g[0], v[1]);
        vis[1].avaliar(87.0f);
        System.out.println(vis[1].toString());
        
    }
    
}
