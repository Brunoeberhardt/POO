package Bibliotequinha;

import java.util.ArrayList;

public class Publicacao {
    private String dataDePub;
    private String titulo;
    private boolean disponibilidade;
    private double precoMulta;
    private ArrayList<Autor> listaAutores;
    private ArrayList<Publicacao> listaReferencias;


    public Publicacao(String titulo, String dataPublicacao, double precoMulta) {
        this.titulo = titulo;
        this.dataDePub = dataPublicacao;
        this.listaAutores = new ArrayList<Autor>();
        this.listaReferencias = new ArrayList<Publicacao>();
        this.precoMulta = precoMulta;
        this.disponibilidade = true;
    }

    public String getDataDePub() {
        return this.dataDePub;
    }

    public void setDataDePub(String dataDePub) {
        this.dataDePub = dataDePub;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean getDisponibilidade() {
        return this.disponibilidade;
    }

    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public double getPrecoMulta() {
        return this.precoMulta;
    }

    public void setPrecoMulta(double precoMulta) {
        this.precoMulta = precoMulta;
    }

    public ArrayList<Autor> getListaAutores() {
        return this.listaAutores;
    }

    public void setListaAutores(ArrayList<Autor> listaAutores) {
        this.listaAutores = listaAutores;
    }

    public ArrayList<Publicacao> getListaReferencias() {
        return this.listaReferencias;
    }

    public void setListaReferencias(ArrayList<Publicacao> listaReferencias) {
        this.listaReferencias = listaReferencias;
    }
    
    public boolean addReferencia(Publicacao publicacao){
        this.listaReferencias.add(publicacao);
        return true;
    }
  
    public boolean removeReferencia(Publicacao publicacao){
        this.listaReferencias.remove(publicacao);
        return true;
    }
    
    public boolean addAutor(Autor autor){
        this.listaAutores.add(autor);
        return true;
    }
  
    public boolean removeAutor(Autor autor){
        this.listaAutores.remove(autor);
        return true;
    }

    public void emprestar(){
        this.disponibilidade = false;
    }
  
     public void devolver(){
        this.disponibilidade = true;
    }
  
    public double getprecoMulta() {
        return this.precoMulta;
    }
  
    public void setprecoMulta(double valorMulta) {
        this.precoMulta = valorMulta;
    }
}

    
    