public class Conta {

    String titular;
    int numero;
    int agencia;
    int saldo;
    int limite;
    String gerente;

    public Conta(String titular, int numero, int agencia, int saldo, int limite, Pessoa gerente) {
        this.titular = titular;
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo;
        this.limite = limite;
        this.gerente = gerente.nome;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getLimite() {
        return limite;
    }

    public void setLimite(int limite) {
        this.limite = limite;
    }

    public String getGerente() {
        return gerente;
    }

    public void setGerente(String gerente) {
        this.gerente = gerente;
    }


    public void mostraConta(){
        System.out.println("\nTitular: "+ titular + "\nNumero: "+numero+ "\nAgencia: "+agencia+ "\nSaldo: "
        +saldo+"\nGerente: "+gerente);
    }

    void Sacar(int valor){
        
        if (valor <= saldo){
            saldo = saldo - valor;
            System.out.println("Saque efetuado com sucesso!\nsaldo: R$"+ saldo);
        } else if (valor > limite){
            System.out.println("Valor de saque acima do limite!");
        } else {
            System.out.println("Não possui saldo suficiente!");
        }

    }

    void Depositar(int valor){

        saldo = saldo + valor;
    }

    void Ver_Saldo(){
        System.out.println("Saldo: "+ saldo);
    }

    void Transferir(int valor, Conta conta_destino){

        if (valor <= saldo){
            saldo = saldo - valor;
            System.out.println("Transferência efetuada com sucesso!\nSaldo atual: R$"+ saldo);
        } else if (valor > limite){
            System.out.println("Valor de transferencia acima do limite!");
        } else {
            System.out.println("Não possui saldo suficiente!");
        }

        conta_destino.Depositar(valor);
    }
}
