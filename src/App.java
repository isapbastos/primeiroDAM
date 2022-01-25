import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {

	public static void main(String[] args) {
		UserAction acaoUsuario = new UserAction();
		RoboPremium robo = new RoboPremium(acaoUsuario);
		
		System.out.println("Me pergunte algo!");
		
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));	
			
			System.out.print("Digite sua pergunta: ");
			String input = reader.readLine();
			
			robo.Responda(input);
			
			while(robo.canRepeat) {
				System.out.print("Pode fazer outra pergunta: ");
				input = reader.readLine();
				robo.Responda(input);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}