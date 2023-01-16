package br.com.dio.exercicios.loops;

import java.util.Scanner;

import br.com.dio.exercicios.loops.comentado.Nota;

/*
Faça um programa que peça uma nota, entre zero e dez.
Mostre uma mensagem caso o valor seja inválido
e continue pedindo
até que o usuário informe um valor válido.
*/
public class Ex2_Nota {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nota;

        System.out.println("Nota: ");
        nota = scan.nextInt();
        
        while (nota < 0 || nota > 10) {
            System.out.println("Nota inválida!");
            System.out.println("Digite outra nota: ");
            nota = scan.nextInt();
        }

    System.out.println("Nota: " + nota);

    }

}


