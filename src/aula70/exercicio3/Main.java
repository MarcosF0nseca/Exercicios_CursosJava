package aula70.exercicio3;

import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);

        String decisao;
        do {

            System.out.println("****Bem vindo**** ");
            System.out.println("\nDigite a nota do primeiro trimestre: ");
            estudante.notaPrimeiroTrimestre = leitor.nextInt();
            System.out.println("\nDigite a nota do segundo trimestre: ");
            estudante.notaSegundoTrimestre = leitor.nextInt();
            System.out.println("\nDigite a nota do terceiro trimestre: ");
            estudante.notaTerceiroTrimestre = leitor.nextInt();

            System.out.println(estudante.verificacaoAluno());

            System.out.println("\nDeseja calcular novamente? (S/N) ");
            decisao = leitor.next();

        } while (Objects.equals(decisao,"S")|| (Objects.equals(decisao,"s")));
        leitor.close();

        System.out.println(" Obrigado por usar nosso programa");

    }
}
