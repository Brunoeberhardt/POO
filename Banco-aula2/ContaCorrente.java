import javax.swing.JOptionPane;

class ContaCorrente {

        //atributos
        String nomeTitular;
        String cpfTitular;
        String agencia;
        String banco;
        int saldoContaCorrente;
        //variaveis auxiliares
        int valorSaque;
        int valorDeposito;
        int valorTransferencia;

        void sacar(){
            if(saldoContaCorrente == 0){
                JOptionPane.showMessageDialog(null, "Sem saldo para realizar o saque");
            }else{
                valorSaque = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual o valor deseja sacar?\nValor disponivel:"+saldoContaCorrente));
            }
            
            if(valorSaque > saldoContaCorrente || valorSaque <= 0){
                JOptionPane.showMessageDialog(null, "Saldo insuficiente ou valor negado. :C\nOperacao finalizada.");
            }else{
                JOptionPane.showMessageDialog(null, "Saque realizado! :D\n Operacao finalizada.");
                saldoContaCorrente -= valorSaque;
            }
        }

        void depositar(){
            valorDeposito = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual valor deseja depositar?\nSaldo da conta: "+saldoContaCorrente));
            if(valorDeposito <= 0){
                JOptionPane.showMessageDialog(null, "Valor negado.\nApenas valores positivos sao validados.\nOperacao finalizada.");
            }else{
                saldoContaCorrente += valorDeposito;
                JOptionPane.showMessageDialog(null, "Deposito concluido. :D\nValor na conta:"+saldoContaCorrente);
            }
        }
        void transferir(){
            banco = JOptionPane.showInputDialog(null, "Qual o banco da conta que realizara a transferencia?");
            agencia = JOptionPane.showInputDialog(null, "Qual a agencia da conta que realizara a transferencia?");
            cpfTitular = JOptionPane.showInputDialog(null, "Qual o cpf da conta que realizara a transferencia?");
            valorTransferencia = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual o valor da transferencia?\nValor disponivel: "+saldoContaCorrente));
            if(valorTransferencia > saldoContaCorrente || valorTransferencia<=0){
                JOptionPane.showMessageDialog(null, "Saldo insuficiente ou valor negado.\nOperacao finalizada");
            }else{
                saldoContaCorrente -= valorTransferencia;
                JOptionPane.showMessageDialog(null, "Transferencia realizada! :D\nBanco: "+banco+"\nAgencia: "+agencia+"\nCPF: "+cpfTitular+"\nOperacao finalizada\nValor atual na conta: "+saldoContaCorrente);
            }
        }
    
}