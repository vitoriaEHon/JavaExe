//Classe Main

//Main principal

public class Main {

    public static void main(String args[]) {

       Conta minhaConta1 = new Conta();
       ContaCorrente minhaConta2 = new ContaCorrente();
       ContaPoupanca minhaConta3 = new ContaPoupanca();

       //Primeira conta- Apenas metodos de Conta
       System.out.println("----------Implementação metodos Conta----------");
       minhaConta1.saldo = 5000.0;
       System.out.println("Saldo incial: " + minhaConta1.saldo + "\n");
       
       minhaConta1.deposito = 1000.0;
       minhaConta1.depositarSaldo(minhaConta1.deposito);
       System.out.println("\tSaldo Após deposito de " + minhaConta1.deposito + ": " + minhaConta1.saldo);

       minhaConta1.saque = 500.0;
       minhaConta1.sacarSaldo(minhaConta1.saque);
       System.out.println("\tSaldo Após saque de " + minhaConta1.saque + ": " + minhaConta1.saldo);

       minhaConta1.atualiza(0.10);
       System.out.println("\tSaldo após atualizar de acordo com uma taxa percentual: " + minhaConta1.saldo);
  
       minhaConta1.pegarSaldo();

       //Segunda conta- Metodos Herdados de Conta, metodos Corrente
       System.out.println("\n------Implementação metodos Conta Corrente------");
       minhaConta2.saldo = 3000.0;
       System.out.println("Saldo incial: " + minhaConta2.saldo + "\n");
       
       minhaConta2.deposito = 500.0;
       minhaConta2.depositarSaldoCorrente(minhaConta2.deposito);
       System.out.println("\tSaldo Após deposito de " + minhaConta2.deposito + ": " + minhaConta2.saldo);

       minhaConta2.saque = 300.0;
       minhaConta2.sacarSaldo(minhaConta1.saque);
       System.out.println("\tSaldo Após saque de " + minhaConta2.saque + ": " + minhaConta2.saldo);

       minhaConta2.atualizaCorrente(0.5);
       System.out.println("\tSaldo após atualizar de acordo com uma taxa percentual: " + minhaConta2.saldo);
  
       minhaConta2.pegarSaldo();

       //Terceira conta - Metodos Herdados de Conta, metodos poupança
       System.out.println("\n------Implementação metodos Conta Poupanca------");
       minhaConta3.saldo = 7000.0;
       System.out.println("Saldo incial: " + minhaConta3.saldo + "\n");
       
       minhaConta3.deposito = 2000.0;
       minhaConta3.depositarSaldo(minhaConta3.deposito);
       System.out.println("\tSaldo Após deposito de " + minhaConta3.deposito + ": " + minhaConta3.saldo);

       minhaConta3.saque = 600.0;
       minhaConta3.sacarSaldo(minhaConta3.saque);
       System.out.println("\tSaldo Após saque de " + minhaConta3.saque + ": " + minhaConta3.saldo);

       minhaConta3.atualizaPoupanca(0.2);
       System.out.println("\tSaldo após atualizar de acordo com uma taxa percentual: " + minhaConta3.saldo);
  
       minhaConta3.pegarSaldo();
        

    }
}


