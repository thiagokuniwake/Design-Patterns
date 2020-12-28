package strategy;

public class CalculadorDeImposto {
	
	public void realizarCalculo(Orcamento orcamento, Imposto qualquerImposto) {
		var valorImposto = qualquerImposto.calcular(orcamento);
		System.out.println(valorImposto);
	}
}
