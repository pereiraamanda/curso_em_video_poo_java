
package aula12;

public abstract class Animal { //não pode gerar um objeto; serve apenas para herança
    //atributos
    protected float peso;
    protected int idade;
    protected int membros;
    //métodos abstratos
   public abstract void locomover();
   public abstract void alimentar();
   public abstract void emitirSom();
   //getters e setters

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getMembros() {
        return membros;
    }

    public void setMembros(int membros) {
        this.membros = membros;
    }
   
}
