package main;

import java.io.IOException;

public class jogo {
	 


	public static void main(String[] args) throws IOException 
	{
		dicionario d = new dicionario();
		enforcado p = new enforcado(d.randomizeWord());

	  do{
	  System.out.println("Qual é a letra que escolhe?: ");
	  p.receiveLetter((char)System.in.read());
	  
	  System.out.println(p.returnCrypt());
	  }while(p.getState() < 6 || !p.isVictor());
	  
	

		
		
	}
	
	public void updateGraph()
	{
		
		/*switch (p.state)
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
	*/	
	}
	public static void cls (){
		int linha = 0;
		while (linha <= 50){
			linha ++ ;
			System.out.println("");
		}
		
	}
		
		
	
}
