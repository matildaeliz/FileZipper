package homework3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

import homework2.Collection;

public class Operations {
	
	protected boolean tnt = true;
	 
	String source ;
	 String destination ;
	
	String key="";
	
	String base = "";
	
	char keychar[] = {'b', '2', 'l','E', '5','P','7', '8', '9', 'A','a','B','1','C','c','D','d','4','e','F','f','g','G','J','j','K','k','L','3','M','m','N','n','O','o','6','p','R','r','S','s','T','t','U','u','V','v','Y','y','Z','z','X','x','W','w'
			+ '!','"','£','^','$','½','%','&','/','{','[','(',']',')','=','}','*','?','-'};
	
	HashMap<String, String> keys = new HashMap<String, String>();
	
   
    
	
	
	
	ArrayList<String> words = new ArrayList<String>();
	
	ArrayList<String> words1 = new ArrayList<String>();
	
	
	ArrayList<String> newwords = new ArrayList<String>();
	

	ArrayList<String> name = new ArrayList<String>();
	ArrayList<String> name1 = new ArrayList<String>();
	
	ArrayList<String> name2 = new ArrayList<String>();
	
	
	
	public void keygen() {
		
		
		
		for(int i=0; i<74; i++) {
			
			for(int j=0; j<keychar.length; j++) {
				key = base + keychar[j];
			name.add(key);
			
				
			}
				
			if(i<keychar.length) {
				base ="" + keychar[i];
			}
		
			
			
		}
	}
	
	
	

	
	public void keysput() {

		for(int c = 0; c< words.size(); c++) {
				
				keys.put(words.get(c), name.get(c));
			}
	}


	
	public void duplicatesdeleting() {
		 for (String element : words) {
			  
	        
	         if (!newwords.contains(element)) {

	             newwords.add(element);
	         }
	     }
	}



	public void zip() throws Exception {
	System.out.print("this is zip method");
		
	}

	public void unzip() throws Exception {
	System.out.print("this is unzip method");
		
	}


	 
	
}























    
	
	
	
	

