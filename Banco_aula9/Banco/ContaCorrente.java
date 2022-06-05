public class ContaCorrente extends Conta{

    public ContaCorrente(int nroConta, int agencia, PessoaFisica titular) {
        super(nroConta, agencia, titular);
    }
    
    public boolean sacar(double valor){
        if(valor > 0 && valor <= super.saldo){
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