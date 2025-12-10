package LogicaDeProgramacao;

import java.util.Scanner;


public class matriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[3][3];
        int somaTotal = 0;

        System.out.println("Digite 9 números para preencher a matriz 3x3:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
                somaTotal += matriz[i][j];
            }
        }

        System.out.println("\nSoma de todos os elementos da matriz: " + somaTotal);

        System.out.println("\nSoma de cada linha:");
        for (int i = 0; i < 3; i++) {
            int somaLinha = 0;
            for (int j = 0; j < 3; j++) {
                somaLinha += matriz[i][j];
            }
            System.out.println("Linha " + (i+1) + ": " + somaLinha);
        }

        sc.close();
    }
}
