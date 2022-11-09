import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;

public class GerarArquivo {
	
    public static void EscreverFicha(String CaminhoArq, String ReceberTexto) {
    	try(
    		    FileWriter Arquivo = new FileWriter(CaminhoArq, true);
    			BufferedWriter Buffer = new BufferedWriter(Arquivo);
    			PrintWriter Escrever = new PrintWriter(Buffer);
    			){
    		Escrever.append("\n"+ReceberTexto);
    	}catch(IOException e) 
    	{
    	   e.printStackTrace();
    	}
    }
	public static void LerFicha(String CaminhoArq) {
		try(
				BufferedReader bufer = new BufferedReader(new FileReader(CaminhoArq));
				){
			String linha = "";
			while(true) {
				if(linha != null) {
					System.out.println(linha);
				}
				else {
					break;
				}
				linha = bufer.readLine();			
				}
			
		}catch (IOException e) {
			
		}
	}
 
}
