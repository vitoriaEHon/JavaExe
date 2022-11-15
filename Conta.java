//1. Vamos criar uma classe Conta, que possua um saldo, os métodos para pegar saldo, depositar e sacar

class Conta{

    protected double saldo;
    double deposito, saque;

    public void pegarSaldo(){

        System.out.println("\nSaldo: " + this.saldo);
    
    }

    public void depositarSaldo(double deposito){

        this.saldo = this.saldo + this.deposito;
        //System.out.println("Seu novo saldo é de "+ this.saldo);
    }

    public void sacarSaldo(double saque){
        this.saldo = this.saldo - this.saque;
        //System.out.println("Seu novo saldo é de "+ this.saldo);
    }



//2. Adicione um método na classe Conta, que atualiza essa conta de acordo com uma taxa percentual fornecida

    public void atualiza( double taxa){

        this.saldo += this.saldo * taxa;

 }
 }
