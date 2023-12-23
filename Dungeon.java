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
		        System.out.println("Position of gold: ");
		        String gold = sc.nextLine();
		         String[] goldarr = adven.split("\\s+");
		         int rowgold=Integer.parseInt(goldarr[0]);
		         int colgold=Integer.parseInt(goldarr[1]);		         			      
			        int count=1;
			        for(int i=1;i<=colgold;i++) {
			        	count++;	
			        }
			        for(int i=rowgold;i>=1;i--) {
			        	count++;	
			        }
			        System.out.println("Minimum number of steps: "+count);
	}

}
