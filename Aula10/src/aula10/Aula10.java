
package aula10;


public class Aula10 {

    
    public static void main(String[] args) {
        //Intânciando Pessoa, Aluno, Professor e Funcionário
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();
        //colocando o nome, idade e sexo
        p1.setNome("Pedro");
        p1.setIdade(10);
        p1.setSexo("Masculino");
        p2.setNome("Maria");
        p2.setIdade(20);
        p2.setSexo("Feminino");
        p3.setNome("Cláudio");
        p3.setIdade(30);
        p3.setSexo("Masculino");
        p4.setNome("Fabiana");
        p4.setIdade(40);
        p4.setSexo("Feminino");
        //escrevendo na tela
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
        //usando o método especifico de uma classe
        p2.setCurso("Informática");
        p3.setSalario(2500f);
        p4.setSetor("Estoque");
        //usando métodos que dão erro
        //p1.receberAumento(550); p1 não pode receber aumento pois é uma pessoa; só quem pode é sua classe filha Professor
        //p2.mudarTrabalho(); p2 é um aluno, só quem pode mudar de trabalho é p4 que é funcionário
        
        
       
    }
    
}
