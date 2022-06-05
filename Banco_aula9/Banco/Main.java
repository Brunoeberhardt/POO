package Banco;

import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
    
        ArrayList<ContaCorrente> contasCorrentes = new ArrayList<ContaCorrente>();
        /*ArrayList<ContaEspecial> contasEspeciais = new ArrayList<ContaEspecial>();
        ArrayList<ContaPoupanca> contasPoupancas = new ArrayList<ContaPoupanca>();
        ArrayList<ContaEmpresarial> contasEmpresariais = new ArrayList<ContaEmpresarial>();*/
    
    //VVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVV TESTE CONTA CORRENTE    
        int nroConta = 11;
        int agencia = 12;
        String nome = "bruno";
        String cpf = "122312";

        PessoaFisica titular = new PessoaFisica(nome, cpf);
        ContaCorrente conta1 = new ContaCorrente(nroConta, agencia, titular);

        contasCorrentes.add(conta1);
        
        nroConta = 13;
        agencia = 15;
        nome = "zé";
        cpf = "1234124";

        titular.setNome("ze");
        titular.setCpf("1232134");

        ContaCorrente conta2 = new ContaCorrente(nroConta, agencia, titular);
        
        System.out.println(conta1);
        System.out.println(conta2);

        conta1.depositar(100);
        conta1.transferir(12, conta2);
        
        System.out.println(conta1);
        System.out.println(conta2);

        conta2.sacar(13);
        
        System.out.println(conta2);

        System.out.println("\n\n\n");
    //VVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVV TESTE CONTA ESPECIAL 

        ContaEspecial conta3 = new ContaEspecial(nroConta, agencia, titular);
        ContaEspecial conta4 = new ContaEspecial(nroConta, agencia, titular);

        conta3.depositar(10);
        conta4.sacar(260);
        
        System.out.println(conta3);
        System.out.println(conta4);

        conta4.sacar(3000);
        conta3.sacar(2010);

        System.out.println(conta3);
        System.out.println(conta4);
        System.out.println("\n\n\n");

    //VVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVV TESTE CONTA POUPANCA
        
        ContaPoupanca conta5 = new ContaPoupanca(nroConta, agencia, titular);
        ContaPoupanca conta6 = new ContaPoupanca(nroConta, agencia, titular);

        conta5.depositar(100);
        conta5.rendimento();
        System.out.println(conta5);
        conta5.rendimento();
        System.out.println(conta5);
        conta5.rendimento();
        System.out.println(conta5);
        conta5.rendimento();
        System.out.println(conta5);
        conta5.rendimento();
        System.out.println(conta5);
        
        conta6.sacar(50);
        System.out.println(conta6);
        conta6.depositar(100000);       
        System.out.println(conta6+"\n\n\n\n\n");

        //VVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVV TESTE CONTA EMPRESARIAL
        String cnpj = "32131231";
        nome = "bruno";

        PessoaJuridica representante = new PessoaJuridica(nome, cnpj);

        ContaEmpresarial conta7 = new ContaEmpresarial(nroConta, agencia, representante);
        ContaEmpresarial conta8 = new ContaEmpresarial(nroConta, agencia, representante);//NÃO CONSEGUI RESOLVER O ERRO DO NULL POINTERd EXCEPTION

        conta7.sacar(1560);
        System.out.println(conta7);
        conta8.depositar(10424);
        System.out.println(conta8);

        

    }
}