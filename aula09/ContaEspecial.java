public class ContaEspecial extends Conta{
 
  private double limite;

  public ContaEspecial(double limite, String nome_titular, int numero) {
    super(numero, nome_titular);
    this.limite = limite;
  }

  public double getLimite() {
    return limite;
  }

  public void setLimite(double limite) {
    this.limite = limite;
  }

  public boolean sacar(double valor){
    if(valor <= this.limire + this.getSaldo){
      this.setSaldo -=valor;
    }else {
      return false;
    }
  }
}