public class MainAnimal {
    public static void main(String[] args) {
        Animal animal = new Animal(
                "Gorila", "22/04/2012", "Logia", "A002", "África"
        );

        System.out.println("=== Dados do Animal ===");
        animal.listar();

        Animal animal2 = new Animal(
                "Elefante", "20/02/2015", "Dunk", "B002", "África"
        );
        animal2.listar();

        System.out.println("\nAlterando dados do animal...");
        animal.cadastrarOuAlterar("Tigre", "05/08/2022", "Lax", "B002", "Índia");
        animal2.cadastrarOuAlterar("Girafa", "09/06/2021", "Gina", "C004", "Índia");
        System.out.println("\n=== Dados atualizados ===");
        animal.listar();
        animal2.listar();
    }
}
