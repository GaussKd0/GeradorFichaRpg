import java.util.Scanner;
public class main {

	public static void main(String[] args) {  
		Rpg rpg = new Rpg();
		Scanner scan = new Scanner(System.in);
		
		int i;
		i = 3;		
		while(i > 2 || i < 1) {
			
			System.out.println("Deseja Gerar Uma Ficha De Rpg, Aleatoria Ou Manual {1} Para Aleatoria E {2} Para Manual");
			i = scan.nextInt();
			
			if(i == 1) {
				
				Aleatorio.Aleatorizar();
				System.out.println("Ficha Aleatoria Gerada!");
				GerarArquivo.LerFicha("Ficha.txt");
			}
			else if (i == 2) {
				
				String Nome = scan.nextLine();
				rpg.setNome(Nome);
				
				System.out.println("Escolha O Genero {1} Para Homen {2} Para Mulher");
				rpg.setGenero(scan.nextInt());
				
				System.out.println("Escolha A Sua Magia {1} Para Fogo {2} Para Terra {3} Agua {4} Eletricidade {5} Luz ");
				rpg.setMagia(scan.nextInt());
				
				System.out.println("Qual Raça Deseja {1} para Humano {2} para Elfo {3} para Gigante {4} para Anão");
				rpg.setRacas(scan.nextInt());
				
				System.out.println("Qual SubClasse Deseja {1} para Feiticeiro {2} para Guerreiro {3} para Assassino {4} para Necromancer");
				rpg.setSubClass(scan.nextInt());
				
		                rpg.setAtk();
		                rpg.setHp();
		                rpg.setMagia();
		                rpg.setVelocidade();
		                rpg.setDado(20);
		                rpg.setCarisma(10);
		                rpg.setSorte(10);
				
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
				
				System.out.println("Ficha Gerada Com Sucesso!");
								
				System.out.println("Sua Ficha!");
				
				GerarArquivo.LerFicha("Ficha.txt");
				
			}
			else {
				
				System.out.println("Escolha Incorreta!");
			}
			

		}
		
	}

}
