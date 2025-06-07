public class Animal {
    private String especie;
    private String dataNascimento;
    private String nome;
    private String numeroRegistro;
    private String localNascimento;


    public Animal(String especie, String dataNascimento, String nome, String numeroRegistro, String localNascimento) {
        this.especie = especie;
        this.dataNascimento = dataNascimento;
        this.nome = nome;
        this.numeroRegistro = numeroRegistro;
        this.localNascimento = localNascimento;
    }


    public void cadastrarOuAlterar(String especie, String dataNascimento, String nome, String numeroRegistro, String localNascimento) {
        this.especie = especie;
        this.dataNascimento = dataNascimento;
        this.nome = nome;
        this.numeroRegistro = numeroRegistro;
        this.localNascimento = localNascimento;
    }


    public void listar() {
        System.out.println("Espécie: " + especie);
        System.out.println("Data de Nascimento: " + dataNascimento);
        System.out.println("Nome: " + nome);
        System.out.println("Número de Registro: " + numeroRegistro);
        System.out.println("Local de Nascimento: " + localNascimento);
    }
}
