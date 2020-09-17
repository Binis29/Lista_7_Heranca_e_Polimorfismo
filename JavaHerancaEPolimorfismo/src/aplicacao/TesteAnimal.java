package aplicacao;

import java.util.Scanner;

import entidades.Cachorro;
import entidades.Cavalo;
import entidades.Preguica;

public class TesteAnimal {
	
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	Cachorro cachorro = new Cachorro("Cachorro", 7, "latido", "corre" );
	Cavalo cavalo = new Cavalo("Cavalo", 8, "Relinchar", "trota.");
	Preguica preguica = new Preguica ("Pregui�a", 16, "shshshshs", "sobe em �rvores.");
	
	cachorro.exibir();
	cavalo.exibir();
	preguica.exibir();
	
	sc.close();
	
		
	}
			
}