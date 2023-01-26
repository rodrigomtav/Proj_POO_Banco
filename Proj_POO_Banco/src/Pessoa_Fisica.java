public class Pessoa_Fisica extends Pessoa {

    int renda;
    String data_nascimento;
    String endereço;
    
    public Pessoa_Fisica(String nome, String CPF, int renda, String data_nascimento, String endereço) {
        super(nome, CPF);
        this.renda = renda;
        this.data_nascimento = data_nascimento;
        this.endereço = endereço;
    }

    public int getRenda() {
        return renda;
    }


    public void setRenda(int renda) {
        this.renda = renda;
    }


    public String getData_nascimento() {
        return data_nascimento;
    }


    public void setData_nascimento(String data_nascimento) {
        this.data_nascimento = data_nascimento;
    }


    public String getEndereço() {
        return endereço;
    }


    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }
   
    public void MostraPF(){
        System.out.println("\nNome: "+ nome + "\nCPF: "+CPF+ "\nRenda: "+renda+ "\nData de nascimento: "
        +data_nascimento+"\nEndereço: "+endereço);
    }
}
