package br.com.dio.exercicios.loops;

import java.util.Scanner;

/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
*/
public class Ex3_MaiorEMedia {
    public static void main(String[] args) {

        double maior = 0;
        double soma = 0;
        double media;

        int count = 0;

        Scanner scan = new Scanner(System.in);

        do{
            System.out.println("Número: ");
            double numero = scan.nextDouble();

            if (numero > maior) {
                maior = numero;
            }

            soma = soma + numero;
            count = count + 1;
        } while (count < 5);

        media = soma / 5;

        System.out.println("Maior: " + maior + " - Média: " + media );
    }
}
