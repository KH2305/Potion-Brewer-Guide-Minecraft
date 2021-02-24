package pack;

import java.util.Scanner;

public class potionbrewer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] potions = {"Healing", "Regeneration", "Fire Resistance", "Swiftness","Night Vision","Invisibility","Leaping","Slowness","Water Breathing","Harming","Poison","Strength","Weakness","Turtle Master","Slow Falling","If You enter these wrong, Please Restart"};
		String[] mat = {"Fermented Spider Eye","TurtleHelm","BrewingStand","GoldenCarrot","MagmaCream","GlassBottles","GlisteningMelon","DragonsBreath"};
		        
		        Scanner i = new Scanner(System.in);  //Input anything.
		        System.out.println("Type Potion List or Recipe List, To select your potion or recipe");
				
				String word = i.nextLine(); 
				
				System.out.println("Select Potion:"  );
				
				if(word.equalsIgnoreCase("Potion List")) {

			        for(int l = 0; l < potions.length ; l++)  {
			        	System.out.println(potions[l]);
			        }
			        }
				if(word.equalsIgnoreCase("Recipe List")) {

			        for(int r = 0; r < mat.length ; r++)  {
			        	System.out.println(mat[r]);
			        }
			        }
				
		        Scanner i2 = new Scanner(System.in);  //Input anything.
				
				String word2 = i2.nextLine(); 
				
				if(word2.equalsIgnoreCase("Swiftness")) {
					
					System.out.println("Netherwart->Sugar->(Redstone, Glowstone)->(GunPowder, DragonsBreath)");
				}
if(word2.equalsIgnoreCase("Strength")) {
					
					System.out.println("Netherwart,BlazePowder,(Redstone, Glowstone),(GunPowder, DragonsBreath)");
				}
if(word2.equalsIgnoreCase("Fire Resistance")) {
	
	System.out.println("Netherwart,Magmacream,(Redstone, Glowstone),(GunPowder, DragonsBreath)");
}
if(word2.equalsIgnoreCase("Healing")) {
	
	System.out.println("Netherwart, Glistering Melon,(Redstone, Glowstone),(GunPowder, DragonsBreath)");
}
if(word2.equalsIgnoreCase("Regeneration")) {
	
	System.out.println("Netherwart,GhastTear,(Redstone, Glowstone),(GunPowder, DragonsBreath)");
}
if(word2.equalsIgnoreCase("Night Vision")) {
	
	System.out.println("Netherwart,GoldenCarrot,(Redstone, Glowstone),(GunPowder, DragonsBreath)");
}if(word2.equalsIgnoreCase("Invisibility")) {
	
	System.out.println("Potion Of Night Vision, Fermented Spider Eye,(Redstone, Glowstone),(GunPowder, DragonsBreath) Go look at the Night Vision recipe!");
}
if(word2.equalsIgnoreCase("Leaping")) {
	
	System.out.println("Netherwart, RabbitsFoot,(Redstone, Glowstone),(GunPowder, DragonsBreath)");
}
if(word2.equalsIgnoreCase("Slowness")) {
	
	System.out.println("Potion of Swiftness, Fermented Spider Eye, (Redstone, Glowstone),(GunPowder, DragonsBreath) Go look at the Swiftness recipe");
}
if(word2.equalsIgnoreCase("Water Breathing")) {
	
	System.out.println("Netherwart, PufferFish,(Redstone, Glowstone),(GunPowder, DragonsBreath)");
}
if(word2.equalsIgnoreCase("Harming")) {
	
	System.out.println("Poison Or Healing Potion, Fermented Spider Eye,(Redstone, Glowstone),(GunPowder, DragonsBreath)");
}
if(word2.equalsIgnoreCase("Poison")) {
	
	System.out.println("Netherwart, SpiderEye,(Redstone, Glowstone),(GunPowder, DragonsBreath)");
}
if(word2.equalsIgnoreCase("Turtle Master")) {
	
	System.out.println("Netherwart, TurtleHelmet,(Redstone, Glowstone),(GunPowder, DragonsBreath)");
}
if(word2.equalsIgnoreCase("Weakness")) {
	
	System.out.println("WaterBottle, Fermented Spider Eye,(Redstone, Glowstone),(GunPowder, DragonsBreath)");
}
if(word2.equalsIgnoreCase("Slow Falling")) {
	
	System.out.println("Netherwart, PhantomMembrane,(Redstone, Glowstone),(GunPowder, DragonsBreath)");
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

