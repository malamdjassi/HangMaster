package main;

public class enforcado 
{
	private String 	palavra				; 	// ex.: "Leitao"
	private String 	letrasRespondidas	; 	// ex.: "ABDFG";
	private int 	state				; 	// ( 0 - 6)
	/* 0-nada
	 * 1-cabeça
	 * 2-tronco
	 * 3-perna esquerda
	 * 4-perna direita
	 * 5-braço esquerdo
	 * 6-braço direito <--GAME OVER!
	 */
	//COMENTÁRIO DO COELHO
	public enforcado(String palavra)
	{
		//construtor //cria o enforcado com uma palavra
		this.palavra = palavra;
		this.state = 0;
		this.letrasRespondidas ="";
	}
	
	public String returnCrypt () //retorna palavra encriptada -> 'palavra' rescrita com letras de 'letrasRespondidas'
	{
		String output = "";
		
		for (char letter : this.palavra.toCharArray())
		{
			char L = Character.toUpperCase(letter);
			if(letrasRespondidas.indexOf(L)>=0)
			{
				output+=Character.toUpperCase(L);
			}
			else
			{
				output+="_";
			}
		}
		return output;  //ex.: L _ I _ A O (leitao) com 'letrasRespondidas'->"LIAOP"
	}
	
	public boolean isVictor() //recebe returnCrypt, se não tiver underscore, ganhou!
	{
		if(this.returnCrypt().contains("_"))
		{
			return false; //true se não existirem underscores em returnCrypt
		}
		else
		{
			return true;
		}
	}
	
	public void receiveLetter(char L) //recebe letra e insere em 'letrasRespondidas'
	{
		char letter = Character.toUpperCase(L);
		if		(letrasRespondidas.indexOf(letter)<0 && palavra.indexOf(letter)<0)
		{
			incrementer(); //aumentar state
			return;
		}
		else if (letrasRespondidas.indexOf(letter)>=0 && palavra.indexOf(letter)<0)
		{
			//NADA
			return;
		}
		else if (letrasRespondidas.indexOf(letter)<0 && palavra.indexOf(letter)>=0)
		{
			//Adiciona a 'letrasRespondidas'
			letrasRespondidas+= letter;
			return;
		}
		else if (letrasRespondidas.indexOf(letter)>=0 && palavra.indexOf(letter)>=0)
		{
			//NADA
		}
		else
		{
			//ERRO?!
			return;
		}
		//se a letra não existir em 'letrasRespondidas' nem em 'palavra'
			//Incrementar 'state'
		//se a letra  existir em 'letrasRespondidas' mas não em 'palavra'
			//NADA
		//se a letra não existir em 'letrasRespondidas' mas existir em 'palavra'
			//Adiciona a 'letrasRespondidas'
		//se a letra existir em 'letrasRespondidas' e em 'palavra' 
			//NADA
	}
	
	public int getState()
	{
		return this.state;
	}
	
	private void incrementer()
	{
		this.state++;
	}
}
