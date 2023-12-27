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
//	         System.out.println("Position of monster: ");
//		        String mons = sc.nextLine();
//		         String[] monsarr = mons.split("\\s+");
//		         int rowmons=Integer.parseInt(monsarr[0]);
//		         int colmons=Integer.parseInt(monsarr[1]);
//		         System.out.println("Position of Trigger: ");
//			        String trigger = sc.nextLine();
//			         String[] trigarr = trigger.split("\\s+");
//			         int rowtrig=Integer.parseInt(trigarr[0]);
//			         int coltrig=Integer.parseInt(trigarr[1]);
		        System.out.println("Position of gold: ");
		        String gold = sc.nextLine();
		         String[] goldarr = gold.split("\\s+");
		         int rowgold=Integer.parseInt(goldarr[0]);
		         int colgold=Integer.parseInt(goldarr[1]);
		         System.out.println("Enter the number of pits: ");
		         int nopit=sc.nextInt();
		         sc.nextLine();
		         int[][] pits=new int[nopit][2];
		         for (int i=0;i<nopit;i++) {
		             System.out.println("Position of pit "+(i+1)+": ");
		             String pit = sc.nextLine();
		             String[] pitarr = pit.split("\\s+");
		             pits[i][0] = Integer.parseInt(pitarr[0]);
		             pits[i][1] = Integer.parseInt(pitarr[1]);
		         }		        			        				       
		         int count=(Math.abs(rowad-rowgold)+Math.abs(colad-colgold));
		         boolean pathcount=true;
		         for (int i=0;i<nopit;i++) {
		             if (pathval(rowad,colad,rowgold,colgold,pits[i][0],pits[i][1])) {
		                 pathcount = false;
		                 break;
		             }
		         }
		         if (pathcount) {
		             System.out.println("Minimum number of steps: "+count);
		         } else {
		             System.out.println("No possible solution");
		         }
		     }		    
		     private static boolean pathval(int rowad,int colad,int rowgold,int colgold,int pit1,int pit2) {		       
	return (colad-colgold)*(pit1-colgold)==(rowad-rowgold)*(pit2-colgold)&& Math.min(colgold, pit2)<=colad&&colad<=Math.max(colgold,pit2)
		    &&Math.min(rowgold,pit1)<=rowad&&rowad<=Math.max(rowgold,pit1);
		       }
//		         int monscount=(Math.abs(rowmons-rowgold)+Math.abs(colmons-colgold));
//		         int counttigger = Math.abs(rowad - rowtrig) + Math.abs(colad - coltrig)+ Math.abs(rowgold-rowtrig) + Math.abs(colgold-coltrig);

//		         int i = rowad;
//		         int j = colad;
//		         if(monscount<count) {
//			        	System.out.println("No possible solution");
//			        }
//			        else if(monscount>=count) {
			       // System.out.println("Minimum number of steps: "+counttigger);
//			        while (rowad != rowgold || colad != colgold) {
//		                System.out.print("("+rowad+","+colad+")");
//		                if (colad<colgold) {
//		                    colad++;
//		                } else if (colad>colgold) {
//		                    colad--;
//		                } else if (rowad<rowgold) {
//		                    rowad++;
//		                } else if (rowad>rowgold) {
//		                    rowad--;
//		                }
		               // System.out.print(" ");
		           // }
		          //  System.out.println("("+rowgold+","+colgold+")");
		      
			      //  }
	//}

}
