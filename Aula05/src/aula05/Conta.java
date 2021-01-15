
package aula05;


public class Conta {
    //atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    //construtor
    public Conta() {
       this.setSaldo(0); //saldo default é 0
       this.setStatus(false);//status default é false
        
    }
    //getters e setters
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    //métodos
    public void abrirConta(String t){ //abrirConta recebe tipo t como parâmetro
       this.setTipo(t);//recebe o tipo de conta
       this.setStatus(true);//recebe status como verdadeiro
        if (t == "CC") { // se o tipo de conta for corrente
            this.setSaldo(50); // o saldo começa com R$50
        } else if (t == "CP"){ // se o tipo de conta for poupança
            this.setSaldo(150); // o saldo começa com R$150
        }
    }
    public void fecharConta(){
        if( this.getSaldo() > 0 ){ // pega o saldo e verifica se é maior que 0
            System.out.println("Conta com dinheiro!");
        }
        else if( this.getSaldo() < 0 ) { // pega o saldo e verifica se é menor que 0
            System.out.println("Conta em débito!");
        }
        else {
            this.setStatus(false); // status passa a ser falso
            System.out.println("Conta fechada com sucesso!");
        }
    }
    public void depositar(float v){ // depositar recebe um valor float como parâmetro
        if(this.getStatus()){ //pego o status da conta
            this.setSaldo(this.getSaldo() + v); // coloco novo valor em saldo
            System.out.println("Depósito realizado na conta de: " + this.getDono());
        } else {
            System.out.println("Impossível depositar em uma conta fechada");
        }
    }
    public void sacar(float v){ // sacar recebe um valor float como parâmetro
        if (this.getStatus()){ // pego o status da conta
            if(this.getSaldo() >= v){ // pego valor do saldo e verifico se é maior ou igual a v
                this.setSaldo(this.getSaldo() - v); //coloco novo valor em saldo
                System.out.println("Saque realizado na conta de: " + this.getDono());   
            } else {
                System.out.println("Saldo insuficiente para saque");
            }   
        } else {
            System.out.println("Impossível sacar de uma conta fechada");
        }
        if (this.getStatus()){ // pego o status
            this.setSaldo(this.getSaldo() - v); // coloco novo valor em status
            System.out.println("Mensalidade paga com sucesso por: " + this.getDono());
        } else {
            System.out.println("Impossível cobrar de uma conta fechada");
        }
    }
    public void pagarMensalidade(){
        int v = 0; //variável local
        if (this.getTipo() == "CC") { // pego o tipo e coloco conta corrente
            v = 12; // 12 de taxa
        } else if (this.getTipo() == "CP") { //pego o tipo e coloco conta poupança
            v = 20; // 20 de taxa
        }
    }
    //mostrando na tela
    public void estadoAtual(){
        System.out.println("---------------------------------------");
        System.out.println("Número da conta: " + this.getNumConta()); //pego numero da conta
        System.out.println("Tipo: " + this.getTipo()); //pego tipo de conta
        System.out.println("Dono: " + this.getDono()); //pego nome do dono da conta
        System.out.println("Saldo: " + this.getSaldo());//pego saldo da conta
        System.out.println("Status: " + this.getStatus());//pego status da conta
    }
    
    
    
}
