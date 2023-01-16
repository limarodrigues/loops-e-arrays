package br.com.dio.exercicios.loops;

import java.util.Scanner;

/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/
public class Ex4_ParEImpar {
   
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        System.out.println("Quantidade de Números: ");
        int quantidadeDeNumeros = scan.nextInt();

        int quantidadePar = 0;
        int quantidadeImpar = 0;

        int count = 0;
        int order = 1;

        do {
            System.out.println("Digite o " + order + "° número:");
            int numero = scan.nextInt();

            if (numero % 2 == 0) {
                quantidadePar++;
            } else {
                quantidadeImpar++;
            }

            count++;
            order++;
        } while (count < quantidadeDeNumeros);

        System.out.println("Quantidade de números pares: "+quantidadePar);
        System.out.println("Quantidade de números ímpares: "+quantidadeImpar);
    }
}
