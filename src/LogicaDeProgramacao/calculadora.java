package LogicaDeProgramacao;

import java.util.Scanner;

public class calculadora {

static void main() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite um numero");
    Integer n = sc.nextInt();

    System.out.println("Digite a operação desejada:");
    String t = sc.next();

    System.out.println("Digite um numero");
    Integer n2 = sc.nextInt();


    if (n2 != null && n != null && t != null) {
        if (t.equals("x")) {
            Double total = n2.doubleValue() * n.doubleValue();
            System.out.println("Total: " + total);
        } else if (t.equals("+")) {
            Integer total = n2 + n;
            System.out.println("Total: " + total);
        } else if (t.equals("-")) {
            Integer total = n2 - n;
            System.out.println("Total: " + total);
        } else if (t.equals("/")) {
            Double total = n.doubleValue() / n2.doubleValue();
            System.out.println("Total: " + total);
        }else{
            System.out.println("Operaçao Invalida!");
        }
    }
}
}
