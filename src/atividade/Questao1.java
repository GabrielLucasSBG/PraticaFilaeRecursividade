package atividade;

import java.util.Scanner;

public class Questao1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um numero: ");

        int num1 = scan.nextInt();
        System.out.println(soma(num1));
    }

    public static int soma(int valor) {
        if (valor == 0) {
            return 0;
        } else {
            return valor + soma(valor - 1);
        }
    }
}