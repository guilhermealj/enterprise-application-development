package br.com.fiap.anotacao;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)// mantem a anota��o at� a execu��o
public @interface Tabela {

	String nome();
}
