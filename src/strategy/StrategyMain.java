package strategy;

public class StrategyMain {

	public static void main(String[] args) {

		var icms = new ICMS();
		var iss = new ISS();
		
		var orcamento = new Orcamento(500.00);
		
		var calculadorDeImposto = new CalculadorDeImposto();
		
		calculadorDeImposto.realizarCalculo(orcamento, icms);
		calculadorDeImposto.realizarCalculo(orcamento, iss);
	}

}
