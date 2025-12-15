package OrientacaoObjetos;

public abstract class Item implements Itembiblioteca {

    protected String titulo;
    protected int anoPublicacao;

    public Item(String titulo, int anoPublicacao) {
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
    }

    @Override
    public String getTitulo() {
        return titulo;
    }

    @Override
    public Integer getAnoPublicacao() {
        return anoPublicacao;
    }

    // Método abstrato exigido
    public abstract String getTipo();
}

