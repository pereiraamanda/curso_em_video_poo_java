
package aula11;

public class Professor extends Pessoa {//herança para diferença; herda aluno e pessoa e acrescenta novos atributos e métodos
    //atributos
    private String especialidade;
    private float salario;
    //método
    public void receberAumento(float aumento){
        this.setSalario(this.getSalario() + aumento);
        System.out.println("Salário atualizado para R$" + this.getSalario());
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
    //método
    public void dados() {
        System.out.println("Professor: " + this.getNome());
        System.out.println("Salário R$ " + this.getSalario());
    }
    
    
}
