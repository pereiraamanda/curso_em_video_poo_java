
package aula10;

public class Funcionario extends Pessoa{//Funcionário está herdando de Pessoa
    //atributos
    private String setor;
    private boolean trabalhando;
    //método
    public void mudarTrabalho(){
        this.trabalhando = ! this.trabalhando; //this.trabalhando recebe o inverso de this.trabalhando
    }
    //getters e setters
    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean getTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
    
}
