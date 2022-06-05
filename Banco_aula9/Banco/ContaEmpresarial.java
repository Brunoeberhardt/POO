public class ContaEmpresarial extends Conta{
    public ContaEmpresarial(int nroConta, int agencia, PessoaJuridica representante) {
        super(nroConta, agencia, representante);
    }
    
    public boolean sacar(double valor){
        if(valor > 0 && super.saldo - valor >= -2000){
           super.saldo -= valor;
           return true;
        }
        return false;
    }
    public boolean transferir(double valor, Conta conta){
        if(this.sacar(valor)){
           conta.depositar(valor);
           return true;
        }
        return false;
    }
}   
