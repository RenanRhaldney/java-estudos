package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListaOverview {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		
		list.add("renan");
		list.add("Thiago");
		list.add("Ravi");
		list.add("Joao");
		list.add("Matheus");
		list.add("Gabriel");
		list.add("Leandro");
		list.add("Lidio");
		
		// Parametros = Posição e valor
		list.add(2, "Felipe");
		System.out.println(list.size());
		for(String x : list) {
			System.out.println(x);
		}
		
		System.out.println("------------------------------------------------------------------");
		list.remove("Joao");
		list.remove(1);
		// remove toda string que inicia com a letra R maiuscula ou menuscula
		list.removeIf(x -> x.charAt(0) == 'R' || x.charAt(0) == 'r');
		for(String x : list) {
			System.out.println(x);
		}
		
		System.out.println("------------------------------------------------------------------");
		// Filtra a lista deixando somente os que começam com a letra L
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'L').collect(Collectors.toList());
		for(String x : result) {
			System.out.println(x);
		}
		
		System.out.println("------------------------------------------------------------------");
		String nome = list.stream().filter(x -> x.charAt(0) == 'G').findFirst().orElse(null);
		System.out.println(nome);
	}
}
