package aula09;

public class TestaEquipamento {
	public static void main(String[] args) {
		Equipamento novoEquipamento = new Equipamento(); 
		Computador novoComputador = new Computador(); 
		
		novoEquipamento.setnumeroEquipamento(30);
		novoEquipamento.setNomeEquipamento("máquina");
		
		novoComputador.setNumeroComputador(20);
		novoComputador.setNomeComputador("PC");
		
		
		System.out.println("Numero do Equipamento" + novoEquipamento.getnumeroEquipamento());
		System.out.println("Nome do Equipamento" + novoEquipamento.getNomeEquipamento());
		
		System.out.println("Numero do Equipamento" + novoComputador.getNumeroComputador());
		System.out.println("Nome do Equipamento" + novoComputador.getNomeComputador());
	}
}
