package main;

import java.io.IOException;

public class jogo {
	 dicionario d = new dicionario();
	 enforcado p = new enforcado();
	 static char letra;


	public static void main(String[] args) throws IOException 
	{
		 
		
		 
		
		 
	  do{
	  System.out.println("Qual é a letra que escolhe?: ");
	  letra = (char)System.in.read();
	  
	  //if ()
	  }while(p.state == 6);
	  
	

		
		
	}
	
	public void updateGraph()
	{
		switch (p.state)
		{
		case 1: 
			System.out.println("_____");
			break;
		case 2:
			System.out.println("  |  \n  |  \n __|_");
			break;
		case 3:
			System.out.println("  |  \n  |  \n  |  \n  |  \n __|_");
			break;
		case 4:
			System.out.println("  |--- \n  |  \n  |  \n  |  \n __|_");
			break;
		case 5:
			System.out.println("  |--- \n  |  \n  |  | \n  |  \n __|_");
			break;
		case 6:
			System.out.println("  |--- \n  |  \n  |  | \n  |  0 \n __|_");
			System.out.println("  PERDEU");
			break;
		}
		
	}

	public void input(char letter)
	{
		p.receiveLetter(this);
	}
}
