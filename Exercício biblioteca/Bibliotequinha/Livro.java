package Bibliotequinha;

public class Livro extends Publicacao {
    private int nroEdicao;
    private String editora;
    private String isbn;

    public Livro(String titulo, String dataPublicacao, int nroEdicao, String editora, String isbn, double precoMulta) {
        super(titulo, dataPublicacao, precoMulta);
        this.nroEdicao = nroEdicao;
        this.editora = editora;
        this.isbn = isbn;
    }

    public int getNroEdicao() {
        return this.nroEdicao;
    }

    public void setNroEdicao(int numeroEdicao) {
        this.nroEdicao = numeroEdicao;
    }

    public String getEditora() {
        return this.editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getIsbn() {
        return this.isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

}
