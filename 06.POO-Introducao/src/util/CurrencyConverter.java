package util;

public class CurrencyConverter {
	
	//Atributos e métodos estáticos pertencem à classe, e não às suas instâncias. Por isso, 
	//podem ser acessados diretamente pelo nome da classe, sem a necessidade de instanciá-la.
	public static double IOF = 0.06;	
	
	public static double dollarToReal (double amount, double dollarPrice) {
		return amount * dollarPrice * (1.0 + IOF);
	}

}
