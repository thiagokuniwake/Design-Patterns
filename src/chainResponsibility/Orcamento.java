package chainResponsibility;

import java.util.ArrayList;
import java.util.List;

public class Orcamento {
	
	double valor;
	List<Item> itens;
	
	Orcamento(double valor) {
		this.valor = valor;
		this.itens = new ArrayList<>();
	}
	
	public double getValor() {
		return this.valor;
	}
	
	public void adicionaItem(Item item) {
		this.itens.add(item);
	}
	
	public List<Item> getItens() {
		return this.itens;
	}
}
