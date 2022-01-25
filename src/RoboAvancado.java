import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RoboAvancado extends Robo {	
	@Override 
	public void Responda(String pergunta)  {		
		try {			
			if(pergunta.toUpperCase().equals("SOME")) {		
				BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
				
				System.out.print("valor 1: ");
				String valor1 = reader.readLine();
				
				System.out.print("valor 2: ");
				String valor2 = reader.readLine();
				
				int result = Integer.parseInt(valor1)  + Integer.parseInt(valor2);
				
				System.out.println("Essa eu sei! O resultado é " + result );
				
			} else if(pergunta.toUpperCase().equals("SUBTRAIA")) {		
				BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
				
				System.out.print("valor 1: ");
				String valor1 = reader.readLine();
				
				System.out.print("valor 2: ");
				String valor2 = reader.readLine();
				
				int result = Integer.parseInt(valor1) - Integer.parseInt(valor2);
				
				System.out.println("Essa eu sei! O resultado é " + result );
				
			} else if(pergunta.toUpperCase().equals("MULTIPLIQUE")) {		
				BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
				
				System.out.print("valor 1: ");
				String valor1 = reader.readLine();
				
				System.out.print("valor 2: ");
				String valor2 = reader.readLine();
				
				int result = Integer.parseInt(valor1) * Integer.parseInt(valor2);
				
				System.out.println("Essa eu sei! O resultado é " + result );
				
			} else if(pergunta.toUpperCase().equals("DIVIDA")) {		
				BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
				
				System.out.print("valor 1: ");
				String valor1 = reader.readLine();
				
				System.out.print("valor 2: ");
				String valor2 = reader.readLine();
				
				if(valor2.equals("0")) {
					System.out.println("Não é possível dividir por 0 (zero), tente novamente!");
					return;
				}
				
				Double result = Double.parseDouble(valor1) / Double.parseDouble(valor2);
				
				System.out.println("Essa eu sei! O resultado é " + result );
				
			} else {
				super.Responda(pergunta);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}