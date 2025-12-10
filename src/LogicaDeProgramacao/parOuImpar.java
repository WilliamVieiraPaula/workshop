package LogicaDeProgramacao;

import java.util.Scanner;

public class parOuImpar {
    static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("digite um numero e descobra se é impar ou par :");
       int n = sc.nextInt();

        if(n% 2 == 0){
            System.out.println("numero é par:");
        }else{
            System.out.println("numero é impar");
        }
    }
}
