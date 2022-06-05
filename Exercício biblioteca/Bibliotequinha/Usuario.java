package Bibliotequinha;

public class Usuario {
    private String nome;
    private String telefone;
    private String email;
    private int emprestimos;
    private int renovacao;
    private int nroEmprestimos;

    public Usuario(String nome, String telefone, String email, int emprestimos, int renovacao) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.emprestimos = emprestimos;
        this.renovacao = renovacao;
        this.nroEmprestimos = 0;
    }
    
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getEmprestimos() {
        return this.emprestimos;
    }

    public void setEmprestimos(int Emprestimos) {
        this.emprestimos = Emprestimos;
    }

    public int getRenovacao() {
        return this.renovacao;
    }

    public void setRenovacao(int renovacao) {
        this.renovacao = renovacao;
    }

    public boolean fazerEmprestimo(){
        if(this.nroEmprestimos < this.emprestimos || this.emprestimos == -1){
           this.nroEmprestimos++;
           return true;
        }else{
           return false;
        }
    }
  
    public boolean devolverEmprestimo(){
        this.nroEmprestimos--;
        return true;
    }

}