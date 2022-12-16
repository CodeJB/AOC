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
			       String line = "";
			       int cpt =0;
			       int inclu = 0;
			      
			        while((line = br.readLine()) != null) {		
			        	List<Integer> lstPosition = new ArrayList();
			        	String[] lstElves = line.split(",");
			        	for(int i =0; lstElves.length >i;i++) {
			        		String[] position = lstElves[i].split("-");
			        		for(int j =0; position.length>j; j++) {
			        			lstPosition.add(Integer.parseInt(position[j]));
			        		}
			        	}
			        	
			        	System.out.println("Elfe 1 "+ lstPosition.get(0)+" - "+lstPosition.get(1));
			        	System.out.println("Elfe 2 "+ lstPosition.get(2)+" - "+lstPosition.get(3));
			        	if((lstPosition.get(2)>=lstPosition.get(0) && lstPosition.get(3)<=lstPosition.get(1)) || (lstPosition.get(2)<=lstPosition.get(0) && lstPosition.get(3)>=lstPosition.get(1))) {//le deuxième elfe est inclu dans le premier
			        		inclu++;
			        	}
			        }
			        
			        br.close();
			        System.out.println("Le total : "+inclu);
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
	      
	}

}
