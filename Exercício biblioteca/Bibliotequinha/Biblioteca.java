package Bibliotequinha;

import java.util.ArrayList;

public class Biblioteca {
    private String nome;
    private String endereco;
    private ArrayList<Publicacao> publicacoes;

    public Biblioteca(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
        this.publicacoes = new ArrayList<Publicacao>();
    }
    
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public ArrayList<Publicacao> getPublicacoes() {
        return this.publicacoes;
    }

    public void setPublicacoes(ArrayList<Publicacao> publicacoes) {
        this.publicacoes = publicacoes;
    } 

    public boolean addPublicacao(Publicacao publicacao){
        this.publicacoes.add(publicacao);
        return true;
    }
     
     public boolean removePublicacao(Publicacao publicacao){
        this.publicacoes.remove(publicacao);
        return true;
    }
}