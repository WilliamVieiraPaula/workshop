package LogicaDeProgramacao;

import java.util.*;

public class map {
     
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, Integer> pessoas = new HashMap<>();

        System.out.println("Digite nome e idade das pessoas (digite 'fim' para encerrar):");

        while (true) {
            System.out.print("Nome: ");
            String nome = sc.next();
            if (nome.equalsIgnoreCase("fim")) break;

            System.out.print("Idade: ");
            int idade = sc.nextInt();

            pessoas.put(nome, idade);
        }

        Set<String> maiores30 = new HashSet<>();

        for (String nome : pessoas.keySet()) {
            if (pessoas.get(nome) > 30) {
                maiores30.add(nome);
            }
        }

        List<String> nomesOrdenados = new ArrayList<>(maiores30);
        Collections.sort(nomesOrdenados);

        System.out.println("Pessoas com mais de 30 anos (ordem alfabética):");
        for (String nome : nomesOrdenados) {
            System.out.println(nome);
        }

        sc.close();
    }

}
