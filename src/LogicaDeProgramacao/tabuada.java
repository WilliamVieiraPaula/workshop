package LogicaDeProgramacao;

import java.util.Scanner;

public class tabuada {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero e veja sua tabuada:");
        int n = sc.nextInt();

        for (int i = 0; i <= 10 ; i ++){
            System.out.println(n + " x " + i + " = " + i * n);
        }
    }
}
