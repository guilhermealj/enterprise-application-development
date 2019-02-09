package br.com.fiap.teste;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import br.com.fiap.anotacao.Coluna;
import br.com.fiap.bean.Pessoa;

public class Teste {

	public static void main(String[] args) {

		//instanciar pessoa
		Pessoa pessoa = new Pessoa();
		//API reflection -> obter o nome da classe
		String nome = pessoa.getClass().getName();
		System.out.println(nome);
		
		
		//obter os métodos da classe
		Method[] methods = pessoa.getClass().getDeclaredMethods();
		for(Method method : methods) {
			System.out.println(method.getName());
		}
		
		
		//obter os atributos da classe
		Field[] fields = pessoa.getClass().getDeclaredFields();	
		for (int i = 0; i < fields.length; i++) {
			System.out.println(fields[i].getName());
			//recuperar a anotação @Coluna
			Coluna anotacao = 
			fields[i].getAnnotation(Coluna.class);
			System.out.println("Nome: " + anotacao.nome());
			System.out.println("Tipo: " + anotacao.tipo());
			System.out.println("Tamanho: " + anotacao.tamanho());
		}
		
		
		
	}

}
