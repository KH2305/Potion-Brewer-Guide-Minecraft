package pack;

import java.util.Scanner;

public class PotionBrewer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] potions = {"Healing", "Regeneration", "Fire Resistance", "Swiftness","Night Vision","Invisibility","Leaping","Slowness","Water Breathing","Harming","Poison","Strength",
				"Weakness","Turtle Master","Slow Falling"};
		String[] recipes = {"Netherwart, Glistering Melon,(Redstone, Glowstone),(GunPowder, DragonsBreath)", "Netherwart,GhastTear,(Redstone, Glowstone),(GunPowder, DragonsBreath)",
				"Netherwart,Magmacream,(Redstone, Glowstone),(GunPowder, DragonsBreath)", "Netherwart->Sugar->(Redstone, Glowstone)->(GunPowder, DragonsBreath)",
				"Netherwart,GoldenCarrot,(Redstone, Glowstone),(GunPowder, DragonsBreath)", "Potion Of Night Vision, Fermented Spider Eye,(Redstone, Glowstone),(GunPowder, DragonsBreath) "
				+ "Go look at the Night Vision recipe!", "Netherwart, RabbitsFoot,(Redstone, Glowstone),(GunPowder, DragonsBreath)", "Potion of Swiftness, Fermented Spider Eye, (Redstone, Glowstone),"
				+ "(GunPowder, DragonsBreath) Go look at the Swiftness recipe", "Netherwart, PufferFish,(Redstone, Glowstone),(GunPowder, DragonsBreath)", "Poison Or Healing Potion, Fermented Spider Eye,"
				+ "(Redstone, Glowstone),(GunPowder, DragonsBreath)", "Netherwart, SpiderEye,(Redstone, Glowstone),(GunPowder, DragonsBreath)", 
				"Netherwart,BlazePowder,(Redstone, Glowstone),(GunPowder, DragonsBreath)", "WaterBottle, Fermented Spider Eye,(Redstone, Glowstone),(GunPowder, DragonsBreath)",
				"Netherwart, TurtleHelmet,(Redstone, Glowstone),(GunPowder, DragonsBreath)", "Netherwart, PhantomMembrane,(Redstone, Glowstone),(GunPowder, DragonsBreath)"};
		String[] mat = {"Fermented Spider Eye","TurtleHelm","BrewingStand","GoldenCarrot","MagmaCream","GlassBottles","GlisteningMelon","DragonsBreath"};
		        
		        Scanner i = new Scanner(System.in);  //Input anything.
		        System.out.println("Type Potion List or Recipe List, To select your potion or recipe");
				
				String word = i.nextLine(); 
				
				System.out.println("Select Potion:"  );
				
				if(word.equalsIgnoreCase("Potion List")) {

			        for(int l = 0; l < potions.length ; l++)  {
			        	System.out.println(potions[l]);
			        }
			        System.out.println("If You enter these wrong, Please Restart");
			        }
				if(word.equalsIgnoreCase("Recipe List")) {

			        for(int r = 0; r < mat.length ; r++)  {
			        	System.out.println(mat[r]);
			        }
			        }
				
		        Scanner i2 = new Scanner(System.in);  //Input anything.
				
				String word2 = i2.nextLine(); 
				
				for(int p = 0; p < potions.length; p++) {
					if(word2.equalsIgnoreCase(potions[p])) {
						System.out.println(recipes[p]);
					}
				}
				
				
if(word2.equalsIgnoreCase("Fermented Spider Eye")) {
	
	System.out.println("Spider Eye, Sugar, Brown Mushroom");
}
if(word2.equalsIgnoreCase("GlisteningMelon")) {
	
	System.out.println("Melon, 8 Gold nuggets");
}
	if(word2.equalsIgnoreCase("GoldenCarrot")) {
		
		System.out.println("Carrot, 8 Gold nuggets");
	}
		if(word2.equalsIgnoreCase("MagmaCream")) {
			
			System.out.println("BlazePowder, SlimeBall");
		}
			if(word2.equalsIgnoreCase("BrewingStand")) {
				
				System.out.println("3 Cobble, 1 BlazeRod");
			}
					if(word2.equalsIgnoreCase("GlassBottles")) {
						
						System.out.println("3 Glass");
					}
if(word2.equalsIgnoreCase("TurtleHelm")) {
						
						System.out.println("5 Scute");
						
					}
if(word2.equalsIgnoreCase("Dragons Breath")) {
	
	System.out.println("Click Glass Bottle on the purple particle Spit effect during the Dragon boss");
}
if(word2.equalsIgnoreCase("potion list")) {
	
	System.out.println("Please Restart");
}
if(word2.equalsIgnoreCase("recipe list")) {
	
	System.out.println("Please Restart");
}
System.out.println();
System.out.print("Restart The Program, to select a new recipe");


Scanner ex = new Scanner(System.in);

String exitKey = ex.nextLine(); 

					
			}
}
