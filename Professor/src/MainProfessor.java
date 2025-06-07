public class MainProfessor {
    public static void main(String[] args) {
        Professor professor = new Professor(
                "João Carlos", "Doutor", "Ciência da Computação", 40, 15000.00, "Programação"
        );

        System.out.println("=== Dados do Professor ===");
        professor.listar();

        Professor professor2 = new Professor(
                "Guilherme Araujo", "Mestre", "Matemática", 20, 8000.00, "Cálculo"
        );
        professor2.listar();


        System.out.println("\nAlterando disciplina...");
        professor.alterarDisciplina("Banco de Dados");
        professor2.alterarDisciplina("Linguagem de Programação");

        System.out.println("\n=== Dados atualizados ===");
        professor.listar();
        professor2.listar();

        System.out.println("\nAlterando todos os dados...");
        professor.cadastrarOuAlterar("Ana Paula", "Mestre", "Matemática", 30, 10000.00, "Cálculo");
        professor2.cadastrarOuAlterar("Paulo Silva", "Doutor", "Engenharia", 30, 15000.00, "Redes");

        System.out.println("\n=== Dados finais ===");
        professor.listar();
        professor2.listar();
    }
}
