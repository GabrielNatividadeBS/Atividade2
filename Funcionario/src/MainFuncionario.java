public class MainFuncionario {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario(
                "Pedro Silva", "18/06/1990", "5684527", "23265432100", "Rua das Cerejeiras, 758",
                "São Paulo", 25500.00, "Analista de Sistemas", "Superior Completo", "F005"
        );


        funcionario.listar();

        Funcionario funcionario2 = new Funcionario(
                "Lucas Rodrigo", "01/01/1986", "7654321", "12345678900", "Av. Brasil, 456",
                "São Paulo", 5200.00, "Gerente", "Pós-Graduação", "F002"
        );
        funcionario2.listar();

        System.out.println("\n--- Alterando dados do Funcionário ---");
        funcionario.cadastrarOuAlterar(
                "Lucas Martins", "05/01/2000", "6974321", "89675678900", "Avenida Brasil, 569",
                "Rio de Janeiro", 42800.00, "Gerente", "Pós-Graduação", "F012"
        );

        funcionario2.cadastrarOuAlterar(
                "Mariana Costa", "10/10/1992", "9876543", "11122233344", "Av. Central, 789",
                "Belo Horizonte", 6000.00, "Coordenadora", "Mestrado", "F003"
        );

        funcionario.listar();
        funcionario2.listar();
    }
}
