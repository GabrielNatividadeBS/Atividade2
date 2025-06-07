public class Carro {

    private String codigo;
    private String marca;
    private String cor;
    private String modelo;
    private int anoFabricacao;
    private int nPortas;
    private String tipoCombustivel;
    private int qtdDisponivel;
    private double preco;
    private boolean completo;


    public Carro(String codigo, String marca, String cor, String modelo, int anoFabricacao,
                 int nPortas, String tipoCombustivel, int qtdDisponivel,
                 double preco, boolean completo) {
        this.codigo = codigo;
        this.marca = marca;
        this.cor = cor;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.nPortas = nPortas;
        this.tipoCombustivel = tipoCombustivel;
        this.qtdDisponivel = qtdDisponivel;
        this.preco = preco;
        this.completo = completo;
    }


    public void cadastrarOuAlterar(String codigo, String marca, String cor, String modelo, int anoFabricacao,
                                   int nPortas, String tipoCombustivel, int qtdDisponivel,
                                   double preco, boolean completo) {
        this.codigo = codigo;
        this.marca = marca;
        this.cor = cor;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.nPortas = nPortas;
        this.tipoCombustivel = tipoCombustivel;
        this.qtdDisponivel = qtdDisponivel;
        this.preco = preco;
        this.completo = completo;
    }


    public void listar() {
        System.out.println("------ Informações do Carro ------");
        System.out.println("Código: " + codigo);
        System.out.println("Marca: " + marca);
        System.out.println("Cor: " + cor);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano de Fabricação: " + anoFabricacao);
        System.out.println("Número de Portas: " + nPortas);
        System.out.println("Tipo de Combustível: " + tipoCombustivel);
        System.out.println("Quantidade Disponível: " + qtdDisponivel);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Completo: " + (completo ? "Sim" : "Não"));
        System.out.println("-----------------------------------\n");
    }
}
