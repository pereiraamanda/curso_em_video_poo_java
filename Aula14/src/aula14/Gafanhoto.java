
package aula14;

public class Gafanhoto extends Pessoa{//Gafanhoto herda de Pessoa
    //atributos
    private String login;
    private int totAssistido;
    //construtor
    public Gafanhoto(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);//chamando o construtor da super instancia
        this.login = login;
        this.totAssistido = 0;
    }
    //getters e setters
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }
    //método
    public void viuMaisUm(){
        
    }
    //sobrescrevendo
    @Override
    public String toString() {//chamando a super instancia
        return "Gafanhoto{"+ super.toString() + "\nlogin=" + login + ", totAssistido=" + totAssistido + '}';
    }
    
}
