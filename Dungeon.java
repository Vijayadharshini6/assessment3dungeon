package assessment3game;

import java.util.Scanner;

public class Dungeon {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Dimensions of the dungeon(rows and column): ");
		 String input = sc.nextLine();
         String[] inputs = input.split("\\s+");
         int row=Integer.parseInt(inputs[0]);
         int col=Integer.parseInt(inputs[1]);	     	     
	        System.out.println("Position of adventurer: ");
	        String adven = sc.nextLine();
	         String[] advenarr = adven.split("\\s+");
	         int rowad=Integer.parseInt(advenarr[0]);
	         int colad=Integer.parseInt(advenarr[1]);	
	         System.out.println("Position of monster: ");
		        String mons = sc.nextLine();
		         String[] monsarr = mons.split("\\s+");
		         int rowmons=Integer.parseInt(monsarr[0]);
		         int colmons=Integer.parseInt(monsarr[1]);
		        System.out.println("Position of gold: ");
		        String gold = sc.nextLine();
		         String[] goldarr = gold.split("\\s+");
		         int rowgold=Integer.parseInt(goldarr[0]);
		         int colgold=Integer.parseInt(goldarr[1]);
		         int count=(Math.abs(rowad-rowgold)+Math.abs(colad-colgold));
		         int monscount=(Math.abs(rowmons-rowgold)+Math.abs(colmons-colgold));
		         if(monscount<count) {
			        	System.out.println("No possible solution");
			        }
			        else if(monscount>=count) {
			        System.out.println("Minimum number of steps: "+count);
			        }
	}

}
