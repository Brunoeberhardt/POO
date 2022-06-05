package Bibliotequinha;

public class Tese extends Publicacao {
    private int nroPaginas;
    private String resumo;
    private String dataDefesa;
    private String instDefesa;

    public Tese(String titulo, String dataPublicacao, Autor autor, int nroPaginas, String resumo, String dataDefesa, String instDefesa, double precoMulta) {
        super(titulo, dataPublicacao, precoMulta);
        this.nroPaginas = nroPaginas;
        this.resumo = resumo;
        this.dataDefesa = dataDefesa;
        this.instDefesa = instDefesa;
        super.addAutor(autor);
     }

    public int getNroPaginas() {
        return this.nroPaginas;
    }

    public void setNroPaginas(int nroPaginas) {
        this.nroPaginas = nroPaginas;
    }

    public String getResumo() {
        return this.resumo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }

    public String getDataDefesa() {
        return this.dataDefesa;
    }

    public void setDataDefesa(String dataDefesa) {
        this.dataDefesa = dataDefesa;
    }

    public String getInstDefesa() {
        return this.instDefesa;
    }

    public void setInstDefesa(String instDefesa) {
        this.instDefesa = instDefesa;
    }

    @Override
    public boolean addAutor(Autor autor){
        if(super.getListaAutores().size() == 0){
            super.addAutor(autor);
            return true;
        }else{
            return false;
        }
    } 
}
