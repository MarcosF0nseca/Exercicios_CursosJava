package com.company;

public class estudante {

    String nome;
    static int notaPrimeiroTrimestre,notaSegundoTrimestre,notaTerceiroTrimestre,notaFinal;

    public static String verificacaoAluno() {


        //processamento

        notaFinal = notaPrimeiroTrimestre + notaSegundoTrimestre + notaTerceiroTrimestre;

        if(notaFinal < 60 ){

            System.out.println("FAILED");
            System.out.println("MISSING "+ (notaFinal-60));

        }else {
            System.out.println("PASS ( ͡~ ͜ʖ ͡°)");
        }

        return null;
    }

}
