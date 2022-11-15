/*
3. Crie duas subclasses da classe Conta: ContaCorrente e ContaPoupanca. Ambas terão o
método atualiza reescrito: A ContaPoupanca deve atualizar-se com o triplo da taxa. a
*/

class ContaPoupanca extends Conta{

    public void atualizaPoupanca(double taxa){

        double newTaxa;
        newTaxa = taxa * 3;
        this.saldo += this.saldo * newTaxa;
        
    }

}
