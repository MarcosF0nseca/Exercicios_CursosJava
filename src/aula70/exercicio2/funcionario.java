package aula70.exercicio2;

public class funcionario {

    public static String nome;
    public static double imposto,salarioBruto,aumento,percentual,_salarioLiquido,percentoDesconto;

    public static double salarioLiquido(){

        _salarioLiquido = salarioBruto-imposto;
        return _salarioLiquido;

    }
    public static double salarioComAumento(){

        percentoDesconto = percentual*(salarioBruto-imposto);
        aumento = percentoDesconto/100;


        return _salarioLiquido+aumento;


    }


}