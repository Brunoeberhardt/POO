import javax.swing.JOptionPane;

public class Programa {
    public static void main(String[] args) {
        ContaCorrente conta1 = new ContaCorrente();
        
        conta1.nomeTitular = "Bruno Eberhardt";
        conta1.cpfTitular = "44079489864";
        conta1.saldoContaCorrente = 0;
        
        int continuar = 1;
        int operacao = 0;

        conta1.saldoContaCorrente = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual o valor inicial da conta?"));

        do{
            operacao = Integer.parseInt(JOptionPane.showInputDialog(null, "O que deseja realizar?\n1 - Saque\n2 - Deposito\n3 - Transferencia"));
            if(operacao < 1 & operacao > 3){
                JOptionPane.showMessageDialog(null, "Operacao invalida.\nProcesso encerrado");
            }else{
                switch(operacao){
                    case 1:
                        conta1.sacar();
                        break;
                    case 2:
                        conta1.depositar();
                        break;
                    case 3:
                        conta1.transferir();
                        break;
                }
            }
            continuar = Integer.parseInt(JOptionPane.showInputDialog(null, "Deseja Continuar?\n1 - Sim"));
            if(continuar != 1){
                JOptionPane.showMessageDialog(null, "Operacoes finalizadas");
            }
        }while(continuar==1);
    }
}
