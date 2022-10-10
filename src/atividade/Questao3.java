package atividade;

import java.util.Scanner;

public class Questao3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num1 = scan.nextInt();

        System.out.print("Digite um exponente: ");
        int num2 = scan.nextInt();

        System.out.println(multiplicacao(num1, num2));
    }

    public static int multiplicacao(int num, int exp) {
        if (exp != 0) {
            return num * multiplicacao(num, exp - 1);
        } else {
            return 1;
        }
    }
}