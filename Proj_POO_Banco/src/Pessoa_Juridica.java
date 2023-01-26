public class Pessoa_Juridica extends Pessoa {

    int faturamento;
    String data_abertura;
    String endereco;

    public Pessoa_Juridica(String nome, String CPF, int faturamento, String data_abertura, String endereco) {
        super(nome, CPF);
        this.faturamento = faturamento;
        this.data_abertura = data_abertura;
        this.endereco = endereco;
    }

    public int getFaturamento() {
        return faturamento;
    }

    public void setFaturamento(int faturamento) {
        this.faturamento = faturamento;
    }

    public String getData_abertura() {
        return data_abertura;
    }

    public void setData_abertura(String data_abertura) {
        this.data_abertura = data_abertura;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void MostraPJ(){
        System.out.println("\nNome: "+ nome + "\nCNPJ: "+CPF+ "\nFaturamento: "+faturamento+ "\nData de abertura: "+data_abertura+"\nEndereço: " +endereco);
    }
}
