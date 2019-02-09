package br.com.fiap.anotacao;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)// mantem a anotação até a execução
public @interface Tabela {

	String nome();
}
