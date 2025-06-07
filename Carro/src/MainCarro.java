public class MainCarro {
    public static void main(String[] args) {

        Carro carro1 = new Carro("001", "Toyota", "Prata", "Corolla", 2022, 4,
                "Gasolina", 5, 120000.00, true);


        carro1.listar();

        Carro carro2 = new Carro(
                "002", "Honda", "Preto", "Civic", 2022, 4, "Flex", 3, 110000.00, false
        );
        carro2.listar();


        System.out.println("Alterando os dados do carro...\n");
        carro1.cadastrarOuAlterar("001", "Honda", "Preto", "Civic", 2023, 4,
                "Flex", 3, 130000.00, false);

        carro2.cadastrarOuAlterar(
                "003", "Chevrolet", "Cinza", "Onix", 2023, 4, "Flex", 2, 115000.00, true
        );


        carro1.listar();
        carro2.listar();
    }
}
