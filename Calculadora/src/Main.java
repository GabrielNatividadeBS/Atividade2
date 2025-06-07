import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();

        System.out.println("==== CALCULADORA ====");
        System.out.print("Digite o primeiro número: ");
        double num1 = entrada.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = entrada.nextDouble();

        System.out.println("\nEscolha a operação:");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.print("Digite o número da operação desejada: ");
        int opcao = entrada.nextInt();

        double resultado = 0;

        switch (opcao) {
            case 1:
                resultado = calculadora.somar(num1, num2);
                System.out.println("Resultado da soma: " + resultado);
                break;
            case 2:
                resultado = calculadora.subtrair(num1, num2);
                System.out.println("Resultado da subtração: " + resultado);
                break;
            case 3:
                resultado = calculadora.multiplicar(num1, num2);
                System.out.println("Resultado da multiplicação: " + resultado);
                break;
            case 4:
                resultado = calculadora.dividir(num1, num2);
                System.out.println("Resultado da divisão: " + resultado);
                break;
            default:
                System.out.println("Opção inválida!");
        }

        entrada.close();
    }
}
