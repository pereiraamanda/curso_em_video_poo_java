
package aula10;


public class Aluno extends Pessoa{ //Aluno está herdando de Pessoa
    //atributos
    private int matricula;
    private String curso;
    //método
    public void cancelarMatricula(){
        System.out.println("Matrícula será cancelada");
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
