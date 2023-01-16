package br.com.dio.exercicios.arrays;
/*
Crie um vetor de 6 números inteiros
e mostre-os na ordem inversa.
*/
public class Ex1_OrdemInversa {
    public static void main(String[] args) {
        int [] vetor = {7, -3, 26, -9, 13, 17}; 

        int count = (vetor.length - 1);
        System.out.println("Vetor inverso: ");

        while (count >= 0) {
            System.out.print(vetor[count] + " ");
            count--;
        }

        System.out.print("\n----------------");

        System.out.println("\nVetor: ");
        for (int elemento : vetor) {
            System.out.print(elemento + " ");
        }
    }
}
