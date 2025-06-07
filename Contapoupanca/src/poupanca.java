public class poupanca {
    private String nomeCorrentista;
    private String rg;
    private String cpf;
    private double saldo;
    private String numero;
    private String agencia;


    public poupanca(String nomeCorrentista, String rg, String cpf, double saldo, String numero, String agencia) {
        this.nomeCorrentista = nomeCorrentista;
        this.rg = rg;
        this.cpf = cpf;
        this.saldo = saldo;
        this.numero = numero;
        this.agencia = agencia;
    }


    public void cadastrarOuAlterar(String nomeCorrentista, String rg, String cpf, double saldo, String numero, String agencia) {
        this.nomeCorrentista = nomeCorrentista;
        this.rg = rg;
        this.cpf = cpf;
        this.saldo = saldo;
        this.numero = numero;
        this.agencia = agencia;
    }


    public void imprimirSaldo() {
        System.out.println("Saldo da Conta: R$ " + saldo);
    }


    public void listar() {
        System.out.println("Nome do Correntista: " + nomeCorrentista);
        System.out.println("RG: " + rg);
        System.out.println("CPF: " + cpf);
        System.out.println("Saldo: R$ " + saldo);
        System.out.println("Número da Conta: " + numero);
        System.out.println("Agência: " + agencia);
    }
}
