package org.lesson.java.caffe;

import java.math.BigDecimal;

public class Bevanda {
	private String nome;
	private BigDecimal prezzo;
	
	public Bevanda(String nome, BigDecimal prezzo) {
		super();
		this.nome=nome;
		this.prezzo=prezzo;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public BigDecimal getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(BigDecimal prezzo) {
		this.prezzo = prezzo;
	}
}
