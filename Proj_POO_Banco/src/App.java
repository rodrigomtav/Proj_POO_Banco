public class App {
    public static void main(String[] args) throws Exception {

        Pessoa_Fisica pf1 = new Pessoa_Fisica("José","445.664.223-54", 2000, "07/07/2007", "Rua dos Bobos, nº7");
        Pessoa_Juridica pj1 = new Pessoa_Juridica("Docinhos & Balinhas S.A", "31.209.896/0001-47", 100000, "01/01/2001", "Rua das Empresas, nº2");
        Gerente g1 = new Gerente("Geraldo Gerente", "111.222.333-44", 1, "Gerente");
        Conta c1 = new Conta("Gabs", 1, 101, 3000, 1500, g1);
        Conta c2 = new Conta ("Pierrot", 2, 101, 5000, 2000, g1);
/*        pf1.MostraPF();
        pj1.MostraPJ();
        g1.MostraGerente();
*/
        c1.Transferir(300, c2);
        c1.mostraConta();
        c2.mostraConta(); 

        
    }
}
