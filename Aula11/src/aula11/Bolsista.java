
package aula11;


public class Bolsista extends Aluno{//bolsista herda aluno e pessoa;
   //atributos
    private float bolsa;
    //método
    public void renovarBolsa(){
        System.out.println("Renovando bolsa de " + this.getNome());
    }
    //getters e setters
    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
    @Override
    public void pagarMensalidade(){//sobrescevendo; mesma coisa feita de forma diferente; polimorfismo 
        System.out.println(this.getNome() + " é bolsista! Pagamento facilitado");
    }
    
}
