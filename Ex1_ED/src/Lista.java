
import javax.swing.JOptionPane;

public class Lista<T> {
	No<T> inicio, fim;
	int tamanho=0;
	
	public void inserirFinal(T dado) {
		No<T> x = new No<T>(dado);
		
		if(tamanho == 0) {
			inicio = x;
		} else {
			x.esq = fim;
			fim.dir = x;
		}
		 
		fim = x;
		tamanho++;
		
	}
	
	public No<T> pesquisar(T dado){
		No<T> x = inicio;
		boolean achou = false;
		while(x != null && achou == false) {
			if(x.dado.equals(dado)) {
				achou = true;
				break;
			}
			x = x.dir;
		}
		
		return x;
	}
	
	public void remover(T dado) {
		No<T> x = pesquisar(dado);
		
		if(x == null) {
			JOptionPane.showMessageDialog(null, "ERRO! Não foi encontado o valor informado!");
		} else {
			if(tamanho == 1) {
				inicio = fim = null; 
			} else {
				if(x == inicio) { 
					x.dir.esq = null;
					inicio = x.dir;
					x.dir = null;
				} else if(x == fim) {
					fim = x.esq;
					x.esq = null;
					x.esq.dir = null;
				} else {
					x.esq.dir = x.dir;
					x.dir.esq = x.esq;
					x.esq = x.dir = null;
				}
			}
			tamanho--;
			JOptionPane.showMessageDialog(null, "REMOVIDO COM SUCESSO!");
		}
	}
	
	public void imprimir() {
		No<T> x = inicio;
		x = inicio;
		while(x != null) {
			JOptionPane.showMessageDialog(null, x.dado);
			x = x.dir;
		}
	}
}