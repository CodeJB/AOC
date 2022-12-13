package fr.codeJB;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class Startup {

	public static void main(String[] args) {
		
		 File file = new File("dataSet.txt");		 
	        Reader reader;
			try {
				reader = new FileReader(file);
				  BufferedReader br = new BufferedReader(reader);			        
			        String line;
			        List<Integer> nbCalories = new ArrayList<Integer>();
			        int total = 0;
			        while((line = br.readLine()) != null) {
			        	if(line.length()==0) {
			        		nbCalories.add(total);
			        		total =0;
			        	}else {
			        	total += Integer.parseInt(line);
			        	}
			           
			        }
			        for(int i =0; nbCalories.size()>i; i++) {
			        	System.out.println("Nombre de : "+i);
			        	System.out.println(nbCalories.get(i).toString());
			        	
			        	
			        }
			       
			        Collections.sort(nbCalories);
			        System.out.println("Après tri"+nbCalories.get(nbCalories.size()-1));
			        int tt = nbCalories.get(nbCalories.size()-1)+nbCalories.get(nbCalories.size()-2)+nbCalories.get(nbCalories.size()-3);
			        System.out.println("Le max : "+Collections.max(nbCalories));
			        System.out.println("Super tt "+tt);
//			       
			        br.close();
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
	      
	}

}
