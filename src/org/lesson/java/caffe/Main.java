package org.lesson.java.caffe;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		MacchinaCaffe macchina = new MacchinaCaffe();
		
		System.out.println("Seleziona la bevanda: 0->caffe normale, 1-> caffe macchiato, 2-> caffe ginseng");
		int decisione = s.nextInt();
		boolean prezzoInserito=false;
		BigDecimal prezzo=macchina.elencoBevande.get(decisione).getPrezzo();
		System.out.println("Il prezzo della bevanda scelta e: " + prezzo + " euro");
		do {
			System.out.println("Aggiugni moneta-> inseribili da 0,05-0,10-0,20-0,50-1-2");
			BigDecimal moneta= s.nextBigDecimal();
			if(moneta.compareTo(prezzo)>0 ) {
				BigDecimal diff= moneta.subtract(prezzo);
				System.out.println("Il totale inserito e' maggiore del prezzo necessario, le verra' erogato un resto di : " + diff + " euro");
				macchina.erogaBevanda(decisione);
				prezzoInserito=true;
			}else if(moneta.compareTo(prezzo)<0) {
				macchina.aggiungiMoneta(moneta);
				//System.out.println(macchina.mappaMonete.get(new BigDecimal("0.50")));
				System.out.println("totale inserito: " + macchina.getTotale() + " euro");
				prezzoInserito=false;
				if(macchina.getTotale().compareTo(prezzo)== 0) {
					System.out.println("Prezzo inseririto correttamente, attendere....");
					macchina.erogaBevanda(decisione);
					prezzoInserito=true;
				}else if( macchina.getTotale().compareTo(prezzo)> 0) {
					BigDecimal diff= macchina.getTotale().subtract(prezzo);
					System.out.println("Il totale inserito e' maggiore del prezzo necessario, le verra' erogato un resto di : " + diff + " euro");
					macchina.erogaBevanda(decisione);
					prezzoInserito=true;
				}
			} 
			
		}while(!prezzoInserito);
		System.out.println("Grazie a Arrivederci");
	}

}

