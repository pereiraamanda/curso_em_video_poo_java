
package aula11;

public class Aluno extends Pessoa {//herança para diferença; herda pessoa e acrescenta novos atributos e métodos
    //atributos
    private int matricula;
    private String curso;
    //método
    public void pagarMensalidade(){
        System.out.println("Pagando mensalidade de aluno " + this.getNome());
    }
    //getters e setters
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
}
