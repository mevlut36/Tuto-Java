package fr.mev.tuto;

import java.util.concurrent.TimeUnit;

public class Main {
		
	public static void main(String[] args) throws InterruptedException {
		System.out.println("! Mev Fight !");
		//
		String name = "Mevlut";
		int life = 20;
		int power = 150;
		int defense = 50;
		
		int tower_life = 1000;
		int tower_defense = 50;
		
		if(name != null) {
			int attack = tower_life - power - tower_defense;
			System.out.println(attack);
		}
		
		//TimeUnit.SECONDS.sleep(3);
		
		if(name != null) {
			int attack = life - tower_defense;
			System.out.println(attack);
			
			if(attack < 0) {
				System.out.println("You lose");
			}
		}
		
		//SUITE AVEC DES FONCTIONS...
		
		
	}

}
