package LogicaDeProgramacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class stream {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> numeros = new ArrayList<>();

        System.out.println("Digite números inteiros (digite 0 para parar):");

        while (true) {
            int n = sc.nextInt();
            if (n == 0) break;
            numeros.add(n);
        }

        List<Integer> resultado = numeros.stream()
                .filter(n -> n % 2 != 0)
                .map(n -> n * 2)
                .sorted()
                .collect(Collectors.toList());

        System.out.println("\nLista final:");


        for(int i = 0; i < resultado.size(); i++) {
            System.out.println(resultado.get(i));
        }

        sc.close();
    }
}
