package homework3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import homework2.Collection;

public class Unzip extends Operations {



public void unzip() throws Exception {
	
	
	
Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the Source: ");
	
	 source = sc.next();
	

		System.out.println("Enter the Destination: ");
		
		 destination = sc.next();
	
	
	
	File file = new File(source);
	Scanner in = new Scanner(file);
	
	
	while(in.hasNext()) {
		String word =in.next();	
		words1.add(word);	
	}

	
	File secfile = new File(destination);
	PrintWriter out = new PrintWriter(destination);	
	Scanner c = new Scanner(secfile);
	
	HashMap<String, String> keys2 = new HashMap<String, String>();
	

	

	
	
	
	
	String filem = "";
	
	while(c.hasNext()){ 
		String wording = c.next();
		
		
		if(wording.equals("*")) {
			tnt = false;
			
		}if(tnt == true) {
		
			String TKey = wording.substring(0, wording.indexOf(":"));
			String TValue = wording.substring(wording.indexOf(":")+1);
			
			keys2.put(TKey,TValue);
			
			name1.add(TValue);
			
			
				}
	
	}
	
	


	
	for(int i =0; i <words.size(); i++) {
		
		if(keys.containsKey(words.get(i))) {
			name2.add(keys.get(words.get(i)));
		
		}

		}
		
	
	
	
	
	
	for(int i = 0; i < words1.size(); i++) {
		out.print(words1.get(i) + " ");
		
	}
	
	
	
out.close();










}
	

}

