import java.util.Random;
public class Aleatorio {

	public static void Aleatorizar() {
		Rpg rpg = new Rpg();
		Random random = new Random();
		String[] Nomes = { "Armstrong", "Maximilian", "Adônis", "Ícarus", "Hélio", "Zeus", "Gustavo"
				
		
		};
		String[] NomesFemininos = { "Alice", "Medusa", "Kaliope", "Maya", "Gusatavo", "Lenaa"
				
				
		};
	    rpg.setGenero(random.nextInt(1,2));
	    	
	    rpg.setNome( Nomes[new Random().nextInt(Nomes.length)]);
            rpg.setRacas(random.nextInt(1,4));
            rpg.setMagia(random.nextInt(1,5));
            rpg.setCarisma(10);
            rpg.setSorte(10);
            rpg.setAtk();
            rpg.setHp();
            rpg.setMagia();
            rpg.setVelocidade();
            rpg.setSorte(random.nextInt(10));
            rpg.setSubClass(random.nextInt(1,4));
        
            System.out.println("Dados Girados: " + rpg.getDados());
        
	    GerarArquivo.EscreverFicha("Ficha.txt", rpg.getNome());
	    GerarArquivo.EscreverFicha("Ficha.txt", rpg.getGenero());
	    GerarArquivo.EscreverFicha("Ficha.txt", rpg.getRacas());
	    GerarArquivo.EscreverFicha("Ficha.txt", rpg.getTipoMagia());
	    GerarArquivo.EscreverFicha("Ficha.txt", rpg.getHp());
	    GerarArquivo.EscreverFicha("Ficha.txt", rpg.getAtk());
	    GerarArquivo.EscreverFicha("Ficha.txt", rpg.getMagia());
	    GerarArquivo.EscreverFicha("Ficha.txt", rpg.getVelocidade());
	    GerarArquivo.EscreverFicha("Ficha.txt", rpg.getCarisma());
	    GerarArquivo.EscreverFicha("Ficha.txt", rpg.getSubClasse());
	    GerarArquivo.EscreverFicha("Ficha.txt", rpg.getSorte());
	}
}
