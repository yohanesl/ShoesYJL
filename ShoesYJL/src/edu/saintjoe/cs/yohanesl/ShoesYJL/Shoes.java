package edu.saintjoe.cs.yohanesl.ShoesYJL;

public class Shoes {
	
		public static final int MAXRETROS = 21;
		
		private String brand;
		private String type;
		private Retro[] retros;
		
		public Shoes (String newBrand, String newType) {
			retros = new Retro[MAXRETROS];
			brand = newBrand;
			type = newType;
		}
		
		public void setRetro(Retro newRetro, int howMany) {
			if (howMany > (MAXRETROS -1)) {
				System.out.println("You are out of bounds!");
				return;
			}
			retros[howMany] = newRetro;
		}
		
		public String toString() {
			
		
			
			
		
				
				
		
				


	}

}
