
package aula13;

public abstract class Animal {//classe abstrata; não pode gerar objetos
    //atributos
    protected float peso;
    protected int idade;
    protected int mebros;
    //método
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

    public int getMebros() {
        return mebros;
    }

    public void setMebros(int mebros) {
        this.mebros = mebros;
    }
    
    
}
