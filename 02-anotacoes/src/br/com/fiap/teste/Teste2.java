package br.com.fiap.teste;

import br.com.fiap.anotacao.Tabela;
import br.com.fiap.bean.Pessoa;

public class Teste2 {

	public static void main(String[] args) {

		
		Pessoa p = new Pessoa();
		Tabela tabela = p.getClass().getAnnotation(Tabela.class);
		
		
		System.out.println("SELECT * FROM " + tabela.nome());
		
		
		
		
	}

}
