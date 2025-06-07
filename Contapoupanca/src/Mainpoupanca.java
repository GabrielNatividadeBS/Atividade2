public class Mainpoupanca {
    public static void main(String[] args) {
        poupanca conta = new poupanca(
                "Gabriel N", "1234578", "57865432100", 5500.00, "001", "3445"
        );

        System.out.println("=== Dados da Conta Poupança ===");
        conta.listar();
        conta.imprimirSaldo();

        poupanca conta2 = new poupanca(
                "Lucas Almeida", "2394321", "89645678900", 5000.00, "002", "5678"
        );

        System.out.println("\nAlterando dados da conta...");
        conta.cadastrarOuAlterar("Maria Silva", "2344321", "78545678900", 8000.00, "002", "6378");
        conta2.cadastrarOuAlterar("Eric", "8374321", "13965678900", 8000.00, "002", "6378");


        System.out.println("\n=== Dados atualizados ===");
        conta.listar();
        conta.imprimirSaldo();
        conta2.listar();
        conta2.imprimirSaldo();
    }
}
