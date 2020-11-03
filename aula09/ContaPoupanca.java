public class ContaPoupança extends Conta {

  public ContaPoupança(int numero, String nome_titular) { 
    super(numero, nome_titular);
  }

  public void reajustar(double precentual) {
    saldo = saldo + (saldo * percentual);
  }

}