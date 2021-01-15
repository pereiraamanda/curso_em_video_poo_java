
package aula11;


public class Aula11 {

    
    public static void main(String[] args) {
        //instanciando
        Visitante v1 = new Visitante();
        //colocando informações
        v1.setNome("Juvenal");
        v1.setIdade(22);
        v1.setSexo("Masculino");
        System.out.println(v1.toString());
        //instanciando
        Aluno a1 = new Aluno();
        //colocando informações
        a1.setNome("Claúdio");
        a1.setMatricula(1111);
        a1.setCurso("Informática");
        a1.setIdade(16);
        a1.setSexo("Masculino");
        a1.pagarMensalidade();
        //instanciando
        Bolsista b1 = new Bolsista();
        //colocando informações
        b1.setMatricula(1112);
        b1.setNome("Jubileu");
        b1.setBolsa(12.5f);
        b1.setSexo("Masculino");
        b1.pagarMensalidade();
        //instanciando
        Professor p1 = new Professor();
        p1.setNome("João");
        p1.setIdade(40);
        p1.setSexo("Masculino");
        p1.setSalario(10);
        p1.dados();
        p1.receberAumento(20);
        //instanciando
        Tecnico t1 = new Tecnico();
        t1.setNome("Amanda");
        t1.setCurso("Análise");
        t1.setRegistro(2020);
        t1.dados();
        
    }
    
}
