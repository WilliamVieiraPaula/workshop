package OrientacaoObjetos;

public class Revista  extends Livro implements Itembiblioteca {
    private int edicao;

    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println(edicao);
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }
}
