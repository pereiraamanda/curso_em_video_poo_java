
package aula09;


public class Livro implements Publicacao {
    //atributos
    private String titulo;
    private String autor;
    private int totPag;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor; // agregação
    //método construtor
    public Livro(String titulo, String autor, int totPag, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPag = totPag;
        this.aberto = false;
        this.pagAtual = 0;
        this.leitor = leitor;
    }
    //getters e setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPag() {
        return totPag;
    }

    public void setTotPag(int totPag) {
        this.totPag = totPag;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }
    //método
    public String detalhes() { //alt + i -> toString -> renomear para detalhes 
        return "Livro{" + "titulo=" + titulo + ",\nautor=" + autor + ",\ntotPag=" + totPag + ",\npagAtual=" + pagAtual + ",\naberto=" + aberto + ",\nleitor=" + leitor.getNome() + ",\nidade=" + leitor.getIdade() + ",\nsexo=" + leitor.getSexo()+ '}';
    }
    //métodos abstratos
    @Override
    public void abrir() {
        this.aberto = true; //abrindo o livro
    }

    @Override
    public void fechar() {
        this.aberto = false; //fechando o livro
    }

    @Override
    public void folhear(int p) {
        if(this.getTotPag() < p){
            System.out.println("Impossível! O número total de páginas desse livro é: " + this.getTotPag());
        }
        this.pagAtual = p; //recebe valor da página atual
    }

    @Override
    public void avancarPag() {
        this.pagAtual++; //passando para proxima página
    }

    @Override
    public void voltarPag() {
        this.pagAtual--;//passando para página anterior
    }
    
    
 
}
