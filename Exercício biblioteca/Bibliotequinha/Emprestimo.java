package Bibliotequinha;

public class Emprestimo{
    private Usuario usuario;
    private Publicacao publicacao;
    private int nroRenovacoes;
    private String dataEmprestimo;
    private String dataDevolucao;
    private double precoMulta;
    
    public Emprestimo(Usuario usuario, Publicacao publicacao) {
        if(publicacao.getDisponibilidade()){
            if(usuario.fazerEmprestimo()){
                this.usuario = usuario;
                this.publicacao = publicacao;
                this.publicacao.emprestar();
                this.dataEmprestimo = "04/08/2021";
                this.dataDevolucao = "12/08/2021";
                this.nroRenovacoes = 0;
                this.precoMulta = 0;
            }else{
                System.out.println("Sem emprestimos restantes");
            }
        }else{
           System.out.println("Publicacao nao esta disponivel");
        }
    }
    
    public void definirMulta(int dias, double atraso){
        atraso = dias - atraso;
        precoMulta = atraso * this.publicacao.getPrecoMulta();
    }

    public boolean finalizarEmprestimo(){
        this.dataDevolucao = "13/08/2021";
        this.publicacao.devolver();
        this.usuario.devolverEmprestimo();
        System.out.println("Emprestimo finalizado com sucesso!");
        System.out.println("A multa é de "+this.precoMulta+" reais");
        return true;
      }
}