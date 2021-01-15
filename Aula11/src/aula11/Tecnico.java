
package aula11;

public class Tecnico extends Aluno {//herança para diferença; herda aluno e pessoa e acrescenta novos atributos e métodos
    //atributos
    private int registro;
    //método
    public void dados(){
        System.out.println(this.getNome() + " faz curso técnico " + " cursa " + this.getCurso() + " tem o registro " + this.getRegistro());
    }
    //getters e setters
    public int getRegistro() {
        return registro;
    }

    public void setRegistro(int registro) {
        this.registro = registro;
    }
    
}
