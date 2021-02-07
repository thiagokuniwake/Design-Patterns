package chainResponsibility;

public class ChainResponsibilityMain {

	public static void main(String[] args) {
		var d1 = new DescontoPorCincoItens();
        var d2 = new DescontoPorMaisDeQuinhentosReais();
        var d3 = new SemDesconto();

        d1.setProximo(d2);
        d2.setProximo(d3);

        var orcamento = new Orcamento(600.50);
        var desconto = d1.desconta(orcamento);
        System.out.println(desconto);
	}

}
