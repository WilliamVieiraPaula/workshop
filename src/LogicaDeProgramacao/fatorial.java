package LogicaDeProgramacao;

import java.util.Scanner;

public class fatorial {

    static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("digite um numero e descubra seu fatorial");
        int n = sc.nextInt();
        int fat = 1;
        for(int i = n; i > 1; i--){
            fat *= i;
        }
        System.out.println("o fatorial de " + n + " é " + fat + "!");
    }


}
