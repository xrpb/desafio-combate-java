package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Champion;

public class combate {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		
		System.out.println("Digite os dados do primeiro campeão: ");
		System.out.print("Nome: ");
		String name1 = sc.nextLine();
		
		System.out.print("Vida inicial: ");
		int life1 = sc.nextInt();
		
		System.out.print("Ataque: ");
		int attack1 = sc.nextInt();
		
		System.out.print("Armadura: ");
		int armor1 = sc.nextInt();
		
		Champion c1 = new Champion(name1, life1, attack1, armor1);
		
		System.out.println();
		
		System.out.println("Digite os dados do segundo campeão: ");
		
		System.out.print("Nome: ");
		sc.nextLine();
		String name2 = sc.nextLine();
		
		System.out.print("Vida inicial: ");
		int life2 = sc.nextInt();
		
		System.out.print("Ataque: ");
		int attack2 = sc.nextInt();
		
		System.out.print("Armadura: ");
		int armor2 = sc.nextInt();
		Champion c2 = new Champion(name2, life2, attack2, armor2);
		
		System.out.print("Quantos turnos você deseja executar?");
	
		int rounds = sc.nextInt();
		
		for (int i = 1; i <= rounds && c1.life > 0 && c2.life > 0; i++) {
			c1.takeDamage(c2);
			c2.takeDamage(c1);
		
			
			System.out.println();
			System.out.println("Resultado do turno " + i);
			System.out.println(c1.status());
			System.out.println(c2.status());
			System.out.println();
			
			sc.close();
		}
		System.out.println("FIM DO COMBATE");
		sc.close();
	}

	

}
