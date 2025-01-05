package com.example;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double[] notas = new double[4];

        for (int i=0; i < notas.length; i++){
            System.out.print("Informe a nota " + (i + 1) +": ");
            notas[i] = sc.nextDouble();
        }

        double media = 0;
        for (double nota: notas){
            media += nota;
        }
        media /= 4;

        System.out.println("----------------------------");
        if (media >= 7){
            System.out.println("Aluno aprovado :)");
        }else if (media >= 5){
            System.out.println("Aluno de recuperação :/");
        }else {
            System.out.println("Aluno reprovado");
        }
        System.out.println("Média: "+ media);
        System.out.print("Notas:");
        for (double nota: notas){
            System.out.print(" "+ nota);
        }

    }
}