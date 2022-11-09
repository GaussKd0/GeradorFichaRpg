import java.util.Scanner;
import java.util.Random;

public class Rpg {
	
	private String Racas;
	private String Nome;
	private String Genero;
	private String TipoMagia;
	private int Dados;
	private String Atk;
	private String Hp;
	private String Magia;
	private String Velocidade;
	
	
	public String getRacas() {	
		
		return "Sua Raca: " + this.Racas + "\n===================================" + "\n===================================";
	 }
	
	public String getNome() {
		
		return "Seu Nome: " + this.Nome + "\n===================================" + "\n===================================";
	}
	
    public String getGenero() {
		
		return "Seu Genero: " + this.Genero + "\n===================================" + "\n===================================";
	}
    
    public String getTipoMagia() {
		
		return "Sua Magia: " + this.TipoMagia + "\n===================================" + "\n===================================";
	}
    
    public int getDados() {
    	
    	return this.Dados ;
    }
    
    public String getAtk() 
    {
    	return "Sua Força: " + this.Atk + "\n===================================" + "\n===================================" ;
    }
    
    public String getHp() 
    {
    	return "Seu Hp: " + this.Hp + "\n===================================" + "\n===================================";
    }
    
    public String getMagia() 
    {
    	return "Quantidade Mana: " + this.Magia + "\n===================================" + "\n===================================";
    }
    
    public String getVelocidade() 
    {
    	return "Sua Velocidade: " + this.Velocidade + "\n===================================" + "\n===================================";
    }
    

    public void setNome(String Nome) {
    	
    	Scanner scan = new Scanner(System.in);
           while(Nome.length() == 0) {
        	   System.out.println("Digite Um Nome");
        	   Nome = scan.nextLine();
    	}
    	this.Nome = Nome;
    }
    
    public void setGenero(int Genero) {
    	
    	Scanner scan = new Scanner(System.in);
           while(Genero > 2 || Genero == 0) {
        	   System.out.println("Escolha O Genero {1} Para Homen {2} Para Mulher");
        	   Genero = scan.nextInt();
           }
        if(Genero == 1) {
        	this.Genero = "Homen";
        }
        
        else {
        	this.Genero = "Mulher";
        }
    	
    }
    
    public void setMagia(int Magia) {
    	
    	Scanner scan = new Scanner(System.in);
           while(Magia > 5 || Magia == 0) {
        	   System.out.println("Escolha A Sua Magia {1} Para Fogo {2} Para Terra {3} Agua {4} Eletricidade {5} Luz ");
        	   Magia = scan.nextInt();
           }
           
         switch(Magia) {
           case 1 ->{
        	 this.TipoMagia = "Fogo";
           }
           
           case 2 ->{
          	 this.TipoMagia = "Terra";
           }
           
           case 3 ->{
          	 this.TipoMagia = "Agua";
           }
           
           case 4 ->{
             this.TipoMagia = "Eletricidade";
           }
           
           case 5 ->{
              this.TipoMagia = "Luz";
           }
             
           
         }
       	
    }
    
    public void setRacas(int Racas) {
    	
    	Scanner scan = new Scanner(System.in);
		while(Racas > 4 || Racas == 0) {
			System.out.println("Qual Raça Deseja {1} para Humano {2} para Elfo {3} para Gigante {4} para Anão");
			Racas = scan.nextInt();
		}
		
		switch(Racas) {
          case 1 ->{
       	     this.Racas = "Humano";
          }
          
          case 2 ->{
         	 this.Racas = "Elfo";
          }
          
          case 3 ->{
         	 this.Racas = "Gigante";
          }
          
          case 4 ->{
            this.Racas = "Anão";
          }  
          
        }
    }
    
    public void setAtk() 
    {
    	switch(Racas) {
        case "Humano" ->{
     	     this.Atk = "5";
        }
        
        case "Elfo" ->{
       	 this.Atk = "3";
        }
        
        case "Gigante" ->{
       	 this.Atk = "10";
        }
        
        case "Anão" ->{
          this.Atk = "4";
        }  
    }	    	 
  }
    
  public void setHp() 
    {
    	switch(Racas) {
        case "Humano" ->{
     	     this.Hp = "3";
        }
        
        case "Elfo" ->{
       	 this.Hp = "3";
        }
        
        case "Gigante" ->{
       	 this.Hp = "15";
        }
        
        case "Anão" ->{
          this.Hp = "5";
        }  
    }
  }
  
  public void setMagia() 
  {
	  
  	switch(Racas) {
      case "Humano" ->{
   	     this.Magia = "2";
      }
      
      case "Elfo" ->{
     	 this.Magia = "5";
      }
      
      case "Gigante" ->{
     	 this.Magia = "0";
      }
      
      case "Anão" ->{
        this.Magia = "1";
      }  
  }
 }
  
  public void setVelocidade() 
   {
	  
  	switch(Racas) {
      case "Humano" ->{
   	     this.Velocidade = "4";
      }
      
      case "Elfo" ->{
     	 this.Velocidade = "8";
      }
      
      case "Gigante" ->{
     	 this.Velocidade = "2";
      }
      
      case "Anão" ->{
        this.Velocidade = "1";
      }  
    }
  	
  }
  public void setDado(int Dados) {
	  Random random = new Random();
	  Dados = random.nextInt(Dados);
	  this.Dados = Dados;

  }
  
}
