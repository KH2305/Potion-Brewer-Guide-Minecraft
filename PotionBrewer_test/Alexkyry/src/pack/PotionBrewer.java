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
		String[] ingredients = {"Fermented Spider Eye", "GlisteningMelon", "GoldenCarrot", "MagmaCream", "BrewingStand", "GlassBottles", "TurtleHelm", "Dragons Breath"};
		String[] iRecipes= {"Spider Eye, Sugar, Brown Mushroom", "Melon, 8 Gold nuggets", "Carrot, 8 Gold nuggets", "BlazePowder, SlimeBall", "3 Cobble, 1 BlazeRod", "3 Glass", "5 Scute", 
				"Click Glass Bottle on the purple particle Spit effect during the Dragon boss"};
			
		boolean notFound = true;
		while(notFound) {
		
			System.out.println("Select a potion or an ingredient to find its recipe. Type 'Recipe List' or potion list for each.");
			
	        Scanner i = new Scanner(System.in);  //Input anything.
			
			String word = i.nextLine(); 
				
				if(word.equalsIgnoreCase("Potion List")) {

			        for(int l = 0; l < potions.length ; l++)  {
			        	System.out.println(potions[l]);
			        }
				} 
			    else if(word.equalsIgnoreCase("Recipe List")) {

				    for(int r = 0; r < mat.length ; r++)  {
				        System.out.println(mat[r]);
				    }
			    }
				
				for(int p = 0; p < potions.length; p++) {
					if(word.equalsIgnoreCase(potions[p])) {
						System.out.println(recipes[p]);
						notFound = false;
					}
				}
				
				for(int p = 0; p < ingredients.length; p++) {
					if(word.equalsIgnoreCase(ingredients[p])) {
						System.out.println(iRecipes[p]);
						notFound = false;
					}
				}
		}		

		System.out.print("Restart The Program, to select a new recipe");
		
		Scanner ex = new Scanner(System.in);
		
		String exitKey = ex.nextLine(); 
					
			}
}