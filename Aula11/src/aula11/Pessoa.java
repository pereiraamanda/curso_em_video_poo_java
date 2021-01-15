
package aula11;

public abstract class Pessoa { //classe abstrata
    //atributos
    private String nome;
    private int idade;
    private String sexo;
    //getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    //método
    public void fazerAniver(){
        this.idade++; //acrescenta +1 a idade
    }
    //toString
    @Override
    public String toString() {
        return "Dados{" + "nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + '}';
    }
    
}
