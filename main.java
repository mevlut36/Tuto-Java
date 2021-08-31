package fr.mev.tuto;

import java.util.concurrent.TimeUnit;

public class Main {
		
	public static void main(String[] args) throws InterruptedException {
		System.out.println("! Mev Fight !");
		//
		String name = "Mevlut";
		int life = 100;
		int power = 150;
		
		int tower_life = 1000;
		int tower_defense = 50;
		
		if(name != null) {
			int attack = tower_life - power - tower_defense;
			System.out.println(attack + "800HP - Tower");
		}
		
		while(true) {
			int life_fight = life - tower_defense;
			System.out.println(life_fight);
			TimeUnit.SECONDS.sleep(2);
			
			System.out.println("GG " + name + ", You survived");
			
			if(life_fight < 0) {
				System.out.println(name + " You die");
				break;
			}
		}
		
		
		//SUITE AVEC DES FONCTIONS...
		
		
	}

}
