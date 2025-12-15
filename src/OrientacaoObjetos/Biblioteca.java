package OrientacaoObjetos;

import java.util.ArrayList;

public class Biblioteca  {
    ArrayList<Livro> livros = new ArrayList<>();


    public void adicionarLivro(Livro livro){
        livros.add(livro);
    }


    public void listarLivros(){
        for (Livro l: livros){
            System.out.println("livros listados: ");
            l.exibirDetalhes();
        }
    }

    private void buscarLivroPorDescricao(String descricao) {
        for (Livro l : livros) {
            if (l.getTitulo().equalsIgnoreCase(descricao)) {
                System.out.println("O livro está disponível: " + l.getTitulo());
                return;
            }
        }
        System.out.println("O livro não está disponível");
    }


}
