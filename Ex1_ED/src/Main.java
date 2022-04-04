import javax.swing.JOptionPane;

public class Main {
	
	public static void main(String[] args) {
		int opcao;
		
		do {
			opcao = Integer.parseInt(JOptionPane.showInputDialog(menu()));
			if(opcao < 1 || opcao > 6) {
				
				JOptionPane.showMessageDialog(null, "Opção inválida");
				
			} else {
				switch(opcao) {
				
					case 1:
						Util.abrirConta();
						break;
					case 2:
						Util.sacar();
						break;
					case 3:
						Util.depositar();
						break;
					case 4: 
						Util.imprimirConta();
						break;
					case 5:
						Util.removerConta();
						break;
						
				}
			}
			
		} while(opcao != 6);
	}
	
	public static String menu() {
		
		String y = "1. Abrir conta\n";
		y += "2. Realizar saque\n";
		y += "3. Realizar depósito\n";
		y += "4. Relatório de contas\n";
		y += "5. Encerrar conta\n";
		y += "6. Encerrar aplicação";
		return y;
	}
}