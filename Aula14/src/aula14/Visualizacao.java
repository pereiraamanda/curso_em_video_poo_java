
package aula14;

public class Visualizacao {
    //atributos
    private Gafanhoto espectador;
    private Video filme;
    //construtor
    public Visualizacao(Gafanhoto espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setTotAssistido(this.espectador.getTotAssistido() + 1);
        this.filme.setViews(this.filme.getViews() + 1);
    }
    //métodos de sobrecarga
    public void avaliar(){
        this.filme.setAvaliacao(5);
    }
    public void avaliar(int nota){
        this.filme.setAvaliacao(nota);
    }
    public void avaliar(float porcen){
        int tot = 0;
        if(porcen <= 20){
            tot = 3;
        }
        else if(porcen <=50){
            tot = 5;
        }
        else if(porcen <=90){
            tot = 8;
        }
        else {
            tot = 10;
        }
        this.filme.setAvaliacao(tot);
    }
    //getters e setters
    public Gafanhoto getEspectador() {
        return espectador;
    }

    public void setEspectador(Gafanhoto espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }
    //soprepondo
    @Override
    public String toString() {
        return "Visualizacao{" + "espectador=" + espectador + ", filme=" + filme + '}';
    }
    
    
    
    
}
