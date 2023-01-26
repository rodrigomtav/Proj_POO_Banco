public class Gerente extends Pessoa {

    public int ID_funcionario;
    public String cargo;

    public Gerente(String nome, String CPF,int ID_funcionario,String cargo) {
        super(nome, CPF);
        this.ID_funcionario = ID_funcionario;
        this.cargo = cargo;
}

    public int getID_funcionario() {
        return ID_funcionario;
    }
    public void setID_funcionario(int iD_funcionario) {
        ID_funcionario = iD_funcionario;
    }
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    public void MostraGerente(){
        System.out.println("\nNome: "+ nome + "\nCPF: "+CPF+ "\nID: "+ID_funcionario+ "\nCargo: "+cargo);
    }
}
