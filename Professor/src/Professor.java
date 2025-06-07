public class Professor {
    private String nome;
    private String titulacao;
    private String formacao;
    private double cargaHoraria;
    private double salario;
    private String disciplina;


    public Professor(String nome, String titulacao, String formacao, double cargaHoraria, double salario, String disciplina) {
        this.nome = nome;
        this.titulacao = titulacao;
        this.formacao = formacao;
        this.cargaHoraria = cargaHoraria;
        this.salario = salario;
        this.disciplina = disciplina;
    }


    public void cadastrarOuAlterar(String nome, String titulacao, String formacao, double cargaHoraria, double salario, String disciplina) {
        this.nome = nome;
        this.titulacao = titulacao;
        this.formacao = formacao;
        this.cargaHoraria = cargaHoraria;
        this.salario = salario;
        this.disciplina = disciplina;
    }


    public void alterarDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }


    public void listar() {
        System.out.println("Nome: " + nome);
        System.out.println("Titulação: " + titulacao);
        System.out.println("Formação: " + formacao);
        System.out.println("Carga Horária: " + cargaHoraria + " horas");
        System.out.println("Salário: R$ " + salario);
        System.out.println("Disciplina: " + disciplina);
    }
}
