package main;

import java.util.Random;

public class dicionario {
	
	String[] palavras=
		{
				"Argentina","Portugal","Quadro","Mercedes",
				"Hotel","Cabra","Benfica","Porto","Tartaruga",
				"Cadela","Escola","Autocarro","Arvore","Batata","Fiambre","Leitao",
				"Salsicha","Porco","Cabra","Chispes","Salada","Computador","Sapato","Entremeada","Casa",
		};
	
	
	public String randomizeWord()
	{
		Random aleatorio = new Random();

		return  palavras[aleatorio.nextInt(palavras.length)].toUpperCase();
	}

}
