package Banco;

import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        ArrayList<Conta> listaDeContas = new ArrayList<Conta>();
        Scanner scan = new Scanner(System.in);

        int opcao = 0;
        int buscaConta;
        int buscaConta2;
        int valor;
        
        Conta conta = new Conta(12345, 123, "Marcel", "222.222.222-22");
        
        for(int i=0; i!=-1; i++){
            System.out.println("\nO que deseja realizar?:\n1-Criar nova conta\n2 - Exibir o saldo ou estrato de uma conta\n3 - Sacar\n4 - Depositar\n5-Transferir\n-1 - Finalizar");
            opcao = Integer.parseInt(scan.nextLine());
            System.out.println(opcao);
            
            if(opcao == -1){
                System.out.println("Operacoes finalizadas");
                break;
            }
            if(opcao == 1){
                System.out.println("Digite o numero da conta: ");
                conta.setNroConta(Integer.parseInt(scan.nextLine()));

                System.out.println("Digite o nome do titular: ");
                conta.setNomeTitular((scan.nextLine()));

                System.out.println("Digite o cpf do titular: ");
                conta.setCpfTitular((scan.nextLine()));
                
                listaDeContas.add(new Conta(conta.getNroConta(), conta.getNomeTitular(), conta.getCpfTitular()));

                opcao = 0;

            }
            if(opcao == 2){
                System.out.println("Digite o numero da conta: ");
                buscaConta = Integer.parseInt(scan.nextLine());

                for(int j=0; j<listaDeContas.size(); j++){
                    Conta contaRecuperada = listaDeContas.get(j);
                    if(contaRecuperada.getNroConta() == buscaConta){
                        System.out.println("\nConta encontrada");
                        listaDeContas.get(j).extrato();
                        break;
                    }else{
                        System.out.println("Conta nao encontrada");
                    }
                }
            }
            if(opcao == 3){
                System.out.println("Digite o numero da conta: ");
                buscaConta = Integer.parseInt(scan.nextLine());
                System.out.println("Digite o valor de saque: ");
                valor = Integer.parseInt(scan.nextLine());

                for(int j=0; j<listaDeContas.size(); j++){
                    Conta contaRecuperada = listaDeContas.get(j);
                    if(contaRecuperada.getNroConta() == buscaConta){
                        System.out.println("\nConta encontrada");
                        if(listaDeContas.get(j).sacar(valor)){
                            System.out.println("Saque efetuado com sucesso :D\n");
                            break;
                        }else{
                            System.out.println("Saque negado\n");
                            break;
                        }
                    }else{
                        System.out.println("Conta nao encontrada");
                    }
                }
            }
            if(opcao == 4){
                System.out.println("Digite o numero da conta: ");
                buscaConta = Integer.parseInt(scan.nextLine());
                System.out.println("Digite o valor de deposito: ");
                valor = Integer.parseInt(scan.nextLine());

                for(int j=0; j<listaDeContas.size(); j++){
                    Conta contaRecuperada = listaDeContas.get(j);
                    if(contaRecuperada.getNroConta() == buscaConta){
                        System.out.println("\nConta encontrada com sucesso");

                        if(listaDeContas.get(j).depositar(valor)){
                            System.out.println("Deposito efetuado com sucesso :D\n");
                        }else{
                            System.out.println("Deposito nao efetuado\n");
                        }
                        break;
                    }else{
                        System.out.println("Conta nao encontrada\n");
                    }
                }
            }
            if(opcao == 5){
                System.out.println("Digite o numero da conta de envio: ");
                buscaConta = Integer.parseInt(scan.nextLine());
                
                System.out.println("Digite o valor do envio: ");
                valor = Integer.parseInt(scan.nextLine()); 

                System.out.println("Digite o numero da conta que recebera a transferencia: ");
                buscaConta2 = Integer.parseInt(scan.nextLine());
                
                for(int j=0; j<listaDeContas.size(); j++){//<<<<<NAO CONSEGUI REALIZAR A TRANSFERENCIA>>>>>\\
                    Conta contaRecuperada = listaDeContas.get(j);
           
                    if(contaRecuperada.getNroConta() == buscaConta){
                        Conta contaRecuperada2 = listaDeContas.get(j);
                        
                        if(contaRecuperada2.getNroConta() == buscaConta2){
                            System.out.println("Contas encontradas com sucesso"); 
                            
                            if(listaDeContas.get(j).transferir(valor, contaRecuperada2)){
                                System.out.println("Transferencia efetuado com sucesso :D\n");
                            }else{
                                System.out.println("Transferencia nao efetuada\n");
                            }
                            break;
                        }
                            break;
                    }
                }
            }
        }
        System.out.println("Contas utilizadas:\n"+listaDeContas);
    }
}