package OrientacaoObjetos;

public class Livro implements Itembiblioteca {

        private String titulo;
        private String autor;
        private int anoPublicacao;

        public void exibirDetalhes(){
            System.out.println("Titulo: " + titulo);
            System.out.println("Autor: " +autor);
            System.out.println("Ano de Publicação: " + anoPublicacao);
        }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getAnoPublicacao() {

        if (anoPublicacao > 0) {
            return anoPublicacao;
        } else {
            System.out.println("não é possivel inserir insirir ");
            return null;
        }
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }
}
