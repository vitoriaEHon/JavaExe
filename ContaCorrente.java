/*
3. Crie duas subclasses da classe Conta: ContaCorrente e ContaPoupanca.Ambas terão o método atualiza reescrito: 
A ContaCorrente deve atualizar-se com o dobro da taxa. Além disso, a ContaCorrente deve reescrever o método 
deposita, a fim de retirar uma taxa bancária de dez centavos de cada depósito.
*/

class ContaCorrente extends Conta{

    public void atualizaCorrente(double taxa){

        double newTaxa;
        newTaxa = taxa * 2;
        this.saldo += this.saldo * newTaxa;

    }

    public void depositarSaldoCorrente(double deposito){

        double newDeposito;
        newDeposito = deposito - 0.10;
        this.saldo = this.saldo + newDeposito ;
        //System.out.println("Seu novo saldo é de "+ this.saldo);
    }

}
