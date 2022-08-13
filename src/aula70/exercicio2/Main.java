package aula70.exercicio2;

import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

import static aula70.exercicio2.funcionario.*;


public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);

        String decisao;

        do {
            System.out.println("\nDigite o nome do funcionario: ");
            nome = leitor.next();
            System.out.println("\nDigite o salario bruto: ");
            salarioBruto = leitor.nextDouble();
            System.out.println("\nDigite o imposto: ");
            imposto = leitor.nextDouble();

            System.out.println("\nSeu nome é: " + nome);
            System.out.println("\nSeu salario bruto é: " + salarioBruto);
            System.out.println("\nO valor do imposto é:  " + imposto);

            System.out.println("\nSeu salario liquido é " + salarioLiquido());

            System.out.println("\nDigite o percentual de aumento: ");
            percentual = leitor.nextDouble();

            System.out.println("\nO porcentual de aumento é de: " + percentual);

            System.out.println("\nO salario final é de: " + salarioComAumento());


            System.out.println("\nDeseja continuar a calcular?(S/N)");
            decisao = leitor.next();

        }while(Objects.equals(decisao, "s") || Objects.equals(decisao, "S"));
        leitor.close();

        System.out.println("\nObrigado por usar nossos serviços");
    }
}