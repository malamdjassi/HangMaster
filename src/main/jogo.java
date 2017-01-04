package main;

import java.io.IOException;
import java.util.Scanner;

public class jogo {
	 
	static dicionario d = new dicionario();
	static enforcado p = new enforcado(d.randomizeWord());


	public static void main(String[] args) throws IOException 
	{
		Scanner input = new Scanner(System.in);
		
	  do{
		  if(p.isVictor() == false ){
			  
			  //teste
			  switch (p.getState())
				{
				case 1: 
					System.out.println("\n _____");
					break;
				case 2:
					System.out.println("\n   |  \n  |  \n __|_");
					break;
				case 3:
					System.out.println("\n   |  \n  |  \n   |  \n  |  \n __|_");
					break;
				case 4:
					System.out.println("\n   |--- \n  |  \n  |  \n  |  \n __|_");
					break;
				case 5:
					System.out.println("\n   |--- \n  |  \n  |  | \n  |  \n __|_");
					break;
				case 6:
					System.out.println("\n  |--- \n  |  \n   |  | \n  |  0 \n __|_");
					System.out.println("  PERDEU");
					break;
				}
			  
			  //fim de teste
			  
			  
			  
			  
			  
	  System.out.println("Qual é a letra que escolhe?: ");
	  p.receiveLetter(input.next().charAt(0));
	  
	  System.out.println(p.returnCrypt());
	     

	  
	  
		  }
		  else{
			  System.out.println("Venceu");
			  break;
			  
		  }
	  }while(p.getState() < 6 || !p.isVictor());
	  
	

		
		
	}
	
	public void updateGraph()
	{
		/*
		switch (p.getState())
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
		}*/
		
	}
	public static void cls (){
		int linha = 0;
		while (linha <= 50){
			linha ++ ;
			System.out.println("");
		}
		
	}
		
		
	
}
