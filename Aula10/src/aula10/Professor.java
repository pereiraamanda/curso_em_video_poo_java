
package aula10;

public class Professor extends Pessoa {//Professor está herdando de Pessoa
    //atributos
    private String especialidade;
    private float salario;
    //método
    public void receberAumento(float aumento){
       this.salario += aumento;//aumentando salário
    }
    //getters e setters
    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
}
