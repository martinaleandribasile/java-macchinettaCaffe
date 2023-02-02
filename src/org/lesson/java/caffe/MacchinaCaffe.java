package org.lesson.java.caffe;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Formatter.BigDecimalLayoutForm;
import java.util.HashMap;


public class MacchinaCaffe {
	ArrayList<Bevanda> elencoBevande= new ArrayList<Bevanda>(); 
	HashMap<BigDecimal, Integer> mappaMonete= new HashMap<BigDecimal, Integer>();
	
	public MacchinaCaffe() {
		super();
		elencoBevande.add(new Bevanda("caffe noramle", new BigDecimal("0.50")));
		elencoBevande.add(new Bevanda("caffe macchiato", new BigDecimal("0.60")));
		elencoBevande.add(new Bevanda("caffe ginseng", new BigDecimal("0.70")));
		
		mappaMonete.put(new BigDecimal("0.05"), 0);
		mappaMonete.put(new BigDecimal("0.10"), 0);
		mappaMonete.put(new BigDecimal("0.20"), 0);
		mappaMonete.put(new BigDecimal("0.50"), 0);
		mappaMonete.put(new BigDecimal("1"), 0);
		mappaMonete.put(new BigDecimal("2"), 0);
	}
	
	public void aggiungiMoneta(BigDecimal moneta) {
		mappaMonete.put(moneta, mappaMonete.get(moneta)+1);
	}
	public void erogaBevanda(int numeroBevanda) {
		    String bevanda = elencoBevande.get(numeroBevanda).getNome();
		    System.out.println("Bevanda " + bevanda + " erogata!");
	}
	
	public BigDecimal getTotale() {
		BigDecimal somma =new BigDecimal("0");
		for (BigDecimal i : mappaMonete.keySet()) {
			somma=somma.add(i.multiply(new BigDecimal(mappaMonete.get(i))));
		    }
		return somma;
	}
}
