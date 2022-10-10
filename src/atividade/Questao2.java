package atividade;

import java.util.Scanner;

public class Questao2 {
    static int valorInicial = 0;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um número: ");

        int num1 = scan.nextInt();
        soma(num1);
    }

    public static int soma(int valor) {
        if (valor == 0) {
            return 0;
        } else {
            if (valor == valorInicial) {
                return valor;
            } else {
                valorInicial++;
                System.out.println(valorInicial);
                return soma(valor);
            }
        }
    }
}