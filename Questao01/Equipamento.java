package aula09;

public class Equipamento {
	private int numeroEquipamento;
	private String nomeEquipamento;
	
	public int getnumeroEquipamento() {
		return this.numeroEquipamento;
	}
	
	public String getNomeEquipamento() {
		return this.nomeEquipamento;
	}

	
	
	public void setnumeroEquipamento(int valor) {
		 this.numeroEquipamento=valor;
	}
	public void setNomeEquipamento(String valor) {
		this.nomeEquipamento=valor;
	}
	
}
