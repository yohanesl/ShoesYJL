package edu.saintjoe.cs.yohanesl.ShoesYJL;

public class RetroDriver {

	public static void main(String[] args) {
		
		int retroCount = 0;
		
		Shoes jordans = new Shoes("Nike", "Air Jordan");
		
		Retro nextRetro= new Retro("Retro 1", 1, 1984);
		jordans.setRetro(nextRetro, retroCount++);
		nextRetro = new Retro("Retro 2", 2, 1987);
		jordans.setRetro(nextRetro, retroCount++);
		nextRetro = new Retro("Retro 3", 3, 1988);	
		jordans.setRetro(nextRetro, retroCount++);
		System.out.println(jordans.toString());
		
	}

}
