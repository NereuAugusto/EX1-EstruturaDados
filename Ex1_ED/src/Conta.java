
public class Conta {
	String nome, cpf;
	double saldo;
	
	
	public Conta(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
		
	}
	
	@Override
	public boolean equals(Object obj) {
		Conta x = (Conta) obj;
		
		if(x.cpf.equals(cpf)) {
			return true;
			
		} else {
			
			return false;
		}
	}
	
	@Override
	public String toString() {
		return "Nome = " + nome + 
			   "\nCPF = " + cpf +
			   "\nSaldo = " + String.format("%.2f", saldo);
	}
	
}