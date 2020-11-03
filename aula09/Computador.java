package aula09;

public class Computador extends Equipamento{
	private int numeroComputador;
	private String nomeComputador;
	
	
	public int getNumeroComputador() {
		return this.numeroComputador;
	}
	
	public String getNomeComputador() {
		return this.nomeComputador;
	}

	
	
	public void setNumeroComputador(int valor) {
		 this.numeroComputador=valor;
	}
	public void setNomeComputador(String nome) {
		this.nomeComputador=nome;
	}

}
