package fr.codeJB;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class Startup {

	public static void main(String[] args) {
		
		 File file = new File("./dataSet.txt");		 
	        Reader reader;
			try {
				reader = new FileReader(file);
				  BufferedReader br = new BufferedReader(reader);			        
			      String line = "";
			      int total = 0;
			      String[] tabThreeelve = new String[3];
			      int cpt = 0;
			      
			        while((line = br.readLine()) != null) {		
			        	
			        	if(cpt==2) {			        		
			        		System.out.println("first mot"+line);
			        		char[] tabC = line.toCharArray();
			        		
			        			for (int i =0; tabC.length > i; i++) {

					        		for(int y = 0;tabThreeelve[0].toCharArray().length>y;y++) {	

					        			if(tabC[i]==tabThreeelve[0].toCharArray()[y]) { // si j'ai un caractère identique dans le premier tableau

					        				for(int j = 0;tabThreeelve[1].toCharArray().length>j;j++) {	
					        					if(tabC[i]==tabThreeelve[1].toCharArray()[j]) { // si j'ai un caractère identique dans le deuxième tableau
					        						if(Character.isUpperCase(tabC[i])) { // si c'est une majuscule
					        							total += positions(tabC[i]) + 26;
							        					System.out.println(tabC[i]);
							        					y = tabThreeelve[0].toCharArray().length;
							        					i =tabC.length;
							        					j= tabThreeelve[1].toCharArray().length;
							        					}else {
							        					total += positions(tabC[i]) ;
							        					System.out.println(tabC[i]);
							        					y = tabThreeelve[0].toCharArray().length;
							        					i =tabC.length;
							        					j= tabThreeelve[1].toCharArray().length;
							        					}
					        						}
					        					}
					        				}
					        			}

					        		}
			        			cpt = 0;
					        		
					        	}else {
			        		tabThreeelve[cpt]=line;
				        	cpt++;
					        	}
			        	}
			        	
			        	
			        	
//			        	
//			        	
//			        		char[] tabC = line.toCharArray();	        		
//			        		
//				        	for (int i =0; tabC.length/2 > i; i++) {				        		
//				        		for(int y = tabC.length/2;tabC.length>y;y++) {				        			
//				        			if(tabC[i]==tabC[y]) {
//				        				if(Character.isUpperCase(tabC[i])) {
//				        					total += positions(tabC[i]) + 26;
//				        					System.out.println(tabC[i]);
//				        					y = tabC.length;
//				        					i =tabC.length/2;
//				        				}else {
//				        					total += positions(tabC[i]) ;
//				        					System.out.println(tabC[i]);
//				        					y = tabC.length;
//				        					i =tabC.length/2;
//				        				}
//				        			}
//				        		}
//				        		
//				        	}
			        	
			        	
			        br.close();
			        System.out.println("Le total est de : "+total);
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
	      
	}
	
	static int positions(char str)
    {
        
            return str & 31;
        
    }

}
